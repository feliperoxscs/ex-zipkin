package com.mastertech.usuariocep.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class UsuarioCepClientConfiguration {

    @Bean
    public ErrorDecoder getErrorDecoder(){
        return new UsuarioCepClientErrorDecoder();
    }
}
