package com.lucy.ocp;

import java.text.NumberFormat;

public class ETicketValidator implements Validator{
    @Override
    public boolean support(Option option) {
        return Option.ETICKET.getCode() == option.getCode();
    }

    @Override
    public void priceValidate(Production production) {
        if( production.getPrice() > 2_000_000){
            throw new IllegalArgumentException("전자티켓은 200만원을 넘을 수 없습니다.");
        }
        System.out.println(production.getName()+": " + NumberFormat.getInstance().format(production.getPrice())+"원");

    }
}
