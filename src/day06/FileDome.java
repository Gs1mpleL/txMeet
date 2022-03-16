package com.wanfeng.tmp;

import java.io.File;

/**
 * 文件类  封装一个路径    可以 存在也可以不存在
 * @author wanfeng
 * @create 2022/3/16 11:11
 * @package com.wanfeng.day06
 */
public class FileDome {
    public static void main(String[] args) {
        // 绝对路径
        File absoluteFile = new File("C:\\Users\\Administrator\\Desktop\\a.txt");
        System.out.println(absoluteFile.getAbsoluteFile());

        // 相对路径
        File file = new File("a.txt");
        System.out.println(file.getAbsoluteFile());

        System.out.println(absoluteFile.isDirectory());

        System.out.println(absoluteFile.exists());
    }
}
