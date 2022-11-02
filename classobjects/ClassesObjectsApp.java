package classobjects;

public class ClassesObjectsApp {

	public static void main(String[] args) {
		
		
		Employee e=null; //e is reference of type Employee - object reference
		
		e = new Employee(1,"Anubhav Sinha",15000,10);
		 

		//System.out.println(e);
		/*
		System.out.println(e.getEmpid());
		System.out.println(e.getSalary());
		System.out.println(e.getEmpname());
		*/
		
		e.display();

		
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
			/*
		System.out.println(e1.getEmpid());
		System.out.println(e1.getSalary());
		System.out.println(e1.getEmpname());
		*/
		e1.display();

		System.out.println("remaining program continues..");
		
		
		//encapsulated (private) can't access directly
		//e1.empid =-1;
		//e1.salary=0;
		
		  e1.setSalary(0);
		  e1.display();
		//e1.empid = 9;
		  
		  e1.setSalary(1000);
		  e1.display();
		  
		  
		 double annsal =  e1.calcAnnSal();
		 System.out.println(annsal);
		 
		// System.out.println(e1.calcAnnSal());
		
		 
			Employee e3 = new Employee(3,"Paras Joshi",10000,20);
			e3.display();
			annsal = e3.calcAnnSal(5000);
			 System.out.println(annsal);
			 
			 
			 System.out.println("create a emp similar to e3 using copy constructor ");
			 Employee e4 = new Employee(e3);
			 e4.display();
			 
			 System.out.println(e3==e4);
			 
			 //reuse e3 reference
			 e3 = new Employee();
			 e3.display();
			 System.out.println(e3.calcAnnSal());
			 		 

	}

}