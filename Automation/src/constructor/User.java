package constructor;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford = new Car();
		ford.colour = "White";
		ford.model = "Zen";
		Car.wheels = 5;
		ford.features();

		Car benz = new Car();
		benz.colour = "Black";
		benz.model = "C10";
		//benz.wheels = 6;
		benz.features();

		Car bmw = new Car("White" , "430C");
		bmw.features();
		
	}

}
