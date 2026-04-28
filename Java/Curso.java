/* - Crie uma classe Curso com código e nome
   - Crie uma classe Aluno, contendo nome, cpf,idade e o Curso que o aluno frequenta
   - Lembre-se de criar um construtor, bem como os métodos get e set para as classes
   - Crie uma classe TestaAluno para testar as classes criada*/

public class Curso {
    // Atributos
    private String codigo;
    private String nome; 
    // Construtor
    public Curso(String codigoInicial, String nomeInicial) {
        codigo = codigoInicial;
        nome = nomeInicial;
    }
    // Getters
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo; 
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }
}

// Sem 'public' para n dá erro ao compilar, já que as classes estão no mesmo arquivo por praticidade do exercício 
class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private Curso curso;

    public Aluno(String nomeInicial, String cpfInicial, int idadeInicial, Curso cursoInicial) {
        nome = nomeInicial;
        cpf = cpfInicial;
        idade = idadeInicial;
        curso = cursoInicial;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public Curso getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }  
    public void setCpf(String cpf) {
        this.cpf = cpf; 
    }    
    public void setIdade(int idade) {
        this.idade = idade; 
    }
    public void setCurso(Curso curso) {
        this.curso = curso; 
    }
}

class TestaAluno {
    public static void main(String[] args) {
        Curso c = new Curso("IF686", "PLC");
        Aluno a = new Aluno("João", "123.456.789-01", 21, c);
        
        System.out.println("Nome: " + a.getNome());
        System.out.println("CPF: " + a.getCpf());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Curso: " + a.getCurso().getNome());
        System.out.println("Codigo do Curso: " + a.getCurso().getCodigo());

        a.setNome("Pedro");
        c.setCodigo("CIN0145");
        c.setNome("Programação Concorrente");
        
        System.out.println("\nDepois das alteracoes:");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Codigo do Curso: " + a.getCurso().getCodigo());   
        System.out.println("Curso: " + a.getCurso().getNome()); 
    }
}