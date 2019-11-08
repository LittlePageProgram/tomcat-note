package com.littlepage.demo3.addservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public interface ServletResponse {
    public void flushBuffer() throws IOException;
    public int getBufferSize();
    public String getCharacterEncoding();
    public Locale getLocale();
    public ServletOutputStream getOutputStream() throws IOException;
    public PrintWriter getWritter() ;
    public boolean isCommitted();
    public void reset();
    public void resetBuffer();
    public void setBufferSize(int size);
    public void setContentLength(int length);
    public void setContentType(String type);
    public void setLocale(Locale locale);
}
