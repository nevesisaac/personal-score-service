package com.logic.personal_score_service.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.personal_score_service.request.RequestBusinessAnalysys;
import com.logic.personal_score_service.response.ResponseBusinessAnalysys;
import com.logic.personal_score_service.response.extern.ResponseCnpjAnalysys;
import com.logic.personal_score_service.rest.consumer.ConsumerCnpj;

@Service
public class ServiceBusinessScore {
    
    @Autowired
    ConsumerCnpj consumerCnpj;

    private static final Logger logger = LoggerFactory.getLogger(ServiceUsuarioScore.class);

    
    public ResponseBusinessAnalysys obterAnaliseService(RequestBusinessAnalysys user){
        //TODO: Valida campos 
        ResponseCnpjAnalysys responseDataCnpj =  consumerCnpj.getDataCnpj(user.getCnpj());
        //TODO: executa analise da ia de acordo com dados passados + resultados dos scripts 
        //TODO: Monta Resposta
        
        return new ResponseBusinessAnalysys(50, responseDataCnpj.getAtributos().toString());
    }    
}
