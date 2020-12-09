package com.lucy.ocp;

public class Main {

    public static void main(String[] args){

        Production appleBoxes = new Production(Option.LOCAL, "사과 100박스", 2_000_000);
        Production tickets = new Production(Option.ETICKET, "티켓 100장", 200_000);

        ProductionService service = new ProductionService();
        service.validate(tickets);
        service.validate(appleBoxes);
    }
}
