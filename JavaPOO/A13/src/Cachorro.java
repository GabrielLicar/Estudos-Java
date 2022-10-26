public class Cachorro extends Lobo{

    private void latir(){
        System.out.println("Latir");
    }

    @Override
    public void emitirSom() {
        System.out.println("AUauauaua!");
    
    }
    public void reagir(String frase){
        if (frase == "toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("Abanar");
        }else if (hora>18){
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(Boolean dono){
        if (dono) {
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(float peso, int idade) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }else {
                latir();
            }
            
        }else {
            System.out.println("Ignorar");
        }
    }
    
}
