abstract class Employee {
	String name;
	Employee(String n) {
		this.name = n;
	}
	abstract int  claculateSal();

}

class FullTimeEmployee extends Employee {

	int salary;

	FullTimeEmployee(String name,int sal) {
		super(name);
		this.salary = sal;
	}

	int claculateSal() {
		return salary;
	}
}
class PartTimeEmployee extends Employee {
	int salary;
	PartTimeEmployee(String n,int sal,int hours) {
		super(n);
		this.salary = sal * hours;
	}
	int claculateSal() {
		return salary;
	}
}
public class Main {
	public static void main(String[] a) {
		Employee obj1 = new FullTimeEmployee("Dharaneesh",10000);
		Employee obj2= new PartTimeEmployee("Naveen",1000,12);

		System.out.println(obj1.claculateSal());
		System.out.println(obj2.claculateSal());
	}
}