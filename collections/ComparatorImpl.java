package collections;
 
import java.util.Comparator;
 
public class ComparatorImpl implements Comparator<Employee> {



    public int compare(Employee e1,Employee e2)
    {
        System.out.println("comparing e1.salary:"+e1.getSalary()+" and e2.salary:"+e2.getSalary());
        return (int)(e1.getSalary() - e2.getSalary());
    }
 
}