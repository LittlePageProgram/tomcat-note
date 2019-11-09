package com.littlepage.demo5.startup;

import com.littlepage.demo5.connector.HttpConnector;

public class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}
