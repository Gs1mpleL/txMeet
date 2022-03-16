package day04;

import test.ArrayIndexOutOfBoundsException;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 主动报错
 * @author wanfeng
 * @create 2022/3/2
 */
public class Three {
    ArrayList<Integer> arr;

    /**
     * 创建一个ArrayList 100个随机值
     */
    Three(){
        arr = new ArrayList<>();
        Random random = new Random();
        for(int i = 0;i<100;i++){
            arr.add(random.nextInt(100));
        }
    }

    /**
     * 如果index超出范围就会报错
     */
    public void findInIndex(int index) throws ArrayIndexOutOfBoundsException {
        if(index<0 || index>arr.size()){
            // 判断出错误的情况，直接new对象并throws  如果在方法内不做catch处理，就在类方法上throws 在外部方法来处理
            throw new ArrayIndexOutOfBoundsException();
        }else {
            System.out.println(arr.get(index));
        }
    }


    // 外部方法 如果在此处还throw  就会抛到jvm虚拟机，显示在控制台
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        Three three = new Three();
        // 不做catch处理，就必须在方法上throws xxx
        three.findInIndex(scanner.nextInt());
        System.out.println("running...");
    }
}
