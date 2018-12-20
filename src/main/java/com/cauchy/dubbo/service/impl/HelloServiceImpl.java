package com.cauchy.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cauchy.dubbo.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		
		return "Hello " + name;
	}

}
