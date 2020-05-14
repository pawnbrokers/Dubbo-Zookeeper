package com.yuan.service;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service//这个是dubbo的service注解，项目已启动就会自动注册到注册中心
@Component//尽量不要再使用service
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "袁堂波在学习zookeeper+dubbo";
    }
}
