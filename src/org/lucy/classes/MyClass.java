package org.lucy.classes;

class MyClass {
    private String myClassId = "20";
    void myMethod() {
        System.out.println("MyClass myMethod()");
    }
    class InnerClass{
        void innerClassMethod() {
            MyClass.this.myMethod(); //숨은 외부 참조가 있기 때문에 가능
            System.out.println("MyClass.myClassId="+myClassId);
        }
    }

    static class InnerStaticClass{
        void innerClassMethod() {
            //MyClass.this.myMethod(); //컴파일 에러

            //System.out.println("MyClass.myClassId="+ myClassId);// 컴파일 에러

        }
    } //내부 클래스에 static이 붙는다면?
}

/*
* 멤버클래스가 공개된 클래스의 public 이나 protected 멤버라면 정적이냐 아니냐는 두 배로 중요해진다.
* 멤버 클래스 역시 공개 API가 되니 혹시라도 향후 릴리스에서 static을 붙이면 하위 호환성이 깨진다.
*
* static을 붙이기 위해서 바꿔줘야 할 내용
* 1. non-static 멤버 클래스 내부에서 상위 클래스의 메소드를 호출하는 경우 수정 필요
* 2. 숨은 외부 참조 형태로 호출을 했었지만 직접적으로 인스턴스를 만드는 형태로 변경해야함
* */