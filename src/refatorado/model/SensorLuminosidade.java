package refatorado.model;

public class SensorLuminosidade implements Sensor{
    private int luminosidade;

    @Override
    public void coletarDados() {
        luminosidade = (int)(Math.random() * 100);
    }

    public int getLuminosidade() {
        return luminosidade;
    }
}
