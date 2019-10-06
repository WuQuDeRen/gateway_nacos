package com.fj.nacos.application.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;


/**
 * spring-boot启动类（在单元测的时候起作用）
 *
 * @author ji_fei
 * 2018年9月9日 下午6:18:22
 * @version v1.0
 */
@SpringBootApplication
// 指定Bean扫描路径
@ComponentScan(basePackages = {"com.fj.nacos.application.**"})
//指定Mapper扫描路径
@MapperScan(basePackages = {"com.fj.nacos.application.**.dao"})
//// 属性配置类
//@EnableConfigurationProperties(com.fj.nacos.application.config.configuration.MyConfig.class)
//// 扫描属性配置文件
//@PropertySource({"classpath:jdbc.properties", "classpath:wxpay.properties"})

@EnableAspectJAutoProxy

@EnableDiscoveryClient
public class BootAppApplication {

    private Logger logger = LoggerFactory.getLogger(this.toString());

    public static void main(String[] args) {
        SpringApplication.run(BootAppApplication.class, args);
        System.out.println();
    }
}
