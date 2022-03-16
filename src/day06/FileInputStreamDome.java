package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *  字节流：以字节为基本单位 , 在 java.io包中，大部分操作继承InputStream（输入字节流）类和OutputStream（输出字节流）类
 *  字符流：两个字节为基本单位，专门处理字符串和文本，对于字符流进行操作的类主要是Reader（读取流）类和 Writer（写入流）类。
 * @author wanfeng
 * @created 2022/3/16 11:31
 * @package day06
 */
public class FileInputStreamDome {
    public static void main(String[] args) throws Exception {
        test();
    }


    public static void test() throws Exception {
        // 创建一个文件对象
        File file = new File("a.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.length());
        // 创建一个输入对象
        FileInputStream fileInputStream = new FileInputStream(file);
        // 输入一个字符
        // System.out.println((char)fileInputStream.read());


        byte[] bytes = new byte[1024];
        int len = fileInputStream.read(bytes);
        System.out.println(new String(bytes,0, len));
    }
}
