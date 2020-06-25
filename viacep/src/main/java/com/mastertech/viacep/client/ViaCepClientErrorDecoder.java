package com.mastertech.viacep.client;

import com.mastertech.viacep.exceptions.CepNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class ViaCepClientErrorDecoder implements ErrorDecoder {

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
