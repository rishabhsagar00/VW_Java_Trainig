package collections;
 
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class TreeSetEmpEx {
 
    public static void main(String[] args) {
        SortedSet<Employee> sst = new TreeSet<Employee>();

          Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

            sst.add(e1);

            Employee e = new Employee(1,"Anubhav Sinha",15000,10);

            sst.add(e);

            sst.add(new Employee(6,"Sangeeta Shah",35000,20));
            sst.add(new Employee(2,"Raj Malhotra",25000,10)); //duplicate



        System.out.println(sst);


        sst.add(new Employee(4,"Amit Shah",45000,20));

        System.out.println(sst);

        System.out.println(sst.size());

        System.out.println(sst.contains(new Employee(6,"Sangeeta Shah",35000,20)));


        //TreeSet that uses Comparator interface

        System.out.println("Using Comparator interface to sort based on employee's salary..");
        Comparator<Employee> c = new ComparatorImpl();

        SortedSet<Employee> sst1 = new TreeSet<Employee>(c);

          Employee e11 = new Employee(2,"Raj Malhotra",25000,10);

          //c.compare(e11,e11)
            sst1.add(e11);

            Employee e12 = new Employee(1,"Anubhav Sinha",15000,10);

         //   c.compare(e11,e12)
            sst1.add(e12);

            sst1.add(new Employee(6,"Sangeeta Shah",35000,20));
            sst1.add(new Employee(2,"Raj Malhotra",25000,10)); //duplicate



        System.out.println(sst1);


        sst1.add(new Employee(4,"Amit Shah",45000,20));

        System.out.println(sst1);

        System.out.println(sst1.size());

        System.out.println(sst1.contains(new Employee(6,"Sangeeta Shah",35000,20)));


    }
 
}