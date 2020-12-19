package com.jacian.leetcode.editor.en;

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学 
// 👍 266 👎 0

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution solution = new PowerOfTwo().new Solution();
        System.out.println(solution.isPowerOfTwo(1024));
        System.out.println(solution.isPowerOfTwo(1022));
        System.out.println(solution.isPowerOfTwo(512));
        System.out.println(solution.isPowerOfTwo(513));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return (n > 0) && (n == (n & -n));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}