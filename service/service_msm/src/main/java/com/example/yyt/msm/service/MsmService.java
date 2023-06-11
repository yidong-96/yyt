package com.example.yyt.msm.service;

import com.example.yyt.vo.msm.MsmVo;

public interface MsmService {

    //发送手机验证码
    boolean send(String phone, String code);

    //mq使用发送短信
    boolean send(MsmVo msmVo);
}
