package com.littlepage.demo3.addservlet;

import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("primitive servlet init");
    }

    @Override
    public void service(ServletRequest requet, ServletResponse response) throws ServletException, IOException {
        System.out.println("from the service");
        PrintWriter out = response.getWritter();
        out.println("hello.Roses are red.");
        out.println("violets are blue.");

    }

    @Override
    public void destroy() {
        System.out.println("primitive servlet destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}
