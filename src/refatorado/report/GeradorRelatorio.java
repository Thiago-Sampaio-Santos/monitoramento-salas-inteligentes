package refatorado.report;

import refatorado.model.*;

public class GeradorRelatorio {
    public static void gerar(SensorTemperatura temp, SensorPresenca pres, SensorLuminosidade luz) {
        System.out.println("Relatório:");
        System.out.println("Temperatura: " + temp.getTemperatura());
        System.out.println("Presença: " + pres.isPresenca());
        System.out.println("Luminosidade: " + luz.getLuminosidade());
    }
}
