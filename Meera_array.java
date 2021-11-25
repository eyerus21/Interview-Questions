import java.util.Scanner;

public class Meera_array {
    static int ismeeraArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++)
            if(arr[i]*2==arr[j])
            return 0;
            }
            return 1;
    }
    public static void main(String[] args){
        
        Scanner array = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= array.nextInt();
        int[] arr = new int[size];
        for (int i=0; i< size;i++){
            arr[i]= array.nextInt();
        }

        System.out.println(ismeeraArray(arr));
    }


}
