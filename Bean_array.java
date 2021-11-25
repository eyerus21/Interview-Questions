/*An array is defined to be a Bean array if it meets the following conditions
7a. If it contains a 9 then it also contains a 13.
b. If it contains a 7 then it does not contain a 16.
So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are
Bean arrays. The following arrays are not Bean arrays:
a. { 9, 6, 18} (contains a 9 but no 13)
b. {4, 7, 16} (contains both a 7 and a 16)*/
import java.util.Scanner;
public class Bean_array {

    static int isBean_array(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==9){
                for (int j=i+1; j<arr.length;j++){
                    if(arr[j]==13)
                        break;
                    else 
                        return 0;    
                }}
            if(arr[i]==7){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==16)
                        return 0;
                        }
            }    
        }
        return 1;
    }
    public static void main(String[] args) {

        Scanner array= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = array.nextInt();
        int[] arr= new int[size];
        System.out.println("enter elements of the array");
        for(int i=0; i<size;i++){
            arr[i]= array.nextInt();

}
        System.out.println(isBean_array(arr));
}

}
// another method is 
/*static int fill(int[] a) {
boolean nine = false;
boolean thirteen = false;
boolean seven = false;
boolean sixteen = true;
for(int i=0; i<a.length; i++){
if(a[i]==9)
nine=true;
if(a[i]==13)
thirteen = true;
if(a[i]==7)
seven = true;
if(a[i]==16)
sixteen = false;
}
If(nine){
If(!thirteen)
Return 0;
If(seven){
If(sixteen)
Return 0;
Return 1;
}*/
