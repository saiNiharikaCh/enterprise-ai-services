package com.sainiharika.enterpriseai.common.ai.prompt;

import com.sainiharika.enterpriseai.common.ai.model.AIRequest;
import com.sainiharika.enterpriseai.common.ai.model.RenderedPrompt;

public interface PromptTemplateEngine {

    RenderedPrompt render(AIRequest aiRequest);
}
