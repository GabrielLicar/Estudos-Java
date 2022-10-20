package tipos;
public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo um ninho");
    }

    @Override
    public void locomover() {
        
    }

    @Override
    public void alimentar() {
        
    }

    @Override
    public void emitirSom() {
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
