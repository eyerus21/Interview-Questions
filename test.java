import java.util.Scanner;
public class test {
    static int ishallow(int[] arr){
        int zerocount=3;
        int i;
        for (i=0; i<zerocount;i++)
            if(i%2==0)
                return 1;
            System.out.println(i);
            return 1; }   
    
    public static void main(String[] args){

        Scanner array= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = array.nextInt();
        int[] arr= new int[size];
        System.out.println("enter elements of the array");
        for(int i=0; i<size;i++){
            arr[i]= array.nextInt();
}
        System.out.println(ishallow(arr));

    }
}
