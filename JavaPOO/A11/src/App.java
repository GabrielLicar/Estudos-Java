public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();
        a1.setNome("Carlao");
        a1.setIdade(45);
        a1.setCurso("Tecnologia");
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista ab = new Bolsista();

        ab.setMatricula(537);
        ab.setNome("Claudio");
        ab.setBolsa(12.2f);
        ab.setSexo("F");
        ab.pagarMensalidade();
    }


}
