package com.arryluo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author arryluo
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 　　Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 　　Output: 7 -> 0 -> 8
 * 您将得到两个表示两个非负数的链表。数字以相反的顺序存储，每个节点包含一个数字。添加这两个数字，并将其作为链接列表返回。
 * <p>
 * 输入：（2->4->3）+（5->6->4）
 * <p>
 * 输出：7->0->8
 */
public class TwoNumbersDemo {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(2);
        linkedList1.add(4);
        linkedList1.add(3);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(4);
        linkedList2.add(5);
        linkedList2.add(6);
        //5-6-4-5 2-4-3;
        //7-0-8-5-6
        String res = twoNumber(linkedList1, linkedList2);
        System.out.println(res);
    }


    private static String twoNumber(LinkedList<Integer> one, LinkedList<Integer> two) {

        if (one == null || two == null) {
            return "";
        }
        LinkedList<Integer> temp = null;
        //进行数据大小互换.以方便下面的计算
        if (one.size() < two.size()) {
            temp = one;
            one = two;
            two = temp;
        }
        Map newMap = getTwoMap(two);
        int twoLine = two.size();
        int hasNext = 0;//这个是一个游标
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < one.size(); i++) {
            int obj = one.get(i);
            if (i > twoLine - 1) {
                if (i < one.size() - 1) {
                    sb.append(obj + hasNext).append("->");
                } else {
                    sb.append(obj + hasNext);
                }

            } else {
                int twoaobj = (Integer) newMap.get(i);

                int sum = (obj + hasNext + twoaobj);
                int cur = sum % 10;//当前的值
                int next = sum / 10;//要将此值放入下一次计算中去
                hasNext = next;
                if (i < one.size() - 1) {
                    sb.append(cur).append("->");
                } else {
                    sb.append(cur);
                }

            }
        }
        return sb.toString();
    }

    //处理第二个链表的数据集
    private static Map getTwoMap(LinkedList<Integer> two) {
        Map map = new HashMap();
        for (int i = 0; i < two.size(); i++) {
            int vas = two.get(i);
            map.put(i, vas);
        }
        return map;
    }
}
