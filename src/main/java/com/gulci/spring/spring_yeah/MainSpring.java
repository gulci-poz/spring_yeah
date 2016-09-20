package com.gulci.spring.spring_yeah;

import com.gulci.spring.spring_yeah.api.UsersRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        UsersRepository usersRepository = context.getBean("myUsersRepository", UsersRepository.class);
        usersRepository.createUser("gulci");
    }
}
