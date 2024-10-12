package com.common.util;

import java.util.LinkedHashSet;
import java.util.Random;

/**
 * ClassName: RandomUtils
 * Package: com.common.util
 * Description:
 *
 * @author junbao3
 * Create 2024-10-12 15:18
 * @version 1.0
 */
public class RandomUtils {

    private final static Random random = new Random();

    public static int getOneNum(){
        return random.nextInt();
    }

    /*
    获取 1-10范围内的 5个 随机数
    首位包含在内
     */
    public static LinkedHashSet geSomeNumInRange(int count,int start,int end){
        LinkedHashSet set = new LinkedHashSet();
        while (set.size()<count){
            int i = random.nextInt(end) + 1;
            if (start==0){
                set.add(i);
            }else {
                if (i<start){
                    continue;
                }
                set.add(i);
            }
        }
        return set;
    }
    public static void main(String[] args) {
        System.out.println(geSomeNumInRange(5,10,30));
    }
}
