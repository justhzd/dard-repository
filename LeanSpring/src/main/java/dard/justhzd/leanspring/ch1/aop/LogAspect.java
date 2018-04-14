package dard.justhzd.leanspring.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by 洪志达 on 2018/4/14.
 */
//通过@Aspect注解声明一个切面
@Aspect
//让此切面成为Spring容器管理的Bean
@Component
public class LogAspect {
    //通过PointCut注解声明切点
    @Pointcut("@annotation(dard.justhzd.leanspring.ch1.aop.Action)")
    public void annotationPointCut(){};

    //通过after声明一个建言，并使用PointCut定义的切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        //通过反射获得注解上的属性，然后做日志记录相关的操作，下面的相同
        System.out.println("注解式拦截：" + action.name());
    }

    @Before("execution(* dard.justhzd.leanspring.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }
}
