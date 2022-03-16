package day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * txMeet
 * 网页内容读取
 * @author wanfeng
 * @create 2022/3/2
 */
public class Two {
    public static void main(String[] args) throws Exception {
        String url = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openConnection().getInputStream(), StandardCharsets.UTF_8));
        String a;
        ArrayList<Integer> list = new ArrayList<>();
        while((a = in.readLine())!=null){
            System.out.println(a);
            String[] s = a.split(" ");
            for(String str:s){
                int tmp = Integer.parseInt(str);
                list.add(tmp);
            }
        }
        int sum = 0;
        for(int x:list){
            sum+=x;
        }
        System.out.println(sum/list.size());
    }
}
