package multithreading;

public class MyThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		t1.start();
		
		for(int k =0; k<100;k++) {
		System.out.println(Thread.currentThread().getId()+"i : "+k);
		try
	     {
	       Thread.sleep(1000);
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
}
}}