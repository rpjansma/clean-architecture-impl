package com.clean.cleanarchtectureimpl.entity.impl;

import com.clean.cleanarchtectureimpl.entity.User;
import com.clean.cleanarchtectureimpl.entity.factory.UserFactory;

class CommonUserFactory implements UserFactory {
    @Override
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
