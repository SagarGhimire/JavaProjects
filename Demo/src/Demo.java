
class Employee{
	private String name;
	private int ssn;
	private double salary;
	
	public Employee(String name,int ssn, double salary) {
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployeeInfo() {
	   printSocialSecurityandName();
	   System.out.println("Salary = "+getSalary());
	}
	public void printSocialSecurityandName() {
		System.out.print("Name = "+getName() + " "+"SocialSecurity = "+ getSsn()+" ");
	}
}


class StarPrinter{
	private static String star = "*";
	public void printStar() {
		for(int i =1;i<6;i++) {
			System.out.print(star);
			star = star + "*";
			System.out.println();
		}
	}
}
class PrimeFinder{
	public void PrimeFinder() {
		for(int i = 4;i<101;i++) {
			if(isPrime(i)) {
				System.out.print(i + " , ");
			}
			
		}
	}
	public boolean isPrime(int x) {
		for(int i =2;i<=Math.sqrt(x);i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Demo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Sagar", 1234556,780.8);
		Employee emp1 = new Employee("Rakesh",986392,3748.3);
		emp.printEmployeeInfo();
		emp1.printSocialSecurityandName();
		System.out.println();
		
		
		StarPrinter starp = new StarPrinter();
		starp.printStar();
		
		PrimeFinder prime = new PrimeFinder();
		prime.PrimeFinder();
	}

}
