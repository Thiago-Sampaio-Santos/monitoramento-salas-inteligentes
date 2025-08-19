package refatorado.model;

public class SensorPresenca implements Sensor {
    private boolean presenca;

    @Override
    public void coletarDados() {
        presenca = Math.random() > 0.5;
    }
    
    public boolean isPresenca() {
        return presenca;
    }
}
