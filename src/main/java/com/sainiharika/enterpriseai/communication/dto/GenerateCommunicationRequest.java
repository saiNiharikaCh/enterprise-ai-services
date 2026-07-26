package com.sainiharika.enterpriseai.communication.dto;

import com.sainiharika.enterpriseai.communication.model.CommunicationType;
import com.sainiharika.enterpriseai.communication.model.Tone;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenerateCommunicationRequest {

    private String recipientId;

    private CommunicationType communicationType;

    private String reason;

    private LocalDate startDate;

    private LocalDate endDate;

    private Tone tone;

    private String subject;
}
