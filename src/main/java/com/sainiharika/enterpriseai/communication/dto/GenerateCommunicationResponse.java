package com.sainiharika.enterpriseai.communication.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenerateCommunicationResponse {

    private String subject;
    private String body;
    private String signature;
}
