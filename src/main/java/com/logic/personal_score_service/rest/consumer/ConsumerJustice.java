package com.logic.personal_score_service.rest.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.logic.personal_score_service.response.extern.ResponseScriptJudicy;

@Service
public class ConsumerJustice {

    @Autowired
    private WebClient webClient;

    public ResponseScriptJudicy buscarProcessos() {
        return this.webClient.get().uri("/").retrieve().bodyToMono(ResponseScriptJudicy.class).block();
    }
}
