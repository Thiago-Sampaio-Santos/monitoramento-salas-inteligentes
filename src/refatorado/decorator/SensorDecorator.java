package refatorado.decorator;

import refatorado.model.Sensor;

public abstract class SensorDecorator implements Sensor {
    protected Sensor sensor;

    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }

    
    @Override
    public void coletarDados() {
        sensor.coletarDados(); 
    }
}
