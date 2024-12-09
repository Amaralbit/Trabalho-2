import java.util.ArrayList;

public class Grupo {
    private int id;
    private String nome;
    private String descricao;
    private ArrayList<Usuario> listaDeMembros;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Usuario> getListaDeMembros() {
        return listaDeMembros;
    }

    public void setListaDeMembros(ArrayList<Usuario> listaDeMembros) {
        this.listaDeMembros = listaDeMembros;
    }
}

