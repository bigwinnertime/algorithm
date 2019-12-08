package com.bigwinner.sort;

import java.util.Collections;
import java.util.List;

/**
 * 原理：
 * 1.升序
 *   a.列表相邻的两个元素，如果前者比后者大，则交换两个元素
 *   b.执行完一趟后，有序区增加一个元素，无序区减少一个元素（有序区位于后面）
 * 2.降序
 *   a.列表相邻的两个元素，如果前者比后者大，则交换两个元素
 *   b.执行完一趟后，有序区增加一个元素，无序区减少一个元素（有序区位于后面）
 * 算法关键点：有序区和无序区
 *
 */

/**
 * @Company: no.
 * @Author: bigwinner.
 * @Create: 2019/12/05.
 * @Description: ${description}.
 */
public class BubbleSort {
    public static List<Integer> bubbleSort (List<Integer> dataList) {
        System.out.println("------------排序中-------------");
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) { // 执行n-1趟
            for (int j = 0; j < n - 1 - i; j++) {   // 每趟指针都从头部开始执行，每次执行的次数随之减少(已排序的区域不再执行)
                if (dataList.get(j) > dataList.get(j+1)) {
                    Collections.swap(dataList,j,j+1);  // 交换值
                }
            }
            System.out.println("destData: " + dataList);  //打印每趟的输出
        }
        return dataList;
    }
}
