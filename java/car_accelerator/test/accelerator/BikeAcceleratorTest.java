package accelerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeAcceleratorTest {

    BikeAccelerator bikeAccelerator;

    @BeforeEach
    public void setUp(){
        bikeAccelerator = new BikeAccelerator();
    }

    @Test
    public void turnBikeOn(){
        bikeAccelerator.bikeTurnOn();;
        assertTrue(bikeAccelerator.isOn());
    }

    @Test
    public void turnBikeOff(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.bikeTurnOff();
        assertFalse(bikeAccelerator.isOn());

    }

    @Test
    public void bikeAccelerationAtGearOneIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(1);
        bikeAccelerator.setSpeed(15);
        bikeAccelerator.BikeAcceleration();
        assertEquals(16, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeDeccelerationAtGearOneIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(1);
        bikeAccelerator.setSpeed(15);
        bikeAccelerator.bikeDecceleration();
        assertEquals(14, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeAccelerationAtGearTwoIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(2);
        bikeAccelerator.setSpeed(26);
        bikeAccelerator.BikeAcceleration();
        assertEquals(28, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeDeccelerationAtGearTwoIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(2);
        bikeAccelerator.setSpeed(24);
        bikeAccelerator.bikeDecceleration();
        assertEquals(22, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeAccelerationAtGearThreeIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(3);
        bikeAccelerator.setSpeed(35);
        bikeAccelerator.BikeAcceleration();
        assertEquals(38, bikeAccelerator.getSpeed());
    }
    @Test
    public void bikeDeccelerationAtGearThreeIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(3);
        bikeAccelerator.setSpeed(35);
        bikeAccelerator.bikeDecceleration();
        assertEquals(32, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeAccelerationAtGearFourIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(4);
        bikeAccelerator.setSpeed(44);
        bikeAccelerator.BikeAcceleration();
        assertEquals(48, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeDeccelerationAtGearFourIsOn(){
        bikeAccelerator.bikeTurnOn();
        bikeAccelerator.setGear(4);
        bikeAccelerator.setSpeed(44);
        bikeAccelerator.bikeDecceleration();
        assertEquals(40, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeAccelerationAtGearZeroIsOff(){
        bikeAccelerator.bikeTurnOff();
        bikeAccelerator.setGear(0);
        bikeAccelerator.setSpeed(0);
        bikeAccelerator.BikeAcceleration();
        assertEquals(0, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeDeccelerationAtGearThreeIsOff(){
        bikeAccelerator.bikeTurnOff();
        bikeAccelerator.setGear(3);
        bikeAccelerator.setSpeed(0);
        bikeAccelerator.bikeDecceleration();
        assertEquals(0, bikeAccelerator.getSpeed());
    }

    @Test
    public void bikeAccelerationAtGearTwoIsOff(){
        bikeAccelerator.bikeTurnOff();
        bikeAccelerator.setGear(4);
        bikeAccelerator.setSpeed(24);
        bikeAccelerator.bikeDecceleration();
        assertEquals(0, bikeAccelerator.getSpeed());
    }


}