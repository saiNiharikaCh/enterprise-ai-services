package com.sainiharika.enterpriseai.common.ai.provider.resolver;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.provider.AIProvider;
import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;

public interface AIProviderResolver {

    AIProviderType resolve();
}
