package com.afei.gmall.common.exception;


import com.afei.gmall.common.enums.UnicomResponseEnums;

/**
 * @program: 测试
 * @description:自定义异常
 * @author:
 * @create: 2018-10-17 08:57
 **/
public class UnicomRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    protected String code;

    protected String msg;

    protected String message;//打印出的日志信息

    public UnicomRuntimeException(UnicomResponseEnums enums, String message) {
        super();
        this.code = enums.getCode();
        this.msg = enums.getMsg();
        this.message = message;
    }

    public UnicomRuntimeException(UnicomResponseEnums enums) {
        super();
        this.code = enums.getCode();
        this.msg = enums.getMsg();
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




    public UnicomRuntimeException() {
        super();
    }

    public UnicomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnicomRuntimeException(String message) {
        super(message);
    }

}
