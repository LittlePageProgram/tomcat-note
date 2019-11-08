package com.littlepage.demo3.addservlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class Request implements ServletRequest{

    private InputStream input;

    private String uri;

    public Request(InputStream input) {
        this.input = input;
    }

    public String getUri() {
        return uri;
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

    /**
     * Read a set of characters from the socket
     */
    public void parse() {
        //Read a set of characters from the socket
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

    /** implementation of ServletRequest */
    @Override
    public Object getAttribute(String attribute) {
        return null;
    }

    @Override
    public Enumeration getAttributeNames() {
        return null;
    }

    @Override
    public String getRealPath(String path) {
        return null;
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String path) {
        return null;
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public String getCharaterEncoding() {
        return null;
    }

    @Override
    public int getContentLength() {
        return 0;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        return null;
    }

    @Override
    public Locale getLocale() {
        return null;
    }

    @Override
    public Enumeration getLocales() {
        return null;
    }

    @Override
    public String getParameter(String name) {
        return null;
    }

    @Override
    public Map getParameterMap() {
        return null;
    }

    @Override
    public Enumeration getParameterNames() {
        return null;
    }

    @Override
    public String[] getParaneterValues(String parameter) {
        return new String[0];
    }

    @Override
    public String getProtoccol() {
        return null;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return null;
    }

    @Override
    public String getRemoteAddr() {
        return null;
    }

    @Override
    public String getRemoteHost() {
        return null;
    }

    @Override
    public String getScheme() {
        return null;
    }

    @Override
    public String getServerName() {
        return null;
    }

    @Override
    public int getServerPort() {
        return 0;
    }

    @Override
    public void removeAttribute(String attribute) {

    }

    @Override
    public void setAttribute(String key, Object value) {

    }

    @Override
    public void setCharacterEncoding(String encoding) throws UnsupportedEncodingException {

    }
}
