package com.ch13.quanxian;

/**
 * ClassName: Other
 * Package: com.ch13.quanxian
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 17:15
 * @version 1.0
 */
public class Other {
    public void method() {
        //同包非子类创建Base对象访问不到私有
//        new Base().num
        System.out.println(new Base().money);
        System.out.println(new Base().sex);
        System.out.println(new Base().name);
    }
}
