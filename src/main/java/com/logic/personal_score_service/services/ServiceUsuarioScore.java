package com.logic.personal_score_service.services;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.personal_score_service.request.RequestScriptJudicy;
import com.logic.personal_score_service.request.RequestUserAnalysysScore;
import com.logic.personal_score_service.response.ResponseScriptJudicy;
import com.logic.personal_score_service.response.ResponseUserAnalysysScore;
import com.logic.personal_score_service.rest.consumer.ConsumerJustice;

import reactor.core.publisher.Mono;

@Service
public class ServiceUsuarioScore {

    @Autowired
    ConsumerJustice consumerJustice;

    public ResponseUserAnalysysScore obterAnaliseService(RequestUserAnalysysScore user){
        //TODO: Valida campos 
        ResponseScriptJudicy responseJudicy =  consumerJustice.buscarProcesso(new RequestScriptJudicy());
        System.out.println(responseJudicy.getFact() + "pif" + responseJudicy.getLength());
        //TODO: executa analise da ia de acordo com dados passados + resultados dos scripts 
        //TODO: Monta Resposta
        
        return new ResponseUserAnalysysScore(50, "Gato", responseJudicy.getFact());
    }    
}
