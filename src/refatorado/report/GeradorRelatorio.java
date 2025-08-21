package refatorado.report;

import refatorado.model.*;

public class GeradorRelatorio {
    public static void gerar(SensorTemperatura temp, SensorPresenca pres, SensorLuminosidade luz) {
        System.out.println("\n========== RELATÓRIO DO MONITORAMENTO ==========\n");
        System.out.println(" Temperatura : " + temp.getTemperatura());
        System.out.printf(" Presença    : %s%n", pres.isPresenca() ? "Detectada" : "Não detectada");

        System.out.println(" Luminosidade: " + luz.getLuminosidade());
    }
}
