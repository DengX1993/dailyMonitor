package com.cn.computer.dao.model;

import java.util.Date;

public class ServerInfo {

    private String uuid;
    //服务器ip
    private String serverIp;
    //服务器部署位置  1互联网 2政务外网
    private int deploymentType;
    //连接服务器ssh端口
    private int sshPort;
    //登录服务器账号
    private String loginName;
    //登录服务器密码
    private String loginPassword;
    //服务器描述
    private String remark;

    //创建时间
    private Date createTime;
    //修改时间
    private Date updTime;
    //删除状态 1删除 2未删除
    private int delFlag;
    //开启状态 1开启 2关闭
    private int openFlag;
    //创建人id
    private String createId;
    //修改人id
    private String updId;

    public ServerInfo(){

    }

    public ServerInfo(String uuid, String serverIp, int deploymentType, int sshPort, String loginName, String loginPassword, String remark, Date createTime, Date updTime, int delFlag, int openFlag, String createId, String updId) {
        this.uuid = uuid;
        this.serverIp = serverIp;
        this.deploymentType = deploymentType;
        this.sshPort = sshPort;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.remark = remark;
        this.createTime = createTime;
        this.updTime = updTime;
        this.delFlag = delFlag;
        this.openFlag = openFlag;
        this.createId = createId;
        this.updId = updId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public int getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(int deploymentType) {
        this.deploymentType = deploymentType;
    }

    public int getSshPort() {
        return sshPort;
    }

    public void setSshPort(int sshPort) {
        this.sshPort = sshPort;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public int getOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(int openFlag) {
        this.openFlag = openFlag;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getUpdId() {
        return updId;
    }

    public void setUpdId(String updId) {
        this.updId = updId;
    }
}
