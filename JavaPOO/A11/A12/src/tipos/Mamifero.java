package tipos;
public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(int idade, int membros, float peso, String cor){
        this.setPeso(peso);
        this.setMembros(membros);
        this.setIdade(idade);
        this.setCorPelo(cor);
        System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Idade: " + idade);
        System.out.println("Cor: " + cor);
        System.out.println("Membros: " + membros);
        System.out.println("Peso: " + peso);
        System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Ta mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}