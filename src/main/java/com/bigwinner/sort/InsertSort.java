package com.bigwinner.sort;

import java.util.Collections;
import java.util.List;

/**
 *
 * 原理：
 * 1.无序区的元素插入到有序区
 * 2.有序区的元素移动，无序区的元素放入
 * 算法关键点：有序区元素的移动
 *
 */


/**
 * @Company: no.
 * @Author: bigwinner.
 * @Create: 2019/12/05.
 * @Description: ${description}.
 */
public class InsertSort {
    public static List<Integer> insertSort(List<Integer> dataList) {
//        System.out.println("------------排序中-------------");
        int n = dataList.size();
        for (int i = 1; i < n; i++) { // 摸牌摸n-1次
            // i表示摸的牌的位置，j表示手中牌的位置
            int j = i - 1;
            int tmp = dataList.get(i);  // 变量保存
            int a = dataList.get(j);
            while (j >= 0 && dataList.get(j) > tmp) {
                Collections.swap(dataList, j, j + 1); // 手中牌往后挪
                j -= 1; // 指针位置往前挪
            }

            a = tmp;   // 摸到的牌插入空的位置
//            System.out.println("destData: " + dataList);  // 打印每趟的输出
        }
        return dataList;
    }
}
