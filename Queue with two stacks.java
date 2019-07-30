import java.utill.*;
 public class QueueUsingTwoStacks{
 	static class Queue{
 		static Stack<Double>S1 = new Stack<Double>();
	        static Stack<Double>S2 = new Stack<Double>();
 		static void enqueue(int a){

 //move all elements from s1 to s2
 			while(!S1.isempty())
      {
      S2.push(s1.pop());//s1.pop
	  }
//push item into s1
   S1.push(a);
//push everything back to s1
   while(!S2.isempty())
   { 
         S1.push(S2.pop());//s2.pop

   }

}
          //Dequeue an item from the queue
      static double dequeue(){

      //if 1st stack is empty
      	if (S1.isempty()){
          {
          	System.out.println("queue is empty");
          	System.exit(0);
          }
       //return top of s1
          int a=S1.peek();
          S1.pop();
          return a;
   }
 }

}; 
     public static void main(String[]args)
{   
	Queue q=new Queue();
	q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

    System.out.println(q.enqueue());
    System.out.println(q.enqueue());
    System.out.println(q.enqueue());

}


}
