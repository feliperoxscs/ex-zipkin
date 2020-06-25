package com.mastertech.viacep.service;

import com.mastertech.viacep.client.ViaCepClient;
import com.mastertech.viacep.model.Cep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    @Autowired
    private ViaCepClient viaCepClient;


    public Cep getCepData(String cep) {
        return viaCepClient.getCepData(cep);
    }
}
