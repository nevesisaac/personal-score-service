package com.logic.personal_score_service.rest.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logic.personal_score_service.request.RequestUserAnalysysScore;
import com.logic.personal_score_service.response.ResponseUserAnalysysScore;
import com.logic.personal_score_service.services.ServiceUsuarioScore;

@RestController
public class UsuarioScore {

    @Autowired
    private ServiceUsuarioScore serviceUsuarioScore;
    
    @GetMapping("/score")
    public ResponseUserAnalysysScore getScore(RequestUserAnalysysScore user){
        ResponseUserAnalysysScore userResponse = serviceUsuarioScore.obterAnaliseService(user);
        return userResponse;
    }
}
