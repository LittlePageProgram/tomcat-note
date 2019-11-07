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
        StringBuffer req = new StringBuffer(1024*2);
        int i=0;
        byte[] buffer = new byte[1024*2];
        try {
            i = input.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int j=0;j<i;j++){
            req.append((char) buffer[i]);
        }
        System.out.println(req.toString());
        uri=parseUri(req.toString());
    }

    /**
     * 解析第二个参数
     * @param reqString
     * @return
     */
    private String parseUri(String reqString) {
        int index1,index2;
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
        return null;
    }
}
