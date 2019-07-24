import java.utill.*;
class StackWithMax{
    static class SMax{
//main stack
    	static Stack<Double>mainstack=new Stack<Double>();
    	//to keep track of max element
    	static Stack<Double>trackstack=new Stack<Double>();

static void push (double x)

{
   mainstack.push(x);
   if (mainstack.size()==1)
   { 
    trackstack,push(x);
    return;
  } 

if(x>trackstack.peek())
     trackstack.push(x);
else
	trackstack.push(trackstack.peek())

}

static double getMax(){

	return trackstack.peek();
}
static void pop()
{ 
mainstack.pop();
trackstack.pop();
}

};

public static void main ( String [] args)
{
  StackWithMax s = new StackWithMax();  
    s.push(21);  
    System.out.println(s.getMax());  
    s.push(14);  
    System.out.println(s.getMax());  
    s.push(28);  
    System.out.println(s.getMax());



}







}