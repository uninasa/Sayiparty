package top.uninasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        //扫描当前class文件所在的包中的所有注解
        SpringApplication.run(App.class);
    }
}
