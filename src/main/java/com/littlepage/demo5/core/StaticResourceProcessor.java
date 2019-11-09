package com.littlepage.demo5.core;

import com.littlepage.demo4.addFacade.Request;
import com.littlepage.demo4.addFacade.Response;

import java.io.IOException;

public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try{
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
