package day06;

import java.io.*;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 写文件存储 Date double 2.5 数组 1，2，3，4，5，    并读取文件
 * @author wanfeng
 * @create 2022/3/16 10:50
 * @package com.wanfeng.tmp
 */
public class Dome1 {

    /**
     * 将这些数据写入文件
     */
    public static void writeToFile() throws ParseException, IOException {
        // 日期 并格式化
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        // double
        double num = 2.5;
        // 数组
        int[] arr = {1,2,3,4,5};
        // 写入文件
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("a.txt")));
        outputStreamWriter.write(dateStr);
        outputStreamWriter.write("\n");
        outputStreamWriter.write(String.valueOf(num));
        outputStreamWriter.write("\n");
        for (int j : arr) {
            outputStreamWriter.write(String.valueOf(j));
            outputStreamWriter.write(" ");
        }
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    /**
     * 读文件
     */
    public static void read() throws Exception{
        Scanner scanner = new Scanner(new FileReader("a.txt"));
        String str;
        while(scanner.hasNextLine()){
            str = scanner.nextLine();
            System.out.println(str);
        }
    }


    public static void main(String[] args) throws Exception {
        Dome1.writeToFile();
        Dome1.read();
    }
}
