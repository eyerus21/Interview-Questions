
import java.util.Scanner;
public class sumIsPower {
  
   static boolean isPower(int []a){
      int sum = 0;
    for (int i = 0; i < a.length; i++){
        sum+= a[i];
    }

    while(sum >1){
        if( sum%2!=0){
            return false;
        }
        else
            sum= sum/2;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner array= new Scanner(System.in);
    System.out.println("Enter size of the array:");
    int num= array.nextInt();
    int[]arr=new int[num];
    System.out.println("Enter elements of the array:");
    for(int i = 0; i < num; i++){
        arr[i]=array.nextInt();
    }
   
    System.out.println(isPower(arr));

   }


    
}
