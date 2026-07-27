package com.sainiharika.enterpriseai.common.ai.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class AIRequest {
    private PromptDefinition promptDefinition;

}
