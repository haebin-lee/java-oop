package com.lucy.ocp;

public interface Validator {
    boolean support(Option option);
    void priceValidate(Production production);
}
