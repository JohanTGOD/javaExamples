package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciTest {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(fibonacciChecker(Integer.parseInt(s.nextLine())));
    }

    public static String fibonacciChecker(int num) {
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        for(int i=0; i<list.size();i++){
            if(list.get(i)<num){
                int fibonacci = getNumber(list.get(i),list.get(i+1));
                if(fibonacci == num ||list.get(i)==num || list.get(i+1)==num){
                    return "yes";
                }
                list.add(fibonacci);
            }else{
                return "no";
            }
        }
        return "no";
    }

    public static int getNumber(int previousNumber, int currentValue){
        return previousNumber+currentValue;
    }

}
