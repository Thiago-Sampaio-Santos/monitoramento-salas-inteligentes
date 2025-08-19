package refatorado.model;

public class SensorTemperatura implements Sensor {
    private double temperatura;

    @Override
    public void coletarDados() {
        temperatura = Math.random() * 40;
    }

        public double getTemperatura() {
        return temperatura;
    }
}
