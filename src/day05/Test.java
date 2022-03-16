package day05;

/**
 * @author wanfeng
 * @created 2022/3/4 22:12
 * @package day05
 */
public class Test {
    public void m1() throws Exception {
        throw new Exception();
    }public void m2() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            Test test = new Test();
            test.m1();
            test.m2();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
