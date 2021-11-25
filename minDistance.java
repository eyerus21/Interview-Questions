/*Write a function named minDistance that returns the smallest distance between two factors of a
number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 -
11 = 2). As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
and the smallest distance between any two factors is 1 (2 – 1 = 1).
*/

import java.util.Scanner;
public class minDistance {

    static int isminDistance(int n){
        int min=n;
        for (int i=1; i<n; i++){
            if(n%i==0){
                for(int j=i+1; j<n; j++){
                    if(n%j==0){
                        if(min > j-i)
                            min= j-i;
                        break;
                    }
                }

        }
   }
        return min;}

    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        System.out.println("enter a number");
        int number= num.nextInt();
        System.out.println("the min distance is "+ isminDistance(number));


    
    
}}
