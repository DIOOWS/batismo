package com.example.batismo.controllers;

import com.example.batismo.domain.Dados;
import com.example.batismo.repository.DadosRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DadosController {

    @Autowired
    private DadosRepository dadosRepository;

    private static final Logger logger = LoggerFactory.getLogger(DadosController.class);

    @PostMapping("/dados/salvar")  // Endpoint correto "/salvar"

    public Dados salvar(@RequestBody Dados dados){

        logger.info("Recebendo dados para salvar: " + dados);
        System.out.println(dados);
        Dados savedData = dadosRepository.save(dados);
        logger.info("Dados salvos no banco: " + savedData);

        return savedData;
    }

}
