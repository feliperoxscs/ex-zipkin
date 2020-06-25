package com.mastertech.usuariocep.service;

import com.mastertech.usuariocep.client.UsuarioCepClient;
import com.mastertech.usuariocep.model.UsuarioCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCepService {


    @Autowired
    private UsuarioCepClient usuarioCepClient;


    public UsuarioCep getCepData(String cep) {
        return usuarioCepClient.getCepData(cep);
    }
}
