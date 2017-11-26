package Research;
import java.lang.reflect.*;

import MainPackage.FlightTour;


import java.lang.reflect.InvocationTargetException; 
import java.lang.reflect.Method; 

public class ReflectionClass {

    public static void main(String[] args) 
    throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c=Class.forName("MainPackage.FlightTour");
        Method m=c.getDeclaredMethod("FlightTourDemo");
        Object t = c.newInstance();
        Object o= m.invoke(t);       
    } 
}