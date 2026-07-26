package com.sainiharika.enterpriseai.common.ai.provider.impl;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.prompt.PromptTemplateEngine;
import com.sainiharika.enterpriseai.common.ai.provider.AIProvider;
import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OllamaAIProvider implements AIProvider {

    private final ChatClient chatClient;

    private final PromptTemplateEngine templateEngine;

    @Override
    public AIProviderType getAIProviderType() {
        return AIProviderType.OLLAMA_PROVIDER;
    }

    @Override
    public String generate(PromptDefinition promptDefinition) {
        String promptStr = templateEngine.render(promptDefinition);
        return chatClient.prompt()
                .user(promptStr)
                .call()
                .content();
    }

}
