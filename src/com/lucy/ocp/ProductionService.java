package com.lucy.ocp;

import java.security.Provider;
import java.util.Collections;

public class ProductionService {

    public void update(Production production, int price) {
        production.updatePrice(price);
    }

    public void validate(Production p){
        ProductionValidator productionValidator = new ProductionValidator();
        productionValidator.valiate(p);
    }
}
