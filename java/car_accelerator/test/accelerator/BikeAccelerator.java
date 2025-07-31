package accelerator;


public class BikeAccelerator {
    public boolean isOn = false;
    public int speed = 0;
    public int gear = 0;

    public void bikeTurnOn(){
        isOn = true;
    }

    public void bikeTurnOff(){
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int setSpeed(int speed){
        if(isOn){
            this.speed = speed;
            return speed;
        }
        return 0;
    }

    public int setGear(int gear) {
        if(isOn){
            this.gear = gear;
            return gear;
        }
        return 0;
    }

    public int getSpeed(){
        return speed;
    }

    public void BikeAcceleration(){
        if(isOn){
            speed += gear;
        }
    }

    public void bikeDecceleration() {
        if (isOn) {
            speed -= gear;
            if (speed < 0) {
                speed = 0;
            }
        }
    }
}

