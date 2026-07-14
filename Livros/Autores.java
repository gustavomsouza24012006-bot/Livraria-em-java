package Livros;

public class Autores {

    private int idade;
    private String nome;
    private String AnoDeNascimento;

    public Autores( String nome, int idade, String AnoDeNascimento){
        this.idade = idade;
        this.nome = nome;
        this.AnoDeNascimento = AnoDeNascimento;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeNascimento() {
        return AnoDeNascimento;
    }

    public void setAnoDeNascimento(String anoDeNascimento) {
        AnoDeNascimento = anoDeNascimento;
    }
}
