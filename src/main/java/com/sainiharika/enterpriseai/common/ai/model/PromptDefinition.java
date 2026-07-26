package com.sainiharika.enterpriseai.common.ai.model;

import lombok.*;

import java.util.Map;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PromptDefinition {

    private final PromptTemplate promptTemplate;

    private final Map<String, Object> variables;
}
