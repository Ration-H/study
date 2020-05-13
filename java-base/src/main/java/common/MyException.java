package common;

//自定义异常
public class MyException extends Exception {

    private MyEnum myEnum;

    public MyException(MyEnum myEnum){
        this.myEnum=myEnum;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }
}
