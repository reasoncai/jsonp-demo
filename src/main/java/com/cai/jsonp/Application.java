package com.cai.jsonp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * jsonp就是利用script标签的src不受跨域限制特性来实现的
 * Created by reason on 17/11/8.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
