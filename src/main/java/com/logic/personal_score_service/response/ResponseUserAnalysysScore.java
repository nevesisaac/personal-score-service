package com.logic.personal_score_service.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseUserAnalysysScore {

    @JsonProperty("score")
    private int internalScore;

    @JsonProperty("reason")
    private String reasonsScore; 

    @JsonProperty("Ai_indication")
    private String aiResponse;
    
}
