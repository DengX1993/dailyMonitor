package com.cn.computer.serviceImpl;


import com.cn.computer.dao.mapper.ServerInfoMapper;
import com.cn.computer.dao.mapper.UserMapper;
import com.cn.computer.dao.model.ServerInfo;
import com.cn.computer.dao.model.User;
import com.cn.computer.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class MemoryServiceImpl implements MemoryService {
    @Autowired
    public ServerInfoMapper serverInfoMapper;

    @Autowired
    public UserMapper userMapper;
/*

    private String ip = "10.10.133.14";
    private int port = 22;
    private String userName = "root";
    private String userPwd = "css123123";
    private JSONObject jsonObject;
    public MemoryServiceImpl(){
       jsonObject = new JSONObject();
   }

    @Override
    public String executeCmd(@PathVariable String cmd) {
        String result = jsonObject.toString();
        //创建连接
        Connection connection = RemoteCommandUtil.login(ip, port, userName, userPwd);
        if(connection == null)
            return  result;
        String executeResult = RemoteCommandUtil.execute(connection, cmd);

        return result;
    }
*/


    @Override
    public String executeCmd(String cmd) {
        return null;
    }

    @Override
    public User selectUserByUuid(int uuid) {

        ServerInfo serverInfo = new ServerInfo("123","123",1,2,"root","root","remark",
                new Date(),new Date(),2,1,"21","");
        int insert = serverInfoMapper.updateByPrimaryKey(serverInfo);

        return userMapper.selectUserByUuid(uuid);
    }

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
    }
}
