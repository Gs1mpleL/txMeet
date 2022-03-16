package day06;

import java.io.*;

/**
 * 字符流通过判断第一个字节是不是负数来判断是不是中文
 * @author wanfeng
 * @created 2022/3/16 12:23
 * @package day06
 */
public class FileReader {
    public static void main(String[] args) throws IOException {
        test();
    }

    public static void test() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("a.txt")));
        outputStreamWriter.write("data汉字");
        // 不flush就不会进去
        outputStreamWriter.flush();

        // close前会自动刷新
        outputStreamWriter.close();
    }
}
