package Research;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.testng.annotations.Test;



public class Research {
	
	private Object obj;
	private String methodName;



@Test(priority=2)
public void StringFunctions() {
	
	
	String Name = "My Name is Mohin 123 @ $%^&**()'";
	
	
	///Trimming in Specific Location
	System.out.println(Name.trim().substring(9, 13 ));
	
	///Location OF a charecter
	System.out.println(Name.trim().indexOf('M'));
	
	System.out.println(Name.trim().length());
	String reverse = new StringBuffer(Name).reverse().toString(); 
	String rev = reverse.toString(); 
	
	System.out.println(rev); 
	
	rev = reverse.toLowerCase(); 
	
System.out.println(rev); 
	
	rev = reverse.toUpperCase(); 
System.out.println(rev); 
	
	rev = reverse.intern(); 
System.out.println(rev); 
	
	rev = reverse.concat(Name); 
	System.out.println(rev); 
//	I used this method to turn names backwards and into lower case.Se
	
	String Main = new StringBuffer(Name).toString(); 
	System.out.println(Main.toUpperCase()); 
	
	///Will trim out the whole after one charactercharactor 
	System.out.println(Name.split("@")[0]);
	
	
	
  }



public  void whileLoop(String args[])
{
    int x = 1;

    // Exit when x becomes greater than 4
    while (x <= 4)
    {
        System.out.println("Value of x:" + x);

        //increment the value of x for next iteration
        x++;
    }
}
//
//public class LooppitfallsDemo
//{
//    public static void main(String[] args)
//    {
// 
//        // infinite loop because condition is not apt
//        // condition should have been i>0.
//        for (int i = 5; i != 0; i -= 2)
//        {
//            System.out.println(i);
//        }
//        int x = 5;
// 
//        // infinite loop because update statement
//        // is not provided.
//        while (x == 5)
//        {
//            System.out.println("In the loop");
//        }
//    }
//}


////Java program for out of memory exception.
//import java.util.ArrayList;
//public class Integer1
//{
//  public static void main(String[] args)
//  {
//      ArrayList<Integer> ar = new ArrayList<>();
//      for (int i = 0; i < Integer.MAX_VALUE; i++)
//      {
//          ar.add(i);
//      }
//  }
//}

//class dowhileloopDemo
//{
//    public static void main(String args[])
//    {
//        int x = 21;
//        do
//        {
//            //The line while be printer even
//            //if the condition is false
//            System.out.println("Value of x:" + x);
//            x++;
//        }
//        while (x < 20);
//    }
//}

public static void main(String args[]){  
	  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  


int p = a.length;

String B[]=new String[p];//declaration and instantiation  
B[0]="Karim";//initialization  
B[1]="ASS";//initialization  
B[2]="dss";//initialization  
B[3]="rr";//initialization  
B[4]="cc";//initialization  
  
//printing array  
for(int i=0;i<B.length;i++)//length is the property of array  
System.out.println(B[i]);  

}


	
@Test(priority=1)
	public void MethodInvoke()  throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	  Class c=Class.forName("MainPackage.FlightTour");
      Method m=c.getDeclaredMethod("FlightTourDemo");
//      m=c.getDeclaredMethod("ABCCC");
      Object t = c.newInstance();
      Object o= m.invoke(t); 
	}

}
