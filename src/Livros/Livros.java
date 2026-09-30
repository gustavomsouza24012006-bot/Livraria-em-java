package Livros;

public class Livros {

    private String nomeLivro;
    private int ID;
    private boolean disponivel;

    public Livros(String nomeLivro, int ID) {
        this.nomeLivro = nomeLivro;
        this.ID = ID;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}