package com.littlepage.demo3.addservlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * HttpServer类
 * 一个简易的Http服务器
 */
public class HttpServer {

    /**
     *  getProperty获得环境变量，并且加一个分隔符，加上web的根目录
     */
    public static final String WEB_ROOT = System.getProperty("user.dir")+ File.separator+"webroot";

    /**
     * 一个中断命令
     */
    public static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

    /**
     * 是否中断
     */
    private boolean shutdown = false;

    /**
     * 主程序可以开启服务器端口，并且一直进行等待
     * 这边有点问题，因为ServletRequest接口的问题
     * @param args
     */
    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.await();
    }

    /**
     * 等待函数
     * 开启一个ServerSocket，并且指定在8080监听
     */
    public  void await(){
        ServerSocket serverSocket = null;
        int port = 8080;
        try {
            /**
             * backlog参数为最大缓冲队列
             */
            serverSocket = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        while (!shutdown){
            Socket socket = null;
            InputStream input = null;
            OutputStream output = null;
            try {
                socket = serverSocket.accept();
                input = socket.getInputStream();
                output = socket.getOutputStream();
                /**
                 * 这边通过Request将输入流进行包装
                 * Response输出流进行包装
                 * Response进行接受Request的数据
                 * Response发送静态资源
                 */
                Request request = new Request(input);
                request.parse();
                Response response = new Response(output);
                response.setRequest(request);
                // check if this is a request for a servlet or
                // a static resource
                // a request for a servlet begins with "/servlet/"
                if(request.getUri().startsWith("/servlet/")) {
                    ServletProcessor processor = new ServletProcessor();
                    processor.process(request, response);
                }else{
                    StaticResourceProcessor processor = new StaticResourceProcessor();
                    processor.process(request,response);
                }
                //cloase the socket
                socket.close();
                //check if the previous URI is a shutdown command
                shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
