import java.util.Scanner;

public class Fill_array {

    static int fill_array(int[] arr, int k, int n){
        int[] arr2 = new int[n];
        int t=0;
        for (int i=0; i<n;i++){
            if(t<k){
                arr2[i]=arr[t];
                t++;
        }
            else if(t==k) {
                t=0;
                arr2[i]=arr[t];
                t++;
            }
        }
        return arr2[2];

    }
    
    public static void main(String[] args){
        Scanner array= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = array.nextInt();
        int[] arr= new int[size];
        System.out.println("enter integer number used to indicate from first to K'th element in the array");
        int k= array.nextInt();
        System.out.println("enter integer number used for how many time does the k element have to be repeated ");
        int n= array.nextInt();
        System.out.println("enter elements of the array");
        for(int i=0; i<size;i++){
            arr[i]= array.nextInt();
}
        System.out.println(fill_array(arr,k,n));
      
}


}
