class Frog{
	String name;
	int age;
	
	//"type public in front of your methods and you won't go wrong" lol
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName (String newName) {
		name = newName;
	}
	
	public void setAge (int newAge) {
		age = newAge;
	}
	
	//above, you gave the parameters different words so it wouldn't confuse the method vs property...
	//below, you'll see how you can use "this" to differentiate the parameter and the property
	public void setName2 (String name) {
		this.name = name;
	}
	
	public void setAge2 (int age) {
		this.age = age;
	}
	//ie, "this" refers to the object
	//and the property just refers to itself
	
	//here's another way:
	public void setInfo (String name, int age) {
		setName(name);
		setAge(age);
	}
	
	//you actually don't have to use "this" a lot...
	//just when there is ambiguity about whether you are referring to an object
	//or to the class's property
}





public class Application {
	
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.name = "Bertie";
		frog1.age = 2;
		
		System.out.println(frog1.getName());
		//that line printed name from getName. easy
		
		frog1.setName("Nancy");
		//that line runs setName, which changes "name" to the new parameter
		//note how the syntax is different when you use the method,
		//as opposed to initializing a property
		
		System.out.println(frog1.getName());
		//that line printed out name from getName, which was recently changed by setName.
		
		//why do that?
		//one reason is to encapsulate the properties
		//and tinker with them only through methods
	}

}
