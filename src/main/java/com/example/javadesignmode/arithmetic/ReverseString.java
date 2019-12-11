package com.example.javadesignmode.arithmetic;

/**
 * 字符串反转
 */
public class ReverseString {

    public static void main(String[] args) {
        String s = "abc1234";
        System.out.println(s.toCharArray());
        System.out.println(reverse(s));
        System.out.println();
    }

    public static char[] reverse(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        char temp;
        while (left < right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars;
    }
}