package com.littlepage.demo5.connector;

import java.io.IOException;

/**
 * 处理静态资源请求
 */
public class StaticResourceProcessor {
    public void process(HttpRequest request, HttpResponse response) {
        try{
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
