package com.lucy.enums;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    // 상수의 선언 순서를 바꾸는 순간 numberOfMusicians는 오동작하고,
    // 이미 사용중인 정수와 같은 상수는 추가할 방법이 없다. 절대 이렇게 써선 안된다
    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
