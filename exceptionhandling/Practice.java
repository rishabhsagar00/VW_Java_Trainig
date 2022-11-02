package exceptionhandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Practice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start execution");
		String fileName = "d://src//abstractexample//AbstractEx.java";
	}
		public void readFromFile(String f){
		fr = null;
		}
		
		try 
		{
			readFromFile(fileName);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("file not found then this show");
		}
	}
	

}
