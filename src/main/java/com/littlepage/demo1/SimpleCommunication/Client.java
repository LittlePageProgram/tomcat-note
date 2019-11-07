package com.littlepage.demo1.SimpleCommunication;

import java.io.*;
import java.net.Socket;

/**
 * 客户端类，用于请求资源
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream os = socket.getOutputStream();
        boolean autoflush = true;//自动刷新
        PrintWriter out = new PrintWriter(socket.getOutputStream(),autoflush);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //send an HTTP request to web server
        out.println("GET /index.jsp HTTP/1.1");
        out.println("Host: localhost:8080");
        out.println("Connnection: Close");
        out.println((char)(-1));
        //read the response
        StringBuilder sb = new StringBuilder(1024*8);
        while(true){
            if(in.ready()){
                int i = 0;
                while(i!=-1){
                    i = in.read();
                    sb.append((char)i);
                }
                break;
            }
            Thread.sleep(50);
        }
        System.out.println(sb.toString());
        socket.close();
    }
}
