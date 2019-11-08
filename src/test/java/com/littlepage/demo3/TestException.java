package com.littlepage.demo3;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
    @Test
    public void excepytionTest(){
        try{
            File file = new File("ss");
            FileReader fr = new FileReader(file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
