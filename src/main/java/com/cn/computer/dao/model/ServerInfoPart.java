package com.cn.computer.dao.model;

import java.util.Date;

public class ServerInfoPart {

  private String uuid;
  //服务器uuid
  private String serverId;
  //服务器所属系统id
  private String belongSysId;
  //服务器所属系统name
  private String belongSysName;
  //服务器初始内存
  private int originalMemory;
  //服务器初始CPU
  private int originalCpu;
  //服务器初始硬盘大小
  private int originalDisk;
  //服务器交换分区大小
  private String swap;
  //服务器类型 1物理机  2虚拟机
  private int serverType;
  //服务器型号
  private String serverNum;
  //服务器网卡型号
  private String nicType;
  //服务器网卡带宽
  private String nicBps;
  //服务器mac 地址
  private String nicMacAdress;
  //服务器是否有外挂存储
  private int otherDiskTypr;
  //服务器外挂存储ip
  private String otherDiskIp;
  //服务器外挂存储路径
  private String otherDiskAdress;
  //服务器外挂存储大小
  private int otherDiskSize;


  //修改时间
  private Date updTime;
  //修改人id
  private String updId;



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

  public String getBelongSysId() {
    return belongSysId;
  }

  public void setBelongSysId(String belongSysId) {
    this.belongSysId = belongSysId;
  }

  public String getBelongSysName() {
    return belongSysName;
  }

  public void setBelongSysName(String belongSysName) {
    this.belongSysName = belongSysName;
  }

  public int getOriginalMemory() {
    return originalMemory;
  }

  public void setOriginalMemory(int originalMemory) {
    this.originalMemory = originalMemory;
  }

  public int getOriginalCpu() {
    return originalCpu;
  }

  public void setOriginalCpu(int originalCpu) {
    this.originalCpu = originalCpu;
  }

  public int getOriginalDisk() {
    return originalDisk;
  }

  public void setOriginalDisk(int originalDisk) {
    this.originalDisk = originalDisk;
  }

  public String getSwap() {
    return swap;
  }

  public void setSwap(String swap) {
    this.swap = swap;
  }

  public int getServerType() {
    return serverType;
  }

  public void setServerType(int serverType) {
    this.serverType = serverType;
  }

  public String getServerNum() {
    return serverNum;
  }

  public void setServerNum(String serverNum) {
    this.serverNum = serverNum;
  }

  public String getNicType() {
    return nicType;
  }

  public void setNicType(String nicType) {
    this.nicType = nicType;
  }

  public String getNicBps() {
    return nicBps;
  }

  public void setNicBps(String nicBps) {
    this.nicBps = nicBps;
  }

  public String getNicMacAdress() {
    return nicMacAdress;
  }

  public void setNicMacAdress(String nicMacAdress) {
    this.nicMacAdress = nicMacAdress;
  }

  public int getOtherDiskTypr() {
    return otherDiskTypr;
  }

  public void setOtherDiskTypr(int otherDiskTypr) {
    this.otherDiskTypr = otherDiskTypr;
  }

  public String getOtherDiskIp() {
    return otherDiskIp;
  }

  public void setOtherDiskIp(String otherDiskIp) {
    this.otherDiskIp = otherDiskIp;
  }

  public String getOtherDiskAdress() {
    return otherDiskAdress;
  }

  public void setOtherDiskAdress(String otherDiskAdress) {
    this.otherDiskAdress = otherDiskAdress;
  }

  public int getOtherDiskSize() {
    return otherDiskSize;
  }

  public void setOtherDiskSize(int otherDiskSize) {
    this.otherDiskSize = otherDiskSize;
  }

  public Date getUpdTime() {
    return updTime;
  }

  public void setUpdTime(Date updTime) {
    this.updTime = updTime;
  }
  public String getUpdId() {
    return updId;
  }

  public void setUpdId(String updId) {
    this.updId = updId;
  }
}
