package com.sainiharika.enterpriseai.common.ai.prompt;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;

public interface PromptTemplateEngine {

    String render(PromptDefinition promptDefinition);
}
