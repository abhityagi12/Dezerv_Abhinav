package com.fluxkart.fluxkartbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fluxkart.fluxkartbackend.model.IdentifyRequest;
import com.fluxkart.fluxkartbackend.model.IdentifyResponse;
import com.fluxkart.fluxkartbackend.service.IdentifyService;

@RestController
public class MainController {

    @Autowired
    private IdentifyService identityService;
    
    @PostMapping("/identify")
    public ResponseEntity<IdentifyResponse> identifyContact(@RequestBody IdentifyRequest request) {
        // Delegate the identity reconciliation logic to the service
        IdentifyResponse response = identityService.identifyContact(request);
        return ResponseEntity.ok(response);
    }
}
