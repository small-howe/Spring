package com.tangwh.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 9:37
 * BeanNameAware: 获取Bean的名称
 * BeanFactoryAware:获取当前Bean的工厂
 * ResourceLoaderAware:获取资源加载器
 * EnvironmentAware: 获取环境的信息
 */

@Service
@PropertySource(value = "javaboy.properties")//加载资源
public class AwareService implements BeanNameAware, BeanFactoryAware, ResourceLoaderAware, EnvironmentAware {


    private String beanName;
    private ResourceLoader resourceLoader;
    private Environment environment;

    public void output() throws IOException {
        System.out.println("beanName="+beanName);
        Resource resource = resourceLoader.getResource("javaboy.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String s = br.readLine();
        System.out.println("s="+s);
        br.close();

        String property = environment.getProperty("javaboy.addres");
        System.out.println("property="+property);

    }

    /**
     * 获取Bean的生成工厂
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {




    }

    /**
     * 获取Bean的名字
     *
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        this.beanName = s;

    }

    /**
     * 获取环境信息
     * @param environment
     */
    @Override
    public void setEnvironment(Environment environment) {

        this.environment=environment;

    }

    /**
     * 获取 资源加载器
     * @param resourceLoader
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;

    }
}
