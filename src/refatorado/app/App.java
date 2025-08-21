package refatorado.app;

import refatorado.facade.MonitoringFacade;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n=========== INICIANDO MONITORAMENTO ===========\n");
        MonitoringFacade facade = new MonitoringFacade();
        facade.iniciarMonitoramento();
        System.out.println("\n=============== FIM DO RELATÓRIO ===============\n");
    }
}
