package com.mastertech.usuariocep.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "CEP não encontrado")
public class CepNotFoundException extends RuntimeException {
}
