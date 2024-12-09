public class Mentora extends Usuario {
    private String[] areasDeEspecializacao;
    public String[] getAreasDeEspecializacao() {
        return areasDeEspecializacao;
    }
    public void setAreasDeEspecializacao(String[] areasDeEspecializacao) {
        this.areasDeEspecializacao = areasDeEspecializacao;
    }
    public void oferecerMentoria() {
        System.out.println(getNome() + " está oferecendo mentoria nas áreas: " + String.join(", ", areasDeEspecializacao));
    }
}