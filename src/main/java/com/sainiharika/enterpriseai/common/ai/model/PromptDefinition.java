package com.sainiharika.enterpriseai.common.ai.model;

import lombok.*;

import java.util.Map;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PromptDefinition {

    private final SystemPromptTemplate systemPromptTemplate;

    private final UserPromptTemplate userPromptTemplate;

    private final Map<String, Object> variables;
}
