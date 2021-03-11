package com.huawei.java.main.com.huawei.java;

public class virtual_machine {
    public String vmType;
    public String vmCpuCores;
    public String vmMemory;
    public String vmTwoNodes;

    public String getVmType() {
        return vmType;
    }

    public void setVmType(String vmType) {
        this.vmType = vmType;
    }

    public String getVmCpuCores() {
        return vmCpuCores;
    }

    public void setVmCpuCores(String vmCpuCores) {
        this.vmCpuCores = vmCpuCores;
    }

    public String getVmMemory() {
        return vmMemory;
    }

    public void setVmMemory(String vmMemory) {
        this.vmMemory = vmMemory;
    }

    public String getVmTwoNodes() {
        return vmTwoNodes;
    }

    public void setVmTwoNodes(String vmTwoNodes) {
        this.vmTwoNodes = vmTwoNodes;
    }

    @Override
    public String toString() {
        return "虚拟机{" +
                "虚拟机类型='" + vmType + '\'' +
                ", 虚拟机cpu核心数='" + vmCpuCores + '\'' +
                ", 虚拟机内存大小='" + vmMemory + '\'' +
                ", 虚拟机节点数='" + vmTwoNodes + '\'' +
                '}';
    }
}