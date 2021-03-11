package com.huawei.java.main;

import com.huawei.java.main.com.huawei.java.input;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // TODO: read standard input
        // TODO: process
        // TODO: write standard output
        // TODO: System.out.flush()
        input A = new input();
        LinkedHashMap<String, ArrayList> map;
        map=A.read();
        System.out.println(map.get("virtual_machines"));
    }
}