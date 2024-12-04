package com.logic.personal_score_service.rest.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logic.personal_score_service.request.RequestBusinessAnalysys;
import com.logic.personal_score_service.response.ResponseBusinessAnalysys;
import com.logic.personal_score_service.services.ServiceBusinessScore;


@RestController
public class BusinessAnalysis {
    @Autowired
    private ServiceBusinessScore serviceBusinessScore;
    
    @GetMapping("/business/avaliation")
    public ResponseBusinessAnalysys getAvaliation(RequestBusinessAnalysys user){
        ResponseBusinessAnalysys response = serviceBusinessScore.obterAnaliseService(user);
        return response;
    }
}
