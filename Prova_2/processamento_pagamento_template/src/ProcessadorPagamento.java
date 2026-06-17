public abstract class ProcessadorPagamento {

    public void realizarPagamento(String usuario, String descricao, int valor) {
        validarDados(usuario, descricao, valor);
        autenticarUsuario(usuario);
        processarPagamento(usuario, descricao, valor);
        enviarRecibo(descricao, valor);
    }

    private void validarDados(String usuario, String descricao, int valor) {
        if (usuario == null || usuario.isBlank()) {
            throw new IllegalArgumentException("Usuário inválido.");
        }

        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição inválida.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }

        System.out.println("Dados validados com sucesso.");
    }

    private void autenticarUsuario(String usuario) {
        System.out.println("Usuário: " + usuario + " autenticado com sucesso.");
    }

    protected abstract void processarPagamento(String usuario, String descricao, int valor);

    private void enviarRecibo(String descricao, int valor) {
        System.out.println("Recibo: " + descricao + " - R$ " + valor);
    }
}