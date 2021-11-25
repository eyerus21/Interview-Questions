public class oop {
    public static void main(String[] args) {

      sec myObj = new sec();
      System.out.println("it's "+ myObj.x);

      


    }
}

class sec {

   int x;  // Create a class attribute

    // Create a class constructor for the Main class
   public sec() {
   x = 5;  // Set the initial value for the class attribute x

   }
}

