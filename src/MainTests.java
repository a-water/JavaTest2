import org.junit.*;
import static org.junit.Assert.*;


public class MainTests {

	@Test
	public void testGarageCreation(){
		Garage testGarage = new Garage(5);
		assertTrue(testGarage.getGarageSize() == 5);
	}
	
	@Test
	public void testOldestCarInGarage(){
		Garage testGarage = new Garage(5);
		for(int i=0; i<5; i++){
			Car car = new Car(2000 + (int)(Math.random() * ((2000 - 2000) + 1)), "test");
			testGarage.addCarToGarage(car, i);
		}
		assertTrue(2000 == testGarage.getOldestCar().getYear());
	}
}
