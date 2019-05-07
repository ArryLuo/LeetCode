package com.arryluo;

/**
 * @author arryluo
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 * <p>
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 　　You may assume that each input would have exactly one solution.
 * 　　Input: numbers={2, 7, 11, 15}, target=9
 * 　　Output: index1=1, index2=2
 */

/**
 * 题意是:
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 　　The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 　　You may assume that each input would have exactly one solution.
 　　Input: numbers={2, 7, 11, 15}, target=9
 　　Output: index1=1, index2=2
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 译文
 * 给定一个整数数组，找到两个数字，使它们加起来成为一个特定的目标数字。

 函数twosum应返回两个数字的索引，以便它们相加到目标，其中index1必须小于index2。请注意，您返回的答案（索引1和索引2）不是以零为基础的。

 您可以假设每个输入只有一个解决方案。

 输入：数字={2,7,11,15}目标值=9

 输出：index1=1，index2=2
 */
public class TwoSumDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("开始时间:" + start);
        int[] res = {2, 7, 11, 15};
        Map map = twoSum(res, 13);
        long end = System.currentTimeMillis();
        System.out.println("相差时间" + (end - start));
        System.out.println(map);
    }

    private static Map twoSum(int[] str, int target) {
        Map res = new HashMap();
        //第一步,先将数据进行排序
        Arrays.sort(str);
        //第二步进行数据的对比碰瓷
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                //取出第一个数
                int first = str[i];
                int two = str[j];
                if (first + two == target) {
                    res.put("index1", i);
                    res.put("index2", j);
                    return res;
                }
            }
        }
        return res;
    }
}
