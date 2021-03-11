package com.huawei.java.main.com.huawei.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class input extends api{



    @Override
    public LinkedHashMap<String, ArrayList> read() {
        LinkedHashMap<String,ArrayList> newmap=new LinkedHashMap<>();
        int serverNum,vmNum;
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\Jiahao\\Desktop\\training-data\\training-1.txt");
            InputStreamReader inReader = new InputStreamReader(file, "UTF-8");
            BufferedReader bufReader = new BufferedReader(inReader);
            String line = null;
            String[] temp=null;
            String newstring=null;
            line=bufReader.readLine();
            serverNum=Integer.parseInt(line);
            //读取服务器类型
            ArrayList<server> servers=new ArrayList<>();
            for (int i = 1; i < serverNum+1; i++) {
                line=bufReader.readLine();
                newstring=line.substring(1, line.length()-1);
                temp=newstring.split(", ");
                server newserver=new server();
                newserver.serverType=temp[0];
                newserver.cpuCores=temp[1];
                newserver.memorySize=temp[2];
                newserver.serverCost=temp[3];
                newserver.powerCost=temp[4];
                servers.add(newserver);
            }
            newmap.put("Servers", servers);

            //读取虚拟机类型
            line=bufReader.readLine();
            vmNum=Integer.parseInt(line);
            ArrayList<virtual_machine> virtual_machines=new ArrayList<>();
            for (int i = 1; i < vmNum+1; i++) {
                line=bufReader.readLine();
                newstring=line.substring(1, line.length()-1);
                temp=newstring.split(", ");
                virtual_machine newVM=new virtual_machine();
                newVM.vmType=temp[0];
                newVM.vmCpuCores=temp[1];
                newVM.vmMemory=temp[2];
                newVM.vmTwoNodes=temp[3];
                virtual_machines.add(newVM);
            }
            newmap.put("virtual_machines",virtual_machines);
            bufReader.close();
            inReader.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newmap;
    }

    @Override
    public void process() {

    }

    @Override
    public void write() {

    }

}