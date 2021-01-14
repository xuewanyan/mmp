package cn.com.yitong.ares.mathInfo;

import java.util.Random;

/** Random */
public class Demo2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100) + ",");
        }
    }
}
