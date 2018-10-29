package com.qkz5.oaattendance;

import com.slkj.autocode.CreateAutoCode;

public class CreateCode {
    public static void main(String[] args) {
        CreateAutoCode createAutoCode  = new CreateAutoCode();
        createAutoCode.start("kaoqin", "root", "Admin@123", "com.qkz5.oaattendance");
    }
}
