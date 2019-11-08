package com.littlepage.demo2.SimpleWebServer;

import java.io.IOException;
import java.io.InputStream;

public class Request {

    private InputStream input;

    private String uri;

    public Request(InputStream input) {
        this.input = input;
    }

    /**
     * Read a set of characters from the socket
     */
    public void parse() {
        byte[] buffer = new byte[1024*2];
        try {
            int i = input.read(buffer);
            if(i==-1) {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        uri=parseUri(new String(buffer));
    }

    /**
     * 解析第二个参数
     * @param reqString
     * @return
     */
    private String parseUri(String reqString) {
        /**
         * 打印请求输出
         */
        System.out.println(reqString);
        int index1,index2 = 0;
        index1=reqString.indexOf(' ');
        if(index1!=-1){
            index2 = reqString.indexOf(' ',index1+1);
            if(index2>index1){
                return  reqString.substring(index1+1,index2);
            }
        }
        return null;
    }

    public String getUri() {
        return uri;
    }
}
