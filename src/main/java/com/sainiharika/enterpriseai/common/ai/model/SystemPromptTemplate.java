package com.sainiharika.enterpriseai.common.ai.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Getter
@AllArgsConstructor
public enum SystemPromptTemplate implements PromptTemplate {

    COMMUNICATION_SYSTEM("communication-system"),
    RESUME_SYSTEM("resume-system");


    private final String templateName;

    @Override
    public String getFileName() {
        return "/prompts/systemPrompts/" + getTemplateName() + ".st";
    }
}
