package com.sainiharika.enterpriseai.common.ai.provider.resolver.impl;

import com.sainiharika.enterpriseai.common.ai.config.AIProperties;
import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.provider.AIProvider;
import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;
import com.sainiharika.enterpriseai.common.ai.provider.resolver.AIProviderResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AIProviderResolverImpl implements AIProviderResolver {

    private final AIProperties aiProperties;

    @Override
    public AIProviderType resolve() {
        return aiProperties.getProviderType();
    }
}
