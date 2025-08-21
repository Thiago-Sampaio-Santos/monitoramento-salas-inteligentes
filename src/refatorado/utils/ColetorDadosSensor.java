package refatorado.utils;

import refatorado.model.Sensor;

public class ColetorDadosSensor {
    public static void coletar(Sensor sensor) {
        System.out.println("Coletando dados do sensor: " + sensor.getClass().getSimpleName());
        sensor.coletarDados();
    }
}
