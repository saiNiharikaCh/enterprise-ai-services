package com.sainiharika.enterpriseai.common.ai.model;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class RenderedPrompt {

    private String userPromptStr;

    private String systemPromptStr;

}
