package miscellaneous;
 
import classobjects.Employee;
 
public class StringStringBuilderEx {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stubG


        //immutable concept of String
          String s = "Nancy";


          System.out.println(s+" gupta");

          s = s+ " Gupta";
          String s1 = s+" Gupta"; System.out.println(s); System.out.println(s1);

          String s2 = " Gupta";


        //String imp conversions    

        //char to String        
        char ch = 'n';

        String chstr = Character.toString(ch);
        System.out.println("char ch="+ch+" to String:"+chstr);

        //String to char

        String yesno = "n";

         ch =  yesno.charAt(0);
         System.out.println("String "+yesno+" to char:"+ch);
         System.out.println(ch);

         //char to unicode value

         ch = 'A';
         Character x = ch;  //autoboxing char to Character


         int charval = Character.getNumericValue(ch);

         System.out.println("char ch="+ch+" to Unicode value:"+charval);



        //important methods of string

        String str = "Core Java Batch";

        String str1 = str.substring(5,8);
        System.out.println(str1);

         str1 = str.substring(5);
        System.out.println(str1);

        System.out.println(str.toLowerCase());

        //String to char array
        char[] arr = str.toCharArray();





    }
 
}