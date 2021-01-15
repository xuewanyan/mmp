package cn.com.yitong.ares.compareInfo;

import java.util.Arrays;

/** 二分查找法 */
public class Demo1 {
    public static void main(String[] args) {
        int data[] = new int[] {11, 22, 33, 445, 2, 4, 6, 7};

        System.out.println(Arrays.toString(data));
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        System.out.println(Arrays.binarySearch(data, 33));
    }
}
