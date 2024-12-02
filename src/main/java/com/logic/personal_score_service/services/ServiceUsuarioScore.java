package com.logic.personal_score_service.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.personal_score_service.request.RequestScriptJudicy;
import com.logic.personal_score_service.request.RequestUserAnalysysScore;
import com.logic.personal_score_service.response.ResponseScriptJudicy;
import com.logic.personal_score_service.response.ResponseUserAnalysysScore;
import com.logic.personal_score_service.rest.consumer.ConsumerJustice;



@Service
public class ServiceUsuarioScore {

    @Autowired
    ConsumerJustice consumerJustice;

    private static final Logger logger = LoggerFactory.getLogger(ServiceUsuarioScore.class);

    
    public ResponseUserAnalysysScore obterAnaliseService(RequestUserAnalysysScore user){
        //TODO: Valida campos 
        ResponseScriptJudicy responseJudicy =  consumerJustice.buscarProcesso(new RequestScriptJudicy());
        //TODO: executa analise da ia de acordo com dados passados + resultados dos scripts 
        //TODO: Monta Resposta
        
        return new ResponseUserAnalysysScore(50, "Gato", responseJudicy.getFact());
    }    
}
