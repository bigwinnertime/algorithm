package com.bigwinner.sort;


import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Company: geyecloud.
 * @Author: lsl.
 * @Create: 2019/12/08.
 * @Description: ${description}.
 */
public class TestLowSort {
    private List<Integer> sourceList;

    @Before
    public void setUp () {
        sourceList = new Random().ints(0, 50)
                .limit(10).mapToObj(value -> value).collect(Collectors.toList());
    }
    @Test
    public void testBubbleSort () {
        System.out.println("------------排序前-------------");
        System.out.println("sourceData: " + sourceList);
        long start = System.currentTimeMillis();
        List<Integer> destList = BubbleSort.bubbleSort(sourceList);
        long end = System.currentTimeMillis();
        System.out.println("------------排序后-------------");
        System.out.println("destData: " + destList);
        System.out.println("timeUse: " + (end-start) + "ms");
    }

    @Test
    public void testInsertSort () {
        System.out.println("------------排序前-------------");
        System.out.println("sourceData: " + sourceList);
        long start = System.currentTimeMillis();
        List<Integer> destList = InsertSort.insertSort(sourceList);
        long end = System.currentTimeMillis();
        System.out.println("------------排序后-------------");
        System.out.println("destData: " + destList);
        System.out.println("timeUse: " + (end-start) + "ms");
    }

    @Test
    public void testSelectSort () {
        System.out.println("------------排序前-------------");
        System.out.println("sourceData: " + sourceList);
        long start = System.currentTimeMillis();
        List<Integer> destList = SelectSort.selectSort(sourceList);
        long end = System.currentTimeMillis();
        System.out.println("------------排序后-------------");
        System.out.println("destData: " + destList);
        System.out.println("timeUse: " + (end-start) + "ms");
    }

}
