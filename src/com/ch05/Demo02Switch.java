package com.ch05;

/**
 * ClassName: Demo02Switch
 * Package: com.ch05
 * Description:
 *
 * @author junbao3
 * Create 2024/10/9 6:21
 * @version 1.0
 */
public class Demo02Switch {
    public static int getValue(int i){

        int result = 0;

        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + 2 * i;
            default:
                result = result + 4 * i;
            case 3:
                result = result + 3 * i;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(getValue(9));
    }
}
