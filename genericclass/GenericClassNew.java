package genericclass;
 
import java.util.function.BiFunction;
import java.util.function.Function;
 

public class GenericClassNew {


    public static void main(String[] args)
    {
        GenericMethod ob = new GenericMethod();

        ob.<Integer>showdata(10);


        ob.<String>showdata("Namrata");


     int r = ob.<Integer>adddata(10,20,(a,b)->a+b);

          System.out.println("r="+r);

    }


<T> void showdata(T element)
    {
         System.out.println(element.getClass().getName()
                 + " = " + element);



    }


<T> T adddata(T e1,T e2,BiFunction<T,T,T> bif)
    {

        //return e1+e2;
        return bif.apply(e1, e2);
    }



 
}