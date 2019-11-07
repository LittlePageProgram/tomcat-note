package com.littlepage.demo1.SimpleCommunication;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器类
 * 用于开启一个端口监听
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080, 1, InetAddress.getByName("127.0.0.1"));
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int a;
        while (((a=inputStream.read())!=-1)){
            System.out.println((char)a);

        }
    }
}
