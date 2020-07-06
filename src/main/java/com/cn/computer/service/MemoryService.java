package com.cn.computer.service;


import com.cn.computer.dao.model.User;

public interface MemoryService {

    public String executeCmd(String cmd);

    public User selectUserByUuid(int uuid);
}
