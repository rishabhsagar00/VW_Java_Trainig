package collections;
 
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
 
public class TreeMapEx {
 
    public static void main(String[] args) {


        SortedMap<Employee,Double> smp = new TreeMap<Employee,Double>();

        Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

        smp.put(e1,e1.getSalary());

        Employee e = new Employee(1,"Raghav Sinha",15000,10);

        smp.put(e,e.getSalary());


        smp.put (new Employee(3,"Sangeeta Shah",35000,20),35000.0);
        smp.put(new Employee(2,"Raj Malhotra",25000,10),25000.0);

        System.out.println(smp);


        //sort employee keys of tree map in ascending order of emp salary

        System.out.println("sort employee keys of tree map in ascending order of emp salary");
        Comparator<Employee> c = new ComparatorImpl();
        smp = new TreeMap<Employee,Double>(c);

        Employee e11 = new Employee(2,"Raj Malhotra",25000,10);

        smp.put(e11,e11.getSalary());

        Employee ee = new Employee(1,"Raghav Sinha",15000,10);

        smp.put(ee,ee.getSalary());


        smp.put (new Employee(3,"Sangeeta Shah",35000,20),35000.0);
        smp.put(new Employee(2,"Raj Malhotra",25000,10),25000.0);

        System.out.println(smp);

        System.out.println("sort employee keys of tree map in ascending order of emp names");
        Comparator<Employee> c1 = new ComparatorImplEmpNames();
        meth(c1);





    }

    public static void meth(Comparator<Employee> c)
    {
         TreeMap<Employee,Double> smp = new TreeMap<Employee,Double>(c);

            Employee e11 = new Employee(2,"Raj Malhotra",25000,10);

            smp.put(e11,e11.getSalary());

            Employee ee = new Employee(1,"Raghav Sinha",15000,10);

            smp.put(ee,ee.getSalary());


            smp.put (new Employee(3,"Sangeeta Shah",35000,20),35000.0);
            smp.put(new Employee(2,"Raj Malhotra",25000,10),25000.0);

            System.out.println(smp);

    }
 
}