package airConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyAirConditionerTest {

    AirConditioner airConditioner;

    @BeforeEach
    public void setup(){
        airConditioner = new AirConditioner();
    }

    @Test
    public void acTurnOn(){
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void acTurnOff(){
        airConditioner.turnOn();
        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void increaseAcTemperature(){
        airConditioner.turnOn();
        airConditioner.setTemperature(22);
        airConditioner.increaseAcTemperature();
        assertEquals(23, airConditioner.getAcTemperature());
    }

    @Test
    public void decreaseAcTemperature(){
        airConditioner.turnOn();
        airConditioner.setTemperature(30);
        airConditioner.decreaseAcTemperature();
        assertEquals(29, airConditioner.getAcTemperature());
    }

    @Test
    public void checkMaximumTemperature(){
        airConditioner.turnOn();
        airConditioner.setTemperature(30);
        airConditioner.increaseAcTemperature();
        assertEquals(30, airConditioner.getAcTemperature());
    }

    @Test
    public void checkMinimumTemperature(){
        airConditioner.turnOn();
        airConditioner.setTemperature(18);
        airConditioner.decreaseAcTemperature();
        assertEquals(18, airConditioner.getAcTemperature());
    }

}
