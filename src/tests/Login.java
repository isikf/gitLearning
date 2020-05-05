package tests;
import java.util.*;

public class Login {
    public static void main(String[] args) {
        final int NUMBERS = 6;
        final int MAX_NUM = 40;
        int prize =100;

        Set<Integer> winNumList = new TreeSet<Integer>();

        Random rn = new Random();


        int number;
        while(winNumList.size()<NUMBERS) {
            number = rn.nextInt(40)+1;
            winNumList.add(number);
            if(number==13) {
                winNumList.clear();
            }
            System.out.println(number);
        }
        System.out.println(winNumList);

        Scanner sc = new Scanner(System.in);

        Set<Integer> userNumList = new TreeSet<Integer>();
        int userNum;
        while(userNumList.size()<NUMBERS) {
            System.out.println("Enter your number: ");
            userNum = sc.nextInt();
            userNumList.add(userNum);
            if(userNum==13) {
                userNumList.clear();
            }
            System.out.println(userNum);
        }
        System.out.println(userNumList);
    }

}
