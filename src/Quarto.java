public class Quarto {
        Command command;
    private Lampada lampada;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executarComando(){
        command.executar();
    }

    public Quarto(){
        this.lampada = new Lampada();
    }
    public void trocarluz(){
        lampada.mudarLuz();
    }
}
