public class Mentee extends Usuario {
    private String objetivosDeAprendizado;
    public String getObjetivosDeAprendizado() {
        return objetivosDeAprendizado;
    }
    public void setObjetivosDeAprendizado(String objetivosDeAprendizado) {
        this.objetivosDeAprendizado = objetivosDeAprendizado;
    }
    public void solicitarMentoria() {
        System.out.println(getNome() + " está solicitando mentoria com o objetivo de: " + objetivosDeAprendizado);
    }
}