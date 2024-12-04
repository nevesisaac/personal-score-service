package com.logic.personal_score_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class DadosAnaliseUsuarioEmpresa {
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("telefone")
    private String telefone;
}
