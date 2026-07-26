package com.sainiharika.enterpriseai.common.ai.provider;

import com.sainiharika.enterpriseai.common.ai.model.AIRequest;
import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;

public interface AIProvider {

    AIProviderType getAIProviderType();

    String generate(AIRequest aiRequest);

}
