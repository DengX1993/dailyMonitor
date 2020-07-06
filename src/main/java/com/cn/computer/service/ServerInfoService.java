package com.cn.computer.service;


import com.alibaba.fastjson.JSONObject;

public interface ServerInfoService {
    JSONObject saveServerInfo(String object, String paramType);

    JSONObject updServerInfo(String object, String paramType);

    JSONObject delServerInfo(String object, String paramType);
}
