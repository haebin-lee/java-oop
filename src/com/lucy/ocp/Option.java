package com.lucy.ocp;

public enum Option {

    NORMAL("N", "일반 상품")
    , ETICKET("E", "전자티켓 상품")
    , LOCAL("L", "지역 상품")
    ;
    private String code;
    private String desc;

    Option(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
