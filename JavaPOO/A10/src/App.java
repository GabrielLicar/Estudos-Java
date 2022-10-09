import libs.Pessoa;
import pessoas.Aluno;
import pessoas.Funcionario;
import pessoas.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno(); 
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Paulo"); p1.setSexo("Masculino");
        p2.setNome("Joao"); p2.setCurso("Desenvolvimento de Sistemas");
        p3.setNome("Carlos"); p3.setSalario(2500.95);
        p4.setNome("Betty"); p4.setSexo("Feminino"); p4.setSetor("Secretaria");
        
        System.out.println(p1.toString() + " Curso: " +p2.getCurso());
        System.out.println(p2.toString());
        System.out.println(p3.toString() + " Salario: " + p3.getSalario());
        System.out.println(p4.toString() + " Setor: " + p4.getSetor());
    }
}
