package br.com.paulocode.userserviceapi;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@RequiredArgsConstructor
public class UserServiceApiApplication {


    public static void main(String[] args) {

        SpringApplication.run(UserServiceApiApplication.class, args);
    }


}
