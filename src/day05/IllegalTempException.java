package day05;

import java.io.*;
import java.util.Scanner;

/**
 * @author wanfeng
 * @created 2022/3/4 22:32
 * @package day05
 */
public class IllegalTempException extends Exception{
    public IllegalTempException(String message) {
        super(message);
    }


    public static void main(String[] args) throws IOException {
        File file = new File("temps.txt");

        try(Scanner scanner = new Scanner(new FileReader(file))){
            while(scanner.hasNextLine()){
                int num =  scanner.nextInt();
                System.out.println(num);
                if(num < 10 || num > 30){
                    throw new IllegalTempException("The temperature must be between 10 and 30.");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
