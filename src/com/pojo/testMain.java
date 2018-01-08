package com.pojo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    public static void main(String[] args) {
        XmlBeanFactory
        //创建Spring上下文（加载bean.xml）
        ApplicationContext axt=new ClassPathXmlApplicationContext("bean.xml");
        //获取HelloWorld实例
        HelloWorld hw=axt.getBean("HelloWorld",HelloWorld.class);
        //调用方法
        hw.say();
    }
}
