package com.littlepage.demo2;




import org.junit.jupiter.api.Test;

import java.io.File;

public class TestProperties {
    /**
     * 测试System.getProerty
     * 打印web目录
     */
    @Test
    public void printWebroot() {
        String webroot = System.getProperty("user.dir") + File.separator + "webroot";
        System.out.println(webroot);
    }
}
