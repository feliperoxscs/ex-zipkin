package com.mastertech.usuariocep.client;

import com.mastertech.usuariocep.exceptions.CepNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class UsuarioCepClientErrorDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 400){
            throw new CepNotFoundException();
        }
        else {
            return errorDecoder.decode(s, response);
        }
    }
}
