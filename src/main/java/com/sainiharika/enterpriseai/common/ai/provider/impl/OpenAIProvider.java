package com.sainiharika.enterpriseai.common.ai.provider.impl;

import com.sainiharika.enterpriseai.common.ai.model.AIRequest;
import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.provider.AIProvider;
import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;

public class OpenAIProvider implements AIProvider {

    @Override
    public AIProviderType getAIProviderType() {
        return AIProviderType.OPEN_AI_PROVIDER;
    }

    @Override
    public String generate(AIRequest aiRequest) {
        return "Open AI Response";
    }
}
