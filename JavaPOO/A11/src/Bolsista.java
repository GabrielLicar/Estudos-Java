public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsita");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
