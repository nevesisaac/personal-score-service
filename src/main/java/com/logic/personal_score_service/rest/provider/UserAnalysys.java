package com.logic.personal_score_service.rest.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logic.personal_score_service.request.RequestUserAnalysys;
import com.logic.personal_score_service.response.ResponseUserAnalysys;
import com.logic.personal_score_service.services.ServiceUsuarioScore;

@RestController
public class UserAnalysys {

    @Autowired
    private ServiceUsuarioScore serviceUsuarioScore;
    
    @GetMapping("/usuario/analysys")
    public ResponseUserAnalysys getAnalysys(RequestUserAnalysys user){
        ResponseUserAnalysys userResponse = serviceUsuarioScore.obterAnaliseService(user);
        return userResponse;
    }
}
