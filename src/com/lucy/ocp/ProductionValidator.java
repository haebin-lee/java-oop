package com.lucy.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//TODO: ProductionValidator를 싱글톤으로 바꾸면 좋을듯!!

public class ProductionValidator {

    List<Validator> validators = Arrays.asList(new DefaultValidator(), new ETicketValidator(), new LocalValidator());

    public void valiate (Production p ){
        Optional<Validator> validator = validators.stream()
                .filter(v-> v.support(p.getOption()))
                .findFirst();

        // TODO: 아래는 java9 이상부터 쓸수 있는데 java8에서의 방법은 없을까
        validator.ifPresentOrElse(v -> v.priceValidate(p), IllegalArgumentException::new);
    }
}
