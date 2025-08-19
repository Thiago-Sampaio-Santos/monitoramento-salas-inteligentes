package inicial;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---------------------------------");
        Sala sala = new Sala();
        sala.monitorar();
        Relatorio.gerar(sala);
        System.out.println("---------------------------------\n");
    }
}
