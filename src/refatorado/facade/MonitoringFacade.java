package refatorado.facade;

import refatorado.model.*;
import refatorado.report.GeradorRelatorio;

public class MonitoringFacade {
    public void iniciarMonitoramento() {
        SensorTemperatura temp = new SensorTemperatura();
        SensorPresenca pres = new SensorPresenca();
        SensorLuminosidade luz = new SensorLuminosidade();

        temp.coletarDados();
        pres.coletarDados();
        luz.coletarDados();

        if (pres.isPresenca() && luz.getLuminosidade() < 30) {
            System.out.println("Luz acesa.");
        } else {
            System.out.println("Luz apagada.");
        }

        GeradorRelatorio.gerar(temp, pres, luz);
    }
}
