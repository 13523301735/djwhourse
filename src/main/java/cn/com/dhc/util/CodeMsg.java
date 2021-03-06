package cn.com.dhc.util;

public class CodeMsg {

    private int code;
    private String msg;

    //通用的错误码
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常：%s");
    //登录模块 5002XX

    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500215, "用户名或者密码错误。");

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }


    public CodeMsg(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}