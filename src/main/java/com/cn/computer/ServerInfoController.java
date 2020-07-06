package com.cn.computer;

import com.alibaba.fastjson.JSONObject;
import com.cn.computer.dao.mapper.ServerInfoMapper;
import com.cn.computer.dao.model.ServerInfo;
import com.cn.computer.serviceImpl.ServerInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serverInfo/")
public class ServerInfoController {

    @Autowired
    public ServerInfoServiceImpl serverInfoService;

    @Autowired
    public ServerInfoMapper serverInfoMapper;

    @PostMapping(value = "/ceshi")
    public int testSave(){
        JSONObject jsonObject = new JSONObject();
        ServerInfo serverInfo = new ServerInfo();
        serverInfo.setUuid("12345");
        serverInfo.setLoginName("root");
       return serverInfoMapper.insertSelective(serverInfo);
    }

    /**
     * 新增
     * @param object  serverInfo对象
     * @param paramType 单个还是list
     * @return
     */
    public JSONObject saveObj (String object,String paramType){
        return  serverInfoService.saveServerInfo(object,paramType);
    }

    /**
     * 更新
     * @param object serverInfo对象
     * @param paramType
     * @return
     */
    public JSONObject updObj(String object,String paramType){
        return  serverInfoService.updServerInfo(object,paramType);
    }

    /**
     * 删除
     * @param object serverInfo对象
     * @param paramType
     * @return
     */
    public JSONObject delObj(String object,String paramType){
        return  serverInfoService.delServerInfo(object,paramType);
    }



}
