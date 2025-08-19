package inicial;

public class Sala {
    public double temperatura;
    public boolean presenca;
    public int luminosidade;

    SensorTemperatura tempSensor = new SensorTemperatura();
    SensorPresenca presencaSensor = new SensorPresenca();
    SensorLuminosidade luzSensor = new SensorLuminosidade();

    public void monitorar() {
        temperatura = tempSensor.lerTemperatura();
        presenca = presencaSensor.detectarPresenca();
        luminosidade = luzSensor.lerLuminosidade();

        if (presenca && luminosidade < 30) {
            System.out.println("Luz acesa.");
        } else {
            System.out.println("Luz apagada.");
        }
    }
}
