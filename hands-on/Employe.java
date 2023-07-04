package OOPs;


class Employe
{
	private String name;
	private int age;
	private String jobroll;
	private int salary;
	private String location;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobroll() {
		return jobroll;
	}
	public void setJobroll(String jobroll) {
		this.jobroll = jobroll;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
class Task
{
	public static void main(String[]args)
	{
		Employe e=new Employe();
		
		e.setName("Mahi");
		e.setAge(21);
		e.setJobroll("Developer");
		e.setSalary(10000);
		e.setLocation("kalyan");
		
		
		System.out.println("Name is:"+ e.getName());
		System.out.println("Age :"+ e.getAge() );
		System.out.println("Job Roll :"+ e.getJobroll());
		System.out.println("Salary :"+ e.getSalary());
		System.out.println("Location :"+ e.getLocation());
		
 }
	
}
}

	

	