package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(("test"))// 指定扫描哪些package
public class MyConfiguration {

    //对于Bean的赋值，优先级为：
    //配置文件 > 注解 > 配置类
    //由于已经在Student和Homework中存在对应的注解，所以这里（配置类）的赋值并不会生效
    @Bean
    public Student student(){
        //        return new Student("小注Bean",homework());
        Student student = new Student();
        student.setHomework(homework());
        student.setName("小注Bean");
        return student;
    }

    @Bean
    public Homework homework(){
        return new Homework("小注Bean正在写作业，勿扰...");
    }

}
