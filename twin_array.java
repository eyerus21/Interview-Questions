import java.util.Scanner;


public class twin_array extends primenumber {

    static int istwin_array(int []a){
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])){
            for(int j=0; j<a.length; j++)
            if(isPrime(a[j])){
            if(a[j]-a[i]==2)
            return 1;
            }
            }
            }
            return 0;
    }


    public static void main(String[] args){
        
        Scanner array = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= array.nextInt();
        int[] arr = new int[size];
        for (int i=0; i< size;i++){
            arr[i]= array.nextInt();
        }

        System.out.println(istwin_array(arr));
    }
   


}
