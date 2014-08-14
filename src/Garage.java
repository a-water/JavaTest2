
public class Garage {
	
	Car[] carsInGarage;
	
	public Garage(int numberOfCars){
		this.carsInGarage = new Car[numberOfCars];
	}

	
	public Car getOldestCar(){
		if(carsInGarage.length != 0){
			Car oldCar = carsInGarage[0];
			for(Car car : carsInGarage){
				if(car.getYear() < oldCar.getYear())
				{
					oldCar = car;
				}
			}
			return oldCar;
		}
		return new Car(2000, "tarus");
	}
	
	public void addCarToGarage(Car car, int index){
		carsInGarage[index] = car;
	}
	
	public int getGarageSize(){
		return carsInGarage.length;
	}
}
