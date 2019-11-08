package com.littlepage.demo3.addservlet;

import java.io.IOException;

/**
 * Servlet 接口
 */
public interface Servlet {
    public void init(ServletConfig config) throws ServletException;
    public void service(ServletRequest requet,ServletResponse response)
        throws ServletException, IOException;
    public void destroy();
    public ServletConfig getServletConfig();
    public String getServletInfo();
}
