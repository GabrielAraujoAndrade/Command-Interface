public class ComandosLuz implements Command{

    private Lampada Lampada;

    public ComandosLuz(Lampada Lampada){
        this.Lampada = Lampada;
    }

    @Override
    public void executar() {
        Lampada.mudarLuz();
    }
}
