package refatorado.strategy;

public class LightOnStrategy implements ActionStrategy {
    @Override
    public void executar() {
        System.out.println("Luz acesa pela estratégia.");
    }
}
