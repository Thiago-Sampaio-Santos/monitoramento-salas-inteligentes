package refatorado.observer;

public class ActionTrigger implements SensorObserver{
    @Override
    public void atualizar() {
        System.out.println("Ação disparada com base nos dados do sensor.");
    }
}
