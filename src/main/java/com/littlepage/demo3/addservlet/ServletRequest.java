package com.littlepage.demo3.addservlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public interface ServletRequest {
    public Object getAttribute(String attribute);
    public Enumeration getAttributeNames();
    public String getRealPath(String path);
    public RequestDispatcher getRequestDispatcher(String path);
    public boolean isSecure();
    public String getCharaterEncoding();
    public int getContentLength();
    public String getContentType();
    public ServletInputStream getInputStream() throws IOException;
    public Locale getLocale();
    public Enumeration getLocales();
    public String getParameter(String name);
    public Map getParameterMap();
    public Enumeration getParameterNames();
    public String[] getParaneterValues(String parameter);
    public String getProtoccol();
    public BufferedReader getReader() throws IOException;
    public String getRemoteAddr();
    public String getRemoteHost();
    public String getScheme();
    public String getServerName();
    public int getServerPort();
    public void removeAttribute(String attribute);
    public void setAttribute(String key,Object value);
    public void setCharacterEncoding(String encoding) throws UnsupportedEncodingException;

}
