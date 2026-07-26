package com.sainiharika.enterpriseai.common.ai.provider.factory;

import com.sainiharika.enterpriseai.common.ai.provider.AIProvider;
import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class AIProviderFactory {

    private Map<AIProviderType, AIProvider> aiProviderMap;

    AIProviderFactory(List<AIProvider> aiProviders){
        aiProviderMap = aiProviders.stream().collect(Collectors.toMap(e -> e.getAIProviderType(), e -> e));
    }

    public AIProvider getProvider(AIProviderType type){
        return aiProviderMap.get(type);
    }

}
