public class ResultadoMP {
    private boolean sucesso;
    private String id;
    private String estado;

    public ResultadoMP(boolean sucesso, String id, String estado) {
        this.sucesso = sucesso;
        this.id = id;
        this.estado = estado;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
