package com.logic.personal_score_service.rest.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.logic.personal_score_service.request.RequestScriptJudicy;
import com.logic.personal_score_service.response.ResponseScriptJudicy;

@Service
public class ConsumerJustice {

    @Autowired
    private WebClient webClient;

    public ResponseScriptJudicy buscarProcesso(RequestScriptJudicy userJudicy) {
        return this.webClient.get().uri("/fact").retrieve().bodyToMono(ResponseScriptJudicy.class).block();
    }
}
