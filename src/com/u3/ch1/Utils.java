package com.u3.ch1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * ClassName: Utils
 * Package: com.u3.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-16 9:14
 * @version 1.0
 */
public class Utils {
    public static final String USER_NAME = "zhangsan";
    public static final String PASSWORD = "123456";
    public static void saveInfo(String ... usernam){
        List<String> list = new ArrayList<>();
        if (usernam!=null && usernam.length>0){
            list.add(usernam[0]);
        }else {
            list.add(USER_NAME);
        }
        list.add(PASSWORD);
        System.out.println("保存信息成功！"+list);
    }
}
