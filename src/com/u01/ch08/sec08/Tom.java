package com.u01.ch08.sec08;

/**
 * ClassName: Tom
 * Package: com.u01.ch08.sec08
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 6:48
 * @version 1.0
 */
public class Tom extends FileTemplate{

    @Override
    public void body() {
        System.out.println("那是一个秋天，风儿那么缠绵，" +
                "记忆中，那天爸爸骑车接我放学回家，" +
                "我的脚卡在了自行车链当中，爸爸蹬不动，他就站起来蹬。。。");
    }

    public static void main(String[] args) {
        new Tom().write();
    }
}
