package com.u4.ch2;

import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: PersonV1
 * Package: com.u4.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-20 13:57
 * @version 1.0
 */
public class PersonV1 {
    public List getList(){
        System.out.println("父类的方法");
        return new LinkedList<>();
    }
}
