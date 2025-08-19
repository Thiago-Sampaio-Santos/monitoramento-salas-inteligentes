package refatorado.factory;

import refatorado.model.Sensor;
import refatorado.model.*;

public class SensorFactory {
    public static Sensor criarSensor(String tipo) {
        return switch (tipo) {
            case "temperatura" -> new SensorTemperatura();
            case "presenca" -> new SensorPresenca();
            case "luminosidade" -> new SensorLuminosidade();
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }
}
