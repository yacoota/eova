package com;

import com.eova.common.utils.EncryptUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println(EncryptUtil.getSM32("000000"));
        System.out.println(EncryptUtil.getSM32("eova"));
        System.out.println(EncryptUtil.getSM32("admin"));
    }
}
