package com.huawei.java.main.com.huawei.java;

public class server {
    public String serverType;
    public String cpuCores;
    public String memorySize;
    public String serverCost;
    public String powerCost;

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public String getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(String cpuCores) {
        this.cpuCores = cpuCores;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getServerCost() {
        return serverCost;
    }

    public void setServerCost(String serverCost) {
        this.serverCost = serverCost;
    }

    public String getPowerCost() {
        return powerCost;
    }

    public void setPowerCost(String powerCost) {
        this.powerCost = powerCost;
    }

    @Override
    public String toString() {
        return "服务器{" +
                "型号 ：'" + serverType + '\'' +
                ", cpu核心数 ：'" + cpuCores + '\'' +
                ", 内存大小, ：'" + memorySize + '\'' +
                ", 硬件成本 ：'" + serverCost + '\'' +
                ", 每日能耗成本 ：'" + powerCost + '\'' +
                '}';
    }
}