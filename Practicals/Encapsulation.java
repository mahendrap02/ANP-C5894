package OOPs;
//student

class task
{
	private String name;
	private int age;
  private int jobroll;
  private String location;

	//getName method
	public String getName() {
		return name;
	}
	
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge method
	public int getAge() {
		return age;
	}
	
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}

  //getRollno method
  public int getjobroll() {
		return jobroll;
	}

  //setRollno method
  public void setjobroll(int jobroll) {
		this.jobroll = jobroll;
	}

  //getAddress method
	public String getlocation() {
		return location;
	}
	
	//setAddress method
	public void setlocation(String location) {
		this.location = location;
	}

}

class Main
{
	public static void main(String[] args)
	{
		//Creating instance of class Encapsulation
		Task t=new Task();
		
		//Setting values
		e.setName("mahi");
		e.setAge(22);
      e.setJobroll(Developer);
      e.setLocation("kalyan");
		
		//Print values
		System.out.println("Name is:" + e.getName());
		System.out.println("Age is:" + e.getAge());
      System.out.println("JobRoll is:" + e.getjobRoll());
      System.out.println("Location is:" + e.getlocation());

		
	}
}

	