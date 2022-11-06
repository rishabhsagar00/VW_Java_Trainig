package containmentex;

public class ContainmentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Department d1 = new Department(10,"Training",5);
		Department dx = new Department(10,"Training",5);
		
		System.out.println(d1==dx);
		System.out.println(d1.equals(dx));
		
		
		
		MyDate today = new MyDate(6,9,2022);
		
		Emp e1 = new Emp(1,"Ram",5000,d1,today);
			System.out.println(e1);
			
		/*
	
	Never create copy of object like this, use a copy constructor
		Department d2 = d1;
		
		d1.setTeamSize(10);
		
		System.out.println(d1);
		System.out.println(d2);
		
		*/
			
		System.out.println("create department d2 as copy of department d1");	
		Department d2 = new Department(d1);	
		System.out.println(d1);
		System.out.println(d2);
		
		d1.setTeamSize(10);
		
		System.out.println(d1);
		System.out.println(d2);
		
		//MyDate copy constructor, date birthdate copy of today date
		
		
		//create employee e2 with department HR but todays joining date
		
		System.out.println("create employee e2 with department HR but todays joining date");
		Department d3= new Department(2,"HR",6);
		Emp e2 = new Emp(2,"Shyam,",7000,d3,today);
		
		e1.getJoinDate().setMonth(1);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(today);
		
		
		
		
	}

}