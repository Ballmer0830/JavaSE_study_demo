package com.u01.ch08.sec08;

/**
 * ClassName: FileTemplate
 * Package: com.u01.ch08.sec08
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 6:44
 * @version 1.0
 */
public abstract class FileTemplate {
    public void title(){
        System.out.println("《我的爸爸》");
    }

    public abstract  void body();

    public void end(){
        System.out.println("啊，这就是我的爸爸");
    }

    public void write(){
        title();
        body();
        end();
    }


}
