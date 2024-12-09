public class Sistema implements Autenticavel, Avaliavel, Notificavel {
    @Override
    public void login(String email, String senha) {
        System.out.println("Usuário logado com sucesso.");
    }

    @Override
    public void logout() {
        System.out.println("Usuário deslogado.");
    }

    @Override
    public void avaliarMentoria(int mentoriaId, int nota) {
        System.out.println("Mentoria " + mentoriaId + " avaliada com nota " + nota);
    }

    @Override
    public void visualizarAvaliacoes() {
        System.out.println("Visualizando avaliações.");
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada: " + mensagem);
    }

    public void exibirPerfil(Usuario usuario) {
        usuario.visualizarPerfil();
    }
}
