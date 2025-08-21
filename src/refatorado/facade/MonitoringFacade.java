package refatorado.facade;

import refatorado.decorator.LoggingSensorDecorator;
import refatorado.factory.SensorFactory;
import refatorado.model.*;
import refatorado.report.GeradorRelatorio;
import refatorado.utils.ColetorDadosSensor;

public class MonitoringFacade {
    public void iniciarMonitoramento() {
        SensorTemperatura temp = (SensorTemperatura) SensorFactory.criarSensor("temperatura");
        SensorPresenca pres = (SensorPresenca) SensorFactory.criarSensor("presenca");
        SensorLuminosidade luz = (SensorLuminosidade) SensorFactory.criarSensor("luminosidade");

        // Decorator aplicado ao sensor de temperatura
        Sensor tempComLog = new LoggingSensorDecorator(temp);

        ColetorDadosSensor.coletar(tempComLog);
        ColetorDadosSensor.coletar(pres);
        ColetorDadosSensor.coletar(luz);

        if (pres.isPresenca() && luz.getLuminosidade() < 30) {
            System.out.println("Luz acesa.");
        } else {
            System.out.println("Luz apagada.");
        }

        GeradorRelatorio.gerar(temp, pres, luz);
    }
}
