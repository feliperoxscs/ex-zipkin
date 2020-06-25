package com.mastertech.viacep.mapper;

import com.mastertech.viacep.dto.CepResponse;
import com.mastertech.viacep.model.Cep;

public class CepMapper {

    public static CepResponse to(Cep cep) {
        CepResponse cepResponse = new CepResponse();
        cepResponse.setBairro(cep.getBairro());
        cepResponse.setLocalidade(cep.getLocalidade());
        cepResponse.setRua(cep.getRua());
        cepResponse.setUf(cep.getUf());
        return cepResponse;
    }
}
