package com.huawei.java.main.com.huawei.java;


import java.util.ArrayList;
import java.util.LinkedHashMap;

public abstract class api {
    public abstract LinkedHashMap<String,ArrayList> read();
    public abstract void process();
    public abstract void write();
}