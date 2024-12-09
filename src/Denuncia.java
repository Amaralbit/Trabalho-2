public class Denuncia {
    private int id;
    private String descricao;
    private Usuario usuarioReportado;
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuarioReportado() {
        return usuarioReportado;
    }

    public void setUsuarioReportado(Usuario usuarioReportado) {
        this.usuarioReportado = usuarioReportado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
