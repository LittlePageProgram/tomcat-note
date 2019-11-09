package com.littlepage.demo5.addConnector;

import java.io.IOException;

/**
 * 处理静态资源请求
 */
public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try{
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
