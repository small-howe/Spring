package com.tangwh.javaconfig;

import com.tangwh.Datasource;
import com.tangwh.mapper.LinuxCondition;
import com.tangwh.mapper.ShowCmd;
import com.tangwh.mapper.WindowsCondition;
import com.tangwh.mapper.mapperImpl.LinuxShowCmd;
import com.tangwh.mapper.mapperImpl.WindowsShowComd;
import org.springframework.context.annotation.*;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 14:35
 */

/**
 * Java配置类  @Configuration 配置类的 做用 就类似于 applicationContext.xml
 */
@Configuration
@ComponentScan(basePackages = "com.tangwh")
//@ImportResource("classpath:applicationContext.xml") 混合配置
public class JavaConfig {


    @Bean
    SayHello sayHello(){

        System.out.println("--------------init------------");
        return new SayHello();
    }

    /**
     * 条件注解 根据当当前系统 返回不同的实例 返回 windows 实例  和Linux实例
     */
    @Bean("cmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd() {
        return new WindowsShowComd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)
    ShowCmd linuxCmd() {
        return new LinuxShowCmd();
    }


    /**
     * 环境切换
     * 开发环境
     *
     * @return
     */
    @Bean
    @Profile("dev")
    Datasource devDs() {
        Datasource ds = new Datasource();

        ds.setUrl("jdbc:mysql///vhr");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    /**
     * 生产环境
     * @return
     */
    @Bean
    @Profile("prod")
//    @Scope("prototype") 多例 每次获取的都不是同一个地址
    Datasource proDs() {
        Datasource ds = new Datasource();
        ds.setUrl("jdbc:192.168.62.130:3306/vhr");
        ds.setUsername("root");
        ds.setPassword("12345");
        return ds;
    }

}
