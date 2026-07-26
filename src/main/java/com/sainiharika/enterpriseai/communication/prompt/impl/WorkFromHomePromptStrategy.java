package com.sainiharika.enterpriseai.communication.prompt.impl;

import com.sainiharika.enterpriseai.common.ai.model.PromptDefinition;
import com.sainiharika.enterpriseai.common.ai.model.PromptTemplate;
import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationRequest;
import com.sainiharika.enterpriseai.communication.model.CommunicationType;
import com.sainiharika.enterpriseai.communication.model.Tone;
import com.sainiharika.enterpriseai.communication.prompt.CommunicationPromptStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WorkFromHomePromptStrategy implements CommunicationPromptStrategy {

    @Override
    public CommunicationType getCommunicationType() {
        return CommunicationType.WORK_FROM_HOME;
    }

    @Override
    public PromptDefinition buildPrompt(GenerateCommunicationRequest request) {
        return PromptDefinition.builder()
                .promptTemplate(PromptTemplate.WORK_FROM_HOME)
                .variables(Map.of("recipientId",request.getRecipientId()
                        ,"reason",request.getReason()
                        ,"startDate",request.getStartDate()
                        ,"endDate", request.getEndDate()
                        ,"tone", Tone.PROFESSIONAL.name()))
                .build();
    }
}
