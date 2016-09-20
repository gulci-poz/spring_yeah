package com.gulci.spring.spring_yeah;

import com.gulci.spring.spring_yeah.api.Logger;
import com.gulci.spring.spring_yeah.api.UsersRepository;
import com.gulci.spring.spring_yeah.domain.User;
import com.gulci.spring.spring_yeah.implementations.LoggerImpl;
import com.gulci.spring.spring_yeah.implementations.UsersRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);
        User user = usersRepository.createUser("gulci");
    }
}
