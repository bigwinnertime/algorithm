package com.bigwinner.sort;

import java.util.Collections;
import java.util.List;

/**
 * 原理：
 * 1.第一趟排序记录最小的值，放在第一个位置
 * 2.第二趟从无序区排序记录最小的值，放在第二个位置
 * 3.。。。。。。。。。。。
 * 算法关键点：有序区和无序区，无序区最小值的位置
 *
 */

/**
 * @Company: no.
 * @Author: bigwinner.
 * @Create: 2019/12/05.
 * @Description: ${description}.
 */
public class SelectSort {
    public static List<Integer> selectSort(List<Integer> dataList) {
//        System.out.println("------------排序中-------------");
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) { // 循环n-1趟
            int min_loc = i;    // 选定任意一个位置的值作为标准(最小值)
            for (int j = i; j < n - 1; j++) {    // 无序区执行n-j-1趟
                if (dataList.get(j + 1) < dataList.get(min_loc)) {
                    Collections.swap(dataList, j + 1, min_loc);   // 交换值
                }
            }
//            System.out.println("destData: " + dataList);  // 打印每趟的输出

        }
        return dataList;
    }
}
