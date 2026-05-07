import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {




        @Test
        public void testThatBikeCanTurnOn() {
            Bike bike = new Bike();
            bike.turnOn();
            assertTrue(bike.isOn());
        }

        @Test
        public void testThatBikeCanTurnOff() {
            Bike bike = new Bike();
            bike.turnOn();
            bike.turnOff();
            assertFalse(bike.isOn());
        }
    @Test
    public void testThatBikeAcceleratesInGearOne() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }
    @Test
    public void testThatBikeAcceleratesWithSpeedAt15InGearOne() {
        Bike bike = new Bike();
        bike.turnOn();

        for (int count = 0; count < 16; count++) {
            bike.accelerate();
        }

        assertEquals(16, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }



    @Test
    public void testThatBikeAcceleratesInGearTwo() {
        Bike bike = new Bike();
        bike.turnOn();

        for (int count = 0; count < 20; count++) {
            bike.accelerate();
        }
         bike.accelerate();
        assertEquals(22, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearThree() {
        Bike bike = new Bike();
        bike.turnOn();

        while(bike.getSpeed() < 31) {
            bike.accelerate();
        }

            bike.accelerate();

        assertEquals(34, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearFour() {
        Bike bike = new Bike();
        bike.turnOn();

       while(bike.getSpeed() < 41) {
            bike.accelerate();
        }
            bike.accelerate();

        assertEquals(45, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }


}
