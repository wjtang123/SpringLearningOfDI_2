package test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;
@Aspect
@Component
public class CheckNowTime {
    @Before("execution(void test.Student.doHomeWork(..))")
    public void beforDoHomework(){
        System.out.println("先执行时间校验，看看当前时间是："+new Date(System.currentTimeMillis()));
    }

    @After("execution(* *.*.doHomeWork(..))")
    public void afterDoHomework(){
        System.out.println("完成后看看当前时间是："+new Date(System.currentTimeMillis()));
    }
}
