public class Main {
    public static void main(String[] args) {

        Quarto Sala = new Quarto();
        Lampada lampada = new Lampada();
        ComandosLuz ComandosSala = new ComandosLuz(lampada);
        Sala.setCommand(ComandosSala);
        Sala.executarComando();

    }
}