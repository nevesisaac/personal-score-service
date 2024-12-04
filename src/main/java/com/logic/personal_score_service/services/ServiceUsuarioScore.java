package com.logic.personal_score_service.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.personal_score_service.request.RequestUserAnalysys;
import com.logic.personal_score_service.response.ResponseUserAnalysys;
import com.logic.personal_score_service.response.extern.ResponseScriptJudicy;
import com.logic.personal_score_service.rest.consumer.ConsumerJustice;



@Service
public class ServiceUsuarioScore {

    @Autowired
    ConsumerJustice consumerJustice;

    private static final Logger logger = LoggerFactory.getLogger(ServiceUsuarioScore.class);

    
    public ResponseUserAnalysys obterAnaliseService(RequestUserAnalysys user){
        //TODO: Valida campos 
        ResponseScriptJudicy responseJudicy =  consumerJustice.buscarProcessos();
        //TODO: executa analise da ia de acordo com dados passados + resultados dos scripts 
        //TODO: Monta Resposta
        
        return new ResponseUserAnalysys(50, responseJudicy.getFact());
    }    
}
