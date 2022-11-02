package collections;
 
//import classesobjects.Employee;
 
public class ObjectEquality {
 
    public static void main(String[] args) {


       Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

       Employee e = e1;

    //   Employee e = new Employee(1,"Anubhav Sinha",15000,10);

       System.out.println(e==e1); //true , == checks whether object is actually same (same memory)

       e.setSalary(2500);
 
       System.out.println("e1's salary:"+e1.getSalary());


       Employee e2 = new Employee(2,"Raj Malhotra",25000,10);

       System.out.println("==:"+(e1==e2)); //== gives false  //application pov e1 and e2 are meaningfully same

       System.out.println("equals:"+e1.equals(e2)); //used to check if two reference are meaning fully same (in ur application)

       //Object class equals method works similar to == operator
       int no=5,no1=5;

       System.out.println(no==no1);
 
    }
 
}