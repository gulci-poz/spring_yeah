package com.gulci.spring.spring_yeah.api;

import com.gulci.spring.spring_yeah.domain.User;

public interface UsersRepository {
    User createUser(String name);
    void setLogger(Logger logger);
}