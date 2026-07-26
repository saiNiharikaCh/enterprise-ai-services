package com.sainiharika.enterpriseai.common.ai.prompt.impl;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.model.PromptTemplate;
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
    public String render(PromptDefinition promptDefinition) {
        try {
            String templateStr =  loadTemplate(promptDefinition.getPromptTemplate());
            ST st = new ST(templateStr);
            Map<String, Object> variables = promptDefinition.getVariables();
            variables.forEach((key, value) -> {
                st.add(key, value);
            });
            return st.render();
        } catch (IOException ex) {
            throw new RuntimeException( "Unable to load prompt template",
                    ex);
        }
    }

    private String loadTemplate(PromptTemplate promptTemplate) throws IOException {
        String template = null;
        ClassPathResource  resource = new ClassPathResource("/prompts/" + promptTemplate.getTemplateName() + ".st");
        if(resource != null){
            InputStream inputStream = resource.getInputStream();
            template = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        }
        return template;
    }
}
