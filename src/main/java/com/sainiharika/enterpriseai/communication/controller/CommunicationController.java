package com.sainiharika.enterpriseai.communication.controller;

import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationRequest;
import com.sainiharika.enterpriseai.communication.dto.GenerateCommunicationResponse;
import com.sainiharika.enterpriseai.communication.service.CommunicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/communications")
@RequiredArgsConstructor
public class CommunicationController {

    private final CommunicationService communicationService;

    @PostMapping("/generate")
    public ResponseEntity<GenerateCommunicationResponse> generate(
            @RequestBody GenerateCommunicationRequest request) {

        return ResponseEntity.ok(communicationService.generateEmail(request));
    }
}
