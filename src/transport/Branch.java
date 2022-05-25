package transport;

public class Branch {
	// Attributes
	private String name;
	private Vehicle arrvehicles[];
	private int nbVehicles;
	// Constructor
	public Branch(String name, int size) {
		this.name = name;
		arrvehicles = new Vehicle[size];
	}

	/*
	 * Method to add new vehicle to branch. return true id vehicle is added return
	 * false if branch is full
	 */
	public boolean addVehicle(Vehicle v) {
		if (nbVehicles == arrvehicles.length) {
			return false;
		} else {
			arrvehicles[nbVehicles] = v;
			nbVehicles++;
			return false;
		}
	}
	// Method to return no of cars that have mileage larger than given mileage
	public int getCars(int mil) {
		int count = 0;
		for (int i = 0; i < nbVehicles; i++) {
			if (arrvehicles[i] instanceof Car) {
				Car car = (Car) arrvehicles[i];
				if (car.getMileage() > mil) {
					count++;
				}
			}
		}
		return count;
	}
	// Method to split vehicles
	public void splitVehicles(double lod, Car[] arrCars, Truck[] arrTruck) {
		int carIndex = 0;
		int truckIndex = 0;
		for (int i = 0; i < nbVehicles; i++) {
			/*
			 * if current vehicle is car store them in car array && if current vehicle is
			 * not a type of car then it must and should be Truck only
			 */
			if (arrvehicles[i] instanceof Car) {
				Car c = (Car) arrvehicles[i];
				if (c.rented) {
					arrCars[carIndex] = c;
					carIndex++;
				}
			} else {
				Truck t = (Truck) arrvehicles[i];
				if (t.getLoad() < lod) {
					arrTruck[truckIndex] = t;
					truckIndex++;
				}
			}
		}
	}
}
