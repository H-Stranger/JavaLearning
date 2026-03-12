package com.exception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Exception1 {
    public static void main(String[] args) {
        byte[] bt = toGBK("中文");
        System.out.println(Arrays.toString(bt));
    }
    static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();  //默认编码
        }
    }
}
