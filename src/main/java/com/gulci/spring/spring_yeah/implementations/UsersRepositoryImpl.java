package com.gulci.spring.spring_yeah.implementations;

import com.gulci.spring.spring_yeah.api.Logger;
import com.gulci.spring.spring_yeah.api.UsersRepository;
import com.gulci.spring.spring_yeah.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;

    public User createUser(String name) {
        logger.log("creating user " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
