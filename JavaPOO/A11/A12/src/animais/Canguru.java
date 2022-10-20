package animais;

import tipos.Mamifero;

public class Canguru extends Mamifero{

    public Canguru(int idade, int membros, float peso, String cor) {
        super(idade, membros, peso, cor);
        locomover();
    }

    public void usarBolsa(){
        System.out.println("usando bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
