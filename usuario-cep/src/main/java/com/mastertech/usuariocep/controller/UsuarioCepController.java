package com.mastertech.usuariocep.controller;

import com.mastertech.usuariocep.dto.UsuarioCepResponse;
import com.mastertech.usuariocep.mapper.UsuarioCepMapper;
import com.mastertech.usuariocep.service.UsuarioCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioCepController {

    @Autowired
    private UsuarioCepService usuarioCepService;

    @GetMapping("/consulta/{usuario}/{cep}")
    public UsuarioCepResponse getCepData(@PathVariable String usuario, @PathVariable String cep ) {
        return UsuarioCepMapper.to(usuarioCepService.getCepData(cep), usuario);
    }
}
