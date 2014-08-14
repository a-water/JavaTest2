
public class Main {

	public static void main(String[] args) {
		
		String[] modelArray = new String[10];
		modelArray[0] = "j30";
		modelArray[1] = "m30";
		modelArray[2] = "land rover";
		modelArray[3] = "impreza";
		modelArray[4] = "forrester";
		modelArray[5] = "civic";
		modelArray[6] = "cr-v";
		modelArray[7] = "m3";
		modelArray[8] = "rolls royce";
		modelArray[9] = "m6";
		
		Garage myGarage = new Garage(100);
		for(int i=0; i<100; i++){
			Car car = new Car(1999 + (int)(Math.random() * ((2014 - 1999) + 1)), modelArray[(0 + (int)(Math.random() * ((9 - 0) + 1)))]);
			myGarage.addCarToGarage(car, i);
		}
		
		System.out.println("Number of cars in garage: " + myGarage.getGarageSize());
		System.out.println("Oldest car in the garage: " + myGarage.getOldestCar().getYear());
	}


}
