package day04;

import java.io.*;

import java.net.HttpCookie;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 写文件 写100个随机数，读取随机数，排序
 *
 * @author wanfeng
 * @create 2022/3/2
 */
public class One {
    public static void main(String[] args) throws IOException {
        // 写文件
        File file = new File("test.text");
        // 当文件不存在创建文件
        if(!file.exists()){
            file.createNewFile();
        }

//        OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream("test.text",false), StandardCharsets.UTF_8);
//        Random random = new Random();
//        for(int i = 0;i<100;i++){
//            int a = random.nextInt(100);
//            System.out.println(a);
//            fileWriter.write(String.valueOf(a));
//            fileWriter.write(" ");
//        }
//        fileWriter.close();
        FileWriter fileWriter = new FileWriter(file);
        Random random = new Random();
        for(int i = 0;i<100;i++){
            int a = random.nextInt(100);
            fileWriter.write(String.valueOf(a));
            fileWriter.write(" ");
        }
        fileWriter.close();


        Scanner scanner = new Scanner(new FileReader(file));
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String str :s1){
            list.add(Integer.parseInt(str));
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?1:-1;
            }
        });
        System.out.println(list);
    }
}
