package com.lucy.ocp;

import java.text.NumberFormat;

public class LocalValidator implements Validator{
    @Override
    public boolean support(Option option) {
        return Option.LOCAL.getCode() == option.getCode();
    }

    @Override
    public void priceValidate(Production production) {
        if( production.getPrice() > 1_000_000){
            throw new IllegalArgumentException("지역상품은 100만원을 넘을 수 없습니다.");
        }
        //TODO: 아래 코드가 반복되는데 반복을 줄일 수 있는 방법은?
        System.out.println(production.getName()+": " +NumberFormat.getInstance().format(production.getPrice())+"원");
    }
}
