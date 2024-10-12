package com.ch13.quanxian.package1;

import com.ch13.quanxian.Base;

/**
 * ClassName: BaseZi
 * Package: com.ch13.quanxian.package1
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 17:16
 * @version 1.0
 */
public class BaseZi extends Base {

    public void show() {

//        super.id;
//        super.money = 22.22;
        super.sex = 'F';
        super.name = "lisi";

//        new Base().id
//        System.out.println(new Base().money);
//        System.out.println(new Base().sex);
        System.out.println(new Base().name);
    }
}
