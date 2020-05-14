package com.yuan.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service//加入到spring的容器中，不是注册
public class UserService {

    //去注册中心拿到我们的服务
    @Reference()//引用 pom坐标，定义路径相同的接口名
    TicketService TICKET_SERVICE;



    public void buyTicket(){
        String ticket = TICKET_SERVICE.getTicket();
        System.out.println("在注册中心拿到票"+ticket);
    }

}
