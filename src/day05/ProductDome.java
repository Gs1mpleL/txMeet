package day05;

import java.util.ArrayList;

/**
 * @author wanfeng
 * @created 2022/3/4 23:06
 * @package day05
 */
public class ProductDome {
    public static int product(ArrayList<Integer>list){
        int ans = 1;
        for(Integer i:list){
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);

        System.out.println(ProductDome.product(list));
    }
}
