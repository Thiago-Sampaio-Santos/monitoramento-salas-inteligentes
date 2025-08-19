package refatorado.strategy;

public class ReportStrategy implements ActionStrategy {
    @Override
    public void executar() {
        System.out.println("Relatório gerado pela estratégia.");
    }
}
