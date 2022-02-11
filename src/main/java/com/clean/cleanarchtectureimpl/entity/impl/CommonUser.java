package com.clean.cleanarchtectureimpl.entity.impl;

import com.clean.cleanarchtectureimpl.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class CommonUser implements User {

    String name;
    String password;

    @Override
    public boolean passwordIsValid() {
        return password != null && password.length() > 4;
    }

}