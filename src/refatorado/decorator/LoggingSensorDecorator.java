package refatorado.decorator;

import refatorado.model.Sensor;

public class LoggingSensorDecorator extends SensorDecorator {
    public LoggingSensorDecorator(Sensor sensor) {
        super(sensor);
    }

    @Override
    public void coletarDados() {
        System.out.println("Log: iniciando coleta de dados...");
        sensor.coletarDados();
        System.out.println("Log: coleta concluída.");
    }
}
