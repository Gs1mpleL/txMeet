package day06;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wanfeng
 * @created 2022/3/16 12:01
 * @package day06
 */
public class FileOutputStreamDome {
    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt",true);
        fileOutputStream.write(' ');
        byte[] bytes = {'a','b','c','d'};
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes,1,3);




        fileOutputStream.close();
    }
}
