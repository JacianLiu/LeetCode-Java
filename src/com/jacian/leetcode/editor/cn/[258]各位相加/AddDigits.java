package com.jacian.leetcode.editor.en;

//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
//
// 示例: 
//
// 输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
// 
//
// 进阶: 
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 
// 👍 305 👎 0

public class AddDigits {
    public static void main(String[] args) {
        Solution solution = new AddDigits().new Solution();
        System.out.println(solution.addDigits(199));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int addDigits(int num) {

            if (0 == num) {
                return 0;
            }

            return num % 9 == 0 ? 9 : num % 9;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}