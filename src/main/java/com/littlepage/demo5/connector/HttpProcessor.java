package com.littlepage.demo5.connector;

import com.littlepage.demo5.stream.SocketInputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * HttpProcessor
 * 进行连接后的处理
 */
public class HttpProcessor {

    private HttpConnector connector;

    private HttpRequest request;

    private HttpResponse response;

    public HttpProcessor(HttpConnector httpConnector) {
        this.connector = httpConnector;
    }

    public void process(Socket socket) {
//        SocketInputStream input = null;
//        OutputStream output = null;
//
//        try {
//            input = new SocketInputStream(socket.getInputStream(),2048);
//            output = socket.getOutputStream();
//            // create HttpRequest object and parse
//            request = new HttpRequest(input);
//            // create HttpResponse object
//            response = new HttpResponse(output);
//            response.setRequest(request);
//            response.setHeader("Server","Pyrmont Servlet Container");
//            parseRequest(input,output);
//            parseHeaders(input);
//            // check if this is a request for a servlet or a static resource
//            // a request for a servlet begins with "/servlet/"
//            if(request.getRequestURI().startsWith("/servlet/")){
//                ServletProcessor processor = new ServletProcessor();
//                processor.process(request,response);
//            }else {
//                StaticResourceProcessor processor = new StaticResourceProcessor();
//                processor.process(request,response);
//            }
//            // close the socket
//            socket.close();
//            // no shutdown for this application
//            socket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void parseHeaders(SocketInputStream input) {
    }

    private void parseRequest(SocketInputStream input, OutputStream output) {

    }
}
