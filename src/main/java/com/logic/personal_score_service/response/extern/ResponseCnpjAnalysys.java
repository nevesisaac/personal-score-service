package com.logic.personal_score_service.response.extern;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseCnpjAnalysys {
    @JsonProperty("uf")
    private String unidadeFederativa;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("descricao_situacao_cadastral")
    private String atributos;

}
