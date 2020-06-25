package com.mastertech.viacep.client;

import com.mastertech.viacep.model.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ViaCepClient {

    @RequestMapping("/ws/{cep}/json/")
    public Cep getCepData(@PathVariable String cep);
}
