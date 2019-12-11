package com.example.javadesignmode.arithmetic;

/**
 * 验证回文串
 */
public class TestHWString {
    /**
     * 什么是回文:就是一个正读和反读都一样的字符串。
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba")); // true
        System.out.println(isPalindrome("I am m`ai"));// true
        System.out.println(isPalindrome("123454321")); // true
        System.out.println(isPalindrome("Process finished")); // false
    }

    /**
     * 验证字符串是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * @param string
     * @return
     */
    public static boolean isPalindrome(String string) {
        if (string == null || string == "" || string.length() == 0) {
            return true;
        }
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            // isLetterOrDigit 确定指定的字符是英文或数字
            if (!Character.isLetterOrDigit(string.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(string.charAt(right))) {
                right--;
            } else {
                // 判断left、right位置的字符是否相等，不区分大小写
                if (Character.toLowerCase(string.charAt(left)) !=
                        Character.toLowerCase(string.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
