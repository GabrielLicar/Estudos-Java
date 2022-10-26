import animais.Cachorro;
import animais.Canguru;

public class App {
    public static void main(String[] args) throws Exception {

        Canguru cc = new Canguru(5, 4, 56.8f, "Marrom");
        cc.alimentar();
        cc.emitirSom();
        cc.usarBolsa();

        Cachorro kk = new Cachorro(1, 4, 20f, "Caramelo");
        kk.abanarRabo();
        kk.alimentar();
        kk.enterrarOsso();
        kk.emitirSom();
    }
}
