import java.util.Scanner;

public class primenumber{
    
    static boolean isPrime(int num){

        if(num<= 1)
          return false;
        for (int i = 2; i < num; i++) {
          // condition for nonprime number
          if (num % i == 0) 
            return false;
          
         }
    
        return true;
    }

    public static void main(String[] args){

//         Scanner num= new Scanner(System.in);
//         System.out.println("Enter a prime number");
//         int numbers= num.nextInt();
         
//       System.out.println(isPrime(numbers)); 
 }
}