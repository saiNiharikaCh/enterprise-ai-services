package com.sainiharika.enterpriseai.common.ai.prompt.impl;

import com.sainiharika.enterpriseai.common.ai.model.*;
import com.sainiharika.enterpriseai.common.ai.prompt.PromptTemplateEngine;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.stringtemplate.v4.ST;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Component
public class StringTemplatePromptEngine implements PromptTemplateEngine {

    @Override
    public RenderedPrompt render(AIRequest aiRequest) {
        try {

            String userTemplateStr =  loadTemplate(aiRequest.getPromptDefinition().getUserPromptTemplate());
            String userRenderedStr = render(userTemplateStr, aiRequest.getPromptDefinition().getVariables());

            String systemTemplateStr = loadTemplate(aiRequest.getPromptDefinition().getSystemPromptTemplate());
            String systemRenderedStr = render(systemTemplateStr, aiRequest.getPromptDefinition().getVariables());

            return RenderedPrompt.builder()
                    .userPromptStr(userRenderedStr)
                    .systemPromptStr(systemRenderedStr)
                    .build();
        } catch (IOException ex) {
            throw new RuntimeException( "Unable to load prompt template",
                    ex);
        }
    }

    private String render(String templateStr, Map<String, Object> variables){
        ST st = new ST(templateStr);
        variables.forEach((key, value) -> {
            st.add(key, value);
        });
        return st.render();
    }

    private String loadTemplate(PromptTemplate promptTemplate) throws IOException {
        String template = null;
        ClassPathResource  resource = new ClassPathResource(promptTemplate.getFileName());
        if(resource != null){
            InputStream inputStream = resource.getInputStream();
            template = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        }
        return template;
    }
}
