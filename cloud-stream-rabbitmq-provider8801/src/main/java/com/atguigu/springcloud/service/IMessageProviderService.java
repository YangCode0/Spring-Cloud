package com.atguigu.springcloud.service;

/**
 * @author wzy
 */
public interface IMessageProviderService {
    /**
     * 定义消息的推送管道
     *
     * @return
     */
    String send();
}
