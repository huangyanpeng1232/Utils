package com.util.sms;

public interface SmsCodeUtil {
    // 发送验证码
    boolean getPhone();

    // 获取验证码
    String getCode();

    // 获取验证码阻塞
    String getCodeSyn();

}
