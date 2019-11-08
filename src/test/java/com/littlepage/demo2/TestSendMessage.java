package com.littlepage.demo2;

import com.littlepage.demo1.SimpleCommunication.Server;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 测试向客户端发送消息
 */
public class TestSendMessage {
    @Test
    public void sendMessage() throws IOException, InterruptedException {
        byte[] buffer = new byte[1024*2];
        Socket socket = new Socket("127.0.0.1",8080);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        outputStream.write("GET /index.html HTTP/1.1".getBytes());
        inputStream.read(buffer);
        System.out.println(new String(buffer));
    }
}
