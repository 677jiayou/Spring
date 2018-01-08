package com.pojo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testMain {
    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext axt=new ClassPathXmlApplicationContext("bean.xml");
        //获取HelloWorld实例
        HelloWorld hw=axt.getBean("HelloWorld",HelloWorld.class);
        hw.setMes("hello 李佳奇！");
        HelloWorld hw1=axt.getBean("HelloWorld",HelloWorld.class);
        //调用方法/
        hw.say();
        hw1.say();
    }
}
