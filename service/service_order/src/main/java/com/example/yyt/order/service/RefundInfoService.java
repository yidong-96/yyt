package com.example.yyt.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yyt.model.order.PaymentInfo;
import com.example.yyt.model.order.RefundInfo;

public interface RefundInfoService extends IService<RefundInfo> {

    /**
     * 保存退款记录
     * @param paymentInfo
     */
    RefundInfo saveRefundInfo(PaymentInfo paymentInfo);
}
