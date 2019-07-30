import java.util.*;
 public class QUTS{
 	import java.util.*;

class quts
{
    static class Queue{
        static Stack<Double>S1 = new Stack<Double>();
        static Stack<Double>S2 = new Stack<Double>();
        static void enqueue(double a){

            //move all elements from s1 to s2
            while(!S1.isEmpty())
            {
                S2.push(S1.pop());//s1.pop
            }
//push item into s1
            S1.push(a);
//push everything back to s1
            while(!S2.isEmpty())
            {
                S1.push(S2.pop());//s2.pop

            }

        }
        //Dequeue an item from the queue
        static double dequeue() {

            //if 1st stack is empty
            if (S1.isEmpty())
                {
                    System.out.println("queue is empty");
                    System.exit(0);
                }
                //return top of s1
                double a = S1.peek();
                S1.pop();
                return a;



        } };
    public static void main(String[]args)
    {
        Queue q=new Queue();
        q.enqueue(1.0);
        q.enqueue(2.2);
        q.enqueue(3.43);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }



}
  
