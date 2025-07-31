package airConditioner;

public class AirConditioner {
    public boolean isOn;
    public int acTemperature;

    public AirConditioner() {
        this.isOn = false;
        this.acTemperature = 18;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public boolean isOn() {
            return isOn;
    }

    public void setTemperature(int temperature){
        if (temperature >= 18 && temperature <= 30){
            this.acTemperature = temperature;

        }
    }

    public void increaseAcTemperature(){
        if(isOn){
            if(acTemperature > 18 && acTemperature < 30) {
                acTemperature++;
            }
        }
    }

    public void decreaseAcTemperature(){
        if(isOn && acTemperature > 18){
            acTemperature--;
        }
    }

    public int getAcTemperature() {
        return acTemperature;
    }


}
