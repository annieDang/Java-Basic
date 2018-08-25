package Day_4;

public class Bunny {
	private String name;
	private int age;
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
	
	public void sayHello() {
		 System.out.println("Hi! I'm a " + age + " years old bunny and my name is " + name);
	}
	
	public void introduce() {
		 System.out.println("So I'm a " + age + " years old bunny and my name is " + name);
	}
	
	public void hop() {
		System.out.println("I am hopping!");
	}
	
}
