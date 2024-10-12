package com.ch11;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

/**
 * ClassName: Demo01
 * Package: com.ch11
 * Description:
 *
 * @author junbao3
 * Create 2024/10/10 6:42
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //成员变量属性是char类型 默认值为空字符 验证
        PersonV1 personV1 = new PersonV1();
        char sex = personV1.sex;
        char ch = '\u0000';
        char ch1 = 0;
        System.out.println(ch1);
        System.out.println(ch);
        System.out.println(sex);//''
        System.out.println((int)sex);//0
        System.out.println(ch==sex);
        System.out.println(ch==ch1);

    }
}
