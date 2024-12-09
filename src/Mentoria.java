public class Mentoria {
    private int id;
    private Mentora mentora;
    private Mentee mentee;
    private String dataHora;
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mentora getMentora() {
        return mentora;
    }

    public void setMentora(Mentora mentora) {
        this.mentora = mentora;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

