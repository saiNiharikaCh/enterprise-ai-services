package com.sainiharika.enterpriseai.common.ai.config;

import com.sainiharika.enterpriseai.common.ai.provider.AIProviderType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="ai")
public class AIProperties {

    private AIProviderType providerType;
}
