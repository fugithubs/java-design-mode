package com.example.javadesignmode.arithmetic;

import java.util.List;

/**
 * 分割回文串
 */
public class SplitHWString {

    public static void main(String[] args) {
        SplitHW splitHW = new SplitHW();
        List<List> qwe = splitHW.partition("aba");
        for (List list : qwe) {
            System.out.println(list.toString());
        }
    }
}
