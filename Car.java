package DataTypes;

public class Car {
	String color, model;
	int year;

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color="White";
		c1.model="Swift";
		c1.year=2022;
		
		System.out.println(c1.color + ":" + c1.model + ":" + c1.year);
		
	}

}
