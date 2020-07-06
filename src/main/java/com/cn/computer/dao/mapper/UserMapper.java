package com.cn.computer.dao.mapper;

import com.cn.computer.dao.model.User;

public interface UserMapper {
    User selectUserByUuid(int uuid);
}
