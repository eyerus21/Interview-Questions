/*Write a function named countDigit that returns the number of times that a given digit appears in a
positive number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.
8Other examples:
countDigit(33331, 3) returns 4
countDigit(33331, 6) returns 0
countDigit(3, 3) returns 1
The function should return -1 if either argument is negative, so
countDigit(-543, 3) returns -1. */
import java.util.Scanner;

public class countDigit {

    static int count_Digit(int num,int C_num){
        int i= C_num;
        int count = 0;
    
        if(num<0)
              return -1;
        while (num!=0){
            if(num% 10== i)
                count++;
            num=num/10;}
    
        return count;
    }

    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        System.out.println("enter number");
        int number = num.nextInt();
        System.out.println("enter number to be counted");
        int C_num= num.nextInt();
        System.out.println("the count number is "+count_Digit(number,C_num));

}
}