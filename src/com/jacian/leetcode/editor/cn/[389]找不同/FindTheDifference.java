package com.jacian.leetcode.editor.en;

//给定两个字符串 s 和 t，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abcd", t = "abcde"
//输出："e"
//解释：'e' 是那个被添加的字母。
// 
//
// 示例 2： 
//
// 输入：s = "", t = "y"
//输出："y"
// 
//
// 示例 3： 
//
// 输入：s = "a", t = "aa"
//输出："a"
// 
//
// 示例 4： 
//
// 输入：s = "ae", t = "aea"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s 和 t 只包含小写字母 
// 
// Related Topics 位运算 哈希表 
// 👍 197 👎 0

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;

public class FindTheDifference {
    public static void main(String[] args) {
        Solution solution = new FindTheDifference().new Solution();
        System.out.println(solution.findTheDifference("abcd", "abced"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {

            int sCount = 0;
            for (int i = 0; i < s.length(); i++) {
                sCount += s.charAt(i);
            }

            int tCount = 0;
            for (int i = 0; i < t.length(); i++) {
                tCount += t.charAt(i);
            }
            return (char) (tCount - sCount);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}