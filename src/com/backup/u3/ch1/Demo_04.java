package com.backup.u3.ch1;

/**
 * ClassName: Demo_04
 * Package: com.u3.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-16 9:20
 * @version 1.0
 */
public class Demo_04 {
    public static void main(String[] args) {
        String userName = "lisi";
        login(userName);
    }

    private static void login(String userName) {
        Utils.saveInfo(userName);
    }
}
