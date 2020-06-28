package com.tangwh.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 11:30
 */
@Component
// 表示 这是一个切面
@Aspect
public class LogAspectXml {


    /**
     * 前置通知 在目标方法之前执行
     *
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行了....");
    }


    /**
     * 后置 通知 在方法执行后通知
     *
     * @param joinPoint
     */
   @After(value = "pointcut()")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行结束了了....");
    }


    /**
     * 返回通知 可以在该方法中获取目标方法的返回值，如果目标方法的返回值 为void 则收到 null
     *
     * @param joinPoint
     * @param r         返回的参数名称 这里的方法参数名一一对应
     */
    public void returning(JoinPoint joinPoint, Object r) {

        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的返回通知...." + r);

    }

    /**
     * 异常通知,当目标方法抛出异常时 ,该方法才会被触发
     *
     * @param joinPoint
     * @param e         异常参数 和 方法的参数名一一对应 注意异常的类型
     */
    public void afterThrowing(JoinPoint joinPoint, Exception e) {


        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的异常通知...." + e);

    }


    /**
     * 环绕通知:环绕通知是上面四种统治的集大成者,环绕通知的核心类 类似于在反射中执行方法
     *
     * @param pjp
     * @return
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        // 这个类似于method.invoke 方法,我们可以在这个方法的前后分别添加日志，相当于前置/后置通知
        Object proceed = pjp.proceed();

        return proceed;

    }
}
