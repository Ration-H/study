package common;

public enum MyEnum{
    DATA_EXCEPTION (10100,"成绩异常");

    private int code;
    private String message;

     MyEnum(int code,String message){
         this.code = code;
         this.message = message;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
