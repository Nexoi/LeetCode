package com.nexo.leetcode;

import java.util.ArrayList;

/**
 * Created by neo on 12/07/2017.
 */
public class HammingDistance_461 {

    /**
     * My Answer
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int count = 0;
        String xx = Integer.toBinaryString(x ^ y);
        for (char cx : xx.toCharArray()) {
            if (cx == '1') {
                count++;
            }
        }
        return count;
    }

    /**
     * Solution
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        HammingDistance_461 test = new HammingDistance_461();
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(new int[]{45,23});
        arrayList.add(new int[]{22,23});
        arrayList.add(new int[]{33,253});
        arrayList.add(new int[]{44,23});
        arrayList.add(new int[]{55,3343});
        arrayList.add(new int[]{66,334});
        arrayList.add(new int[]{77,3212});
        arrayList.add(new int[]{88,21134});
        arrayList.add(new int[]{99,23});
        arrayList.add(new int[]{100,356878});
        arrayList.add(new int[]{121,23});
        arrayList.add(new int[]{112,78654});
        arrayList.add(new int[]{123,23});
        arrayList.add(new int[]{43245,32345});
        arrayList.add(new int[]{21,23});
        arrayList.add(new int[]{443,23453});
        arrayList.add(new int[]{2345,23});
        arrayList.add(new int[]{3434,2323});
        arrayList.add(new int[]{23456,23});
        arrayList.add(new int[]{4655,23453});
        arrayList.add(new int[]{445675,23});




        long startTime_0 = System.currentTimeMillis();
        for (int[] nums : arrayList) {
            test.hammingDistance(nums[0], nums[1]);
            sleep(100);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime_0));

        long startTime_1 = System.currentTimeMillis();
        for (int[] nums : arrayList) {
            test.hammingDistance2(nums[0], nums[1]);
            sleep(100);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime_1));
    }

    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){

        }
    }
}
