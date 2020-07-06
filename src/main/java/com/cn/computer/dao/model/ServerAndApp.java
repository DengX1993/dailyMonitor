package com.cn.computer.dao.model;

public class ServerAndApp {

  private String uuid;
  //服务器uuid
  private String serverId;
  //服务器安装的app uuid
  private String appId;
  //app占用的端口
  private int employPort;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public int getEmployPort() {
    return employPort;
  }

  public void setEmployPort(int employPort) {
    this.employPort = employPort;
  }
}
