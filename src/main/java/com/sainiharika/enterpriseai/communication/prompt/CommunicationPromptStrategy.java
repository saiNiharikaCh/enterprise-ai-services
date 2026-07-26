package com.sainiharika.enterpriseai.communication.prompt;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationRequest;
import com.sainiharika.enterpriseai.communication.model.CommunicationType;

public interface CommunicationPromptStrategy {

    CommunicationType getCommunicationType();

    PromptDefinition buildPrompt(GenerateCommunicationRequest request);

}
