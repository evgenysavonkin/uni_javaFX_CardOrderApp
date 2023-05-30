package com.evgeny.order;

import java.io.RandomAccessFile;
public class FileActions {
    public static RandomAccessFile file = null;
    public static String FILE_NAME = "order-info.txt";
    public static void openFile(){
        try{
            file = new RandomAccessFile(FILE_NAME, "rw");
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}