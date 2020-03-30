package OOP;

public class Car {
	public void throttle() {
		System.out.println("the car can run as long as it is");
	}
	public void speed(int maxSpeed) {
		System.out.println("Maximum speed is "+maxSpeed+"km/h");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car myCar= new Car() ;
     myCar.throttle();
     myCar.speed(500);
	}

}
