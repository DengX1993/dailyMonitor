package com.cn.computer.dao.mapper;

import com.cn.computer.dao.model.ServerInfo;

public interface ServerInfoMapper {
    ServerInfo selectServerInfoByIp(String ip);

    int deleteByPrimaryKey(String uuid);

    int insert(ServerInfo record);

    int insertSelective(ServerInfo record);

    ServerInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(ServerInfo record);

    int updateByPrimaryKey(ServerInfo record);
}
