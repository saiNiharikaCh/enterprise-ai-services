package com.sainiharika.enterpriseai.communication.service;

import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationRequest;
import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationResponse;

public interface CommunicationService {

    GenerateCommunicationResponse generateEmail(GenerateCommunicationRequest request);
}
