package com.mastertech.usuariocep.mapper;

import com.mastertech.usuariocep.dto.UsuarioCepResponse;
import com.mastertech.usuariocep.model.UsuarioCep;

public class UsuarioCepMapper {

    public static UsuarioCepResponse to(UsuarioCep usuarioCep, String nome) {
        UsuarioCepResponse usuarioCepResponse = new UsuarioCepResponse();
        usuarioCepResponse.setNome(nome);
        usuarioCepResponse.setBairro(usuarioCep.getBairro());
        usuarioCepResponse.setLocalidade(usuarioCep.getLocalidade());
        usuarioCepResponse.setRua(usuarioCep.getRua());
        usuarioCepResponse.setUf(usuarioCep.getUf());
        return  usuarioCepResponse;
    }
}
