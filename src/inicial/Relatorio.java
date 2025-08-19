package inicial;

public class Relatorio {
    public static void gerar(Sala sala) {
        System.out.println("Relatório:");
        System.out.println("Temperatura: " + sala.temperatura);
        System.out.println("Presença: " + sala.presenca);
        System.out.println("Luminosidade: " + sala.luminosidade);
    }
}
