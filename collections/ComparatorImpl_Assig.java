package collections;
 
import java.util.Comparator;
 
public class ComparatorImpl_Assig implements Comparator<Employee> {

    public int compare(Employee e1,Employee e2)
    {
        System.out.println("comparing e1.salary:"+e1.getDeptno()+" and e2.salary:"+e2.getDeptno());
        
        if ((e1.getDeptno() == e2.getDeptno()))
        {
        	return e1.getDeptno();
        
        }
    }
 
}