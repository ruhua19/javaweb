package com.ruhua.springtest.mapper;

import com.ruhua.springtest.entity.User;

public interface userMapper {
    void addUser();
    User getUserFromId(Long id);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserByName(String name);

}
