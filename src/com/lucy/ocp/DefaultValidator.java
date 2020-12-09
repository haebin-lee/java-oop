package com.lucy.ocp;

import java.text.NumberFormat;

public class DefaultValidator implements Validator{

    @Override
    public boolean support(Option option) {
        return Option.NORMAL.getCode() == option.getCode();
    }

    @Override
    public void priceValidate(Production production) {
        if( production.getPrice() > 500_000){
            throw new IllegalArgumentException("일반 상품은 50만원을 넘을 수 없습니다.");
        }
        System.out.println(production.getName()+": " + NumberFormat.getInstance().format(production.getPrice())+"원");
    }
}
