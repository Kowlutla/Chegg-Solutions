package transport;

public class Test {

	public static void main(String[] args) {
		
		Car car=new Car(2,false,50);
		Truck t=new Truck(10,true,566);
		Car car2=new Car(2,false,50);
		Car car3=new Car(2,true,0);
		Car car4=new Car(2,true,50);
		Truck t2=new Truck(11,true,566);
		Truck t3=new Truck(12,true,566);
		Truck t4=new Truck(13,true,566);
		Branch b=new Branch("kowlutla",10);
		b.addVehicle(car2);
		b.addVehicle(car3);
		b.addVehicle(t);
		b.addVehicle(car4);
		b.addVehicle(t2);
		b.addVehicle(t4);
		b.addVehicle(car);
		
		System.out.println(b.getCars(10));
		
		
		

	}

}
