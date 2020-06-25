package com.mastertech.viacep.controller;

import com.mastertech.viacep.dto.CepResponse;
import com.mastertech.viacep.mapper.CepMapper;
import com.mastertech.viacep.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {

    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/consulta/{cep}")
    public CepResponse getCepData(@PathVariable String cep) {
        return CepMapper.to(viaCepService.getCepData(cep));
    }
}
