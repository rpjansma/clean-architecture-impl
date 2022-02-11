package com.clean.cleanarchtectureimpl.entity.factory;

import com.clean.cleanarchtectureimpl.entity.User;

public interface UserFactory {
    User create(String name, String password);
}
