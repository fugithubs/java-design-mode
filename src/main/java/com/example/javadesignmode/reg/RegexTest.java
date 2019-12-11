package com.example.javadesignmode.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Title: JavaDesignPattern<br>
 * Description: 正则表达式测试类<br>
 * Copyright: Copyright (c) 2016 <br>
 * Create DateTime: 2016-10-18 上午11:25:30 <br>
 * CVS last modify person: fuxiaorong-len <br>
 * CVS last modify DateTime: 2016-10-18 <br>
 *
 * @author fuxiaorong-len
 */
public class RegexTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 只能输入英文字母
        String onlyEnghlishReg = "^([A-Za-z])+$";
        //System.out.println(startCheck(onlyEnghlishReg, "stearwera"));
        identityCardCheck();

    }

    private static void identityCardCheck() {
        String pat = "^(\\d{15}|\\d{17}[\\dxX])$";
        String pat1 = "^(\\d{15}|\\d{17}[0-9xX])$";

        String[] idens = {"610502198804036578", "61050219880403657x",
                "6105021988040365xx", "6105021988040365XX", "6105021988040365Xx",
                "61050219880403657X", "61050219880403657", "61050219880403657s",
                "123456789123456", "1234567891234xx", "12345678912345x",
                "12345678912345", "               ", "                  ",
                "!@$@!$%@$%@#$@$@#!"};

        for (int i = 0; i < idens.length; i++) {
            System.out.println(pat + " : " + idens[i] + "-->" + Pattern.compile(pat).matcher(idens[i]).matches());
            System.out.println(pat1 + " : " + idens[i] + "-->" + Pattern.compile(pat1).matcher(idens[i]).matches());
        }
    }

    public static boolean startCheck(String reg, String string) {
        boolean tem = false;
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(string);
        tem = matcher.matches();
        return tem;
    }
}
