package com.example.batismo.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dados{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idade")
    private int idade;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("nomePai")
    private String nomePai;

    @JsonProperty("nomeMae")
    private String nomeMae;

    @JsonProperty("nomeLider")
    private String nomeLider;

    @JsonProperty("rede")
    private String rede;


}
