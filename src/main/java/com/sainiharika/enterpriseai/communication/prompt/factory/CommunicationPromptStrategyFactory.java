package com.sainiharika.enterpriseai.communication.prompt.factory;

import com.sainiharika.enterpriseai.communication.model.CommunicationType;
import com.sainiharika.enterpriseai.communication.prompt.CommunicationPromptStrategy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CommunicationPromptStrategyFactory {

    private final Map<CommunicationType, CommunicationPromptStrategy> strategyMap;

    public CommunicationPromptStrategyFactory(List<CommunicationPromptStrategy> strategies) {
        this.strategyMap = strategies.stream()
                .collect(Collectors.toMap(
                        CommunicationPromptStrategy::getCommunicationType,
                        Function.identity()
                ));;
    }

    public CommunicationPromptStrategy getStrategy(CommunicationType communicationType) {
        return strategyMap.get(communicationType);
    }
}
