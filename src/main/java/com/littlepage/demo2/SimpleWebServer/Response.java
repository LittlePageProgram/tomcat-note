package com.littlepage.demo2.SimpleWebServer;

import java.io.*;

public class Response {

    private static  final int BUFFER_SIZE = 1024;

    private Request request;

    private OutputStream output;

    public Response(OutputStream output) {
        this.output = output;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void sendStaticResource() {
        byte[] bytes = new byte[BUFFER_SIZE];
        FileInputStream fis = null;
        File file = new File(HttpServer.WEB_ROOT,request.getUri());
        try{
            if(file.exists()){
                fis = new FileInputStream(file);

            }
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
