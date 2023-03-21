package com.example.javamodule4euklides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaModule4EuklidesApplication {
    public static void main(String[] args) {
        int a = 63;
        int b = 30;
        while (a != b){
            if(a > b){
                a -= b;
            }else
            {
                b -= a;
            }
        }
        System.out.println(a);
    }
}
