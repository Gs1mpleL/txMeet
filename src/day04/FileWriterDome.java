package day04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * txMeet
 *
 * @author wanfeng
 * @create 2022/3/3
 */
public class FileWriterDome {
    public static void main(String[] args) throws IOException {
        // 打开文件夹看看创建的位置，是在该项目目录中->相对路径
        File file = new File("注意文件创建位置.txt");
        // 如果文件不存在就创建
        if(!file.exists()){
            file.createNewFile();
        }

        // 注意第二个参数true  ->  这个代表是否继续写，就是 写在文件末尾，如果是false，就是 把文件清空后再重新写入
        FileWriter fileWriter = new FileWriter(file,true);
        // public class FileWriter extends OutputStreamWriter  -> 继承关系
        //     /**
        //     * Writes a single character.
        //     *
        //     * @exception  IOException  If an I/O error occurs
        //     */
        // 上边是 write方法的源码    可以看到注释->写入一个字符，所以说这里int代表的一个字符
        // int来代表字符，是ASCII码的知识点 可以百度一下，有一张表，  看这里65就代表‘A’
        // 所以想写出来数字本身，需要先传化成String或者char
        fileWriter.write(65);
        // 如果不关闭就会write失败
        fileWriter.close();
    }
}
