package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Homework {
    @Value("注解注入，正在写作业，勿扰...")
    private String content;

    public Homework(){}
    public Homework(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
