package com.u01.ch02.sec05;

/**
 * ClassName: Demo01
 * Package: com.u01.ch02.sec05
 * Description:"\t"  和  '\t'
 *
 * @author junbao3
 * Create 2024-10-11 14:37
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //既然是字符 必然是有一个数字的
        char t = '\t';
        System.out.println(t+0);
        //'\t' 就是 数字 9

        //单独打印 二者一样的
        System.out.println("\t");
        System.out.println('\t');


        //字符串 分别和 "\t"  、 '\t'  拼接 效果也一样 都表示 tab
        System.out.println("双引号杠t："+"\t"+1);
        System.out.println("单引号杠t："+'\t'+1);

        //数字分别和 "\t"  、 '\t'  相加  '\t'会变成9  "\t" 还是表示tab
        System.out.println(2+'\t'+3);//14
        System.out.println(2+"\t"+3);//2	3
    }
}
