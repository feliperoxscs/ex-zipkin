package com.mastertech.viacep.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class ViaCepClientConfiguration {

    @Bean
    public ErrorDecoder getErrorDecoder() {
        return new ViaCepClientErrorDecoder();
    }
}
