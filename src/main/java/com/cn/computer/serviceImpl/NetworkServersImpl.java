package com.cn.computer.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.cn.computer.dao.mapper.ServerInfoMapper;
import com.cn.computer.service.NetworkServers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkServersImpl implements NetworkServers {

    @Autowired
    private ServerInfoMapper serverInfoMapper;
    /**
     * 根据ip 查看机器是否可以ping通和telnet
     * @param ip
     * @return
     */
    @Override
    public JSONObject checkComputer(String ip) {
        //根据ip 查询机器信息
        serverInfoMapper.selectServerInfoByIp(ip);


        return null;
    }
}
