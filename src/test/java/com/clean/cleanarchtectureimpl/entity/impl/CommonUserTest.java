package com.clean.cleanarchtectureimpl.entity.impl;

import com.clean.cleanarchtectureimpl.entity.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CommonUserTest {


    @Test
    void given123Password_whenPasswordIsNotValid_thenIsFalse() {
        User user = new CommonUser("TesteUser", "123");

        assertThat(user.passwordIsValid()).isFalse();
    }

}