package com.ruyjfs.microservicepostgresdb.template;

import com.ruyjfs.microservicepostgresdb.model.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class UserTemplate extends BaseTemplate {

    @Getter
    private static final UserTemplate instance = new UserTemplate();

    public User getOne() {
        User user = new User();
//        user.setName(faker.name().fullName());
        user.setName("User Test");
        return user;
    }

    public User getOneInvalid() {
        User user = new User();
        return user;
    }

    public List<User> getList() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("User Test");
        list.add(user);
        return list;
    }
}