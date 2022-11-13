package genericclass;
 
import java.util.function.BiFunction;
import java.util.function.Function;
 

public class GenericMethod {


    public static void main(String[] args)
    {
        GenericMethod ob = new GenericMethod();

        ob.<Integer>showdata(10);


        ob.<String>showdata("Namrata");


     //    ob.<Integer>adddata(10,20);

    }


<T> void showdata(T element)
    {
         System.out.println(element.getClass().getName()
                 + " = " + element);



    }

    /*
<T> T adddata(T e1,T e2)
    {
        return e1+e2;

    }
    */


 
}