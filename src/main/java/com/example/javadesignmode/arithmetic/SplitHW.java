package com.example.javadesignmode.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class SplitHW {
    List<List> res = new ArrayList<>();

    public List<List> partition(String s) {
        if (s == null || s.length() == 0) {
            return res;
        }
        dfs(s, new ArrayList(), 0);
        return res;
    }

    public void dfs(String s, List remain, int left) {
        if (left == s.length()) {
            res.add(new ArrayList(remain));
            return;
        }
        for (int right = left; right < s.length(); right++) {// 从left开始，依次判断left->right是不是回文串
            if (isPalindroom(s, left, right)) {// 判断是不是回文串
                remain.add(s.substring(left, right + 1));// 添加当前回文串到list中
                dfs(s, remain, right + 1); // 从right+1开始继续递归，寻找回文串
                remain.remove(remain.size() - 1); // 回溯，从而寻找更长的回文串
            }
        }
    }

    /**
     * 判断字符串是否是回文串
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    public boolean isPalindroom(String s, int left, int right) {
        while (left < right &&
                Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
            left++;
            right--;
        }
        return left >= right;
    }

}
