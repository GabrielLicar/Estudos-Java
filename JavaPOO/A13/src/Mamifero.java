public class Mamifero extends Animal{
    public String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    

}
