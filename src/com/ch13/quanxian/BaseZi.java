package com.ch13.quanxian;

/**
 * ClassName: BaseZi
 * Package: com.ch13.quanxian
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 17:12
 * @version 1.0
 */
public class BaseZi extends Base{
    void method1(){

    }

    void method2(){

    }
    public void method() {
        //同包子类访问不到父类私有
//        super.id;

        //同包子类创建Base对象还是访问不到私有
//        new Base().id

        super.money = 22.22;
        super.sex = 'F';
        super.name = "lisi";

        System.out.println(new Base().money);
        System.out.println(new Base().sex);
        System.out.println(new Base().name);
    }
}
