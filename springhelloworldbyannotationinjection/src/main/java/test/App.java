package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);//创建一个容器（通过配置类）
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myconfiguration.xml");//创建一个容器（通过配置文件）
        Student student = context.getBean(Student.class);

        System.out.println(student.getName()+"准备做作业了");
        student.doHomeWork(); //aop会自动扩充doHomeWork(),具体的扩充位置等细节见容器对应的配置文件 或 注解

        context.close();

    }
}
