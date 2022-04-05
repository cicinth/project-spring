package com.revisao.banco.revisaoBanco.utils.validacoes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class ValidacaoBatata implements ConstraintValidator<BATATA, String> {
    @Override
    public void initialize(BATATA constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !Objects.equals(value, "batata") && !Objects.equals(value, "BATATA");
    }
}
