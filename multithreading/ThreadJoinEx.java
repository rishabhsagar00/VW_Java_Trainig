package multithreading;
 
//A Java program for understanding   
//the joining of threads  
 
//import statement  
import java.io.*;  
 

public class ThreadJoinEx  
{  
//main method  
public static void main (String argvs[])  
{  
 
    
System.out.println("Main Thread started executing..");
//creating 3 threads  
Thread th1 = new MyThread();  
 

//thread th1 starts  
th1.start();  
 

//starting the second thread after when  
//the first thread th1 has ended or died.  
try  
{  
System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
 
//invoking the join() method  
th1.join();   //here its blocking call and main thread will be blocked/wait till th1 thread completes
}  
//catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  
 
System.out.println("Main Thread joined at the end of MyThread and now it conrinued its processing ahead..");
 
}  
}  