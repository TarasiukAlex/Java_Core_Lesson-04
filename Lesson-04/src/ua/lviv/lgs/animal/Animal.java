package ua.lviv.lgs.animal;

public class Animal {

	private String name;
	private int speed;
	private int age;

	public Animal(String name, int speed, int age) {
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public static void main(String[] args) {
		
		Animal anml  = new Animal("Leopard", 20, 7);
		
	//	System.out.println(anml.getName() + anml.getSpeed() + anml.getAge());
		System.out.println(anml);
		
		anml.setName("Bull");
		anml.setSpeed(2);
		anml.setAge(14);
		
		System.out.println(anml);

	}

	@Override
	public String toString() {
		return "Animal [name= " + name + ", speed= " + speed + " km/h " +", age= " + age +" years" +"]";
	}

	public String getName() {
		return "Name " + name + " ";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeed() {
		return " Speed " + speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getAge() {
		return " Age " + age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
