package com.util.sms;

public class SmsCodeUtilImpl implements SmsCodeUtil{

    private String domain = "http://dkh.jmyssc.com:81";
    private String username = "qwert";
    private String password = "Qwerty001";
    private String projectId = "";
    private String token = "Qwerty001";

    public SmsCodeUtilImpl(String projectId){
        this.projectId = projectId;
        token = HttpUtil.sendGet(domain+"/service.asmx/UserLoginStr", "name=" + username + "&psw=" + password);
    }

    @Override
    public boolean getPhone() {
        HttpUtil.sendGet(domain+"/service.asmx/GetHM2Str","token="+token+"&xmid="+projectId);
        return false;
    }


    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getCodeSyn() {
        return null;
    }
}
