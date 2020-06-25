package com.mastertech.usuariocep.client;

import com.mastertech.usuariocep.model.UsuarioCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "viacep", configuration = UsuarioCepClientConfiguration.class)
public interface UsuarioCepClient {

    @RequestMapping("/consulta/{cep}")
    UsuarioCep getCepData(@PathVariable String cep);
}
