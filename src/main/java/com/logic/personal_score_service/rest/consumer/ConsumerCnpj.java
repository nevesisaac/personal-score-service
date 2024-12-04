package com.logic.personal_score_service.rest.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.logic.personal_score_service.response.extern.ResponseCnpjAnalysys;

@Service
public class ConsumerCnpj {
    
    @Autowired
    private WebClient webClientBrasilApi;

    public ResponseCnpjAnalysys getDataCnpj(String cnpj) {
        return this.webClientBrasilApi.get().uri("/cnpj/v1/" + cnpj).retrieve().bodyToMono(ResponseCnpjAnalysys.class).block();
    }
}
