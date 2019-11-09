package com.littlepage.demo5.stream;

import java.io.InputStream;

public class SocketInputStream {

    private InputStream inputStream;

    private int buffer;
    public SocketInputStream(InputStream inputStream, int buffer) {
        this.inputStream = inputStream;
        this.buffer = buffer;
    }
}
