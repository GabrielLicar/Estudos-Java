package animais;

import tipos.Mamifero;

public class Cachorro extends Mamifero{
    public Cachorro(int idade, int membros, float peso, String cor) {
        super(idade, membros, peso, cor);
    }

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom(){
        System.out.println("AUAUAUAUAUAU");
    }
}
