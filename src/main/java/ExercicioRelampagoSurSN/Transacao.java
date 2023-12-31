package ExercicioRelampagoSurSN;

public class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao(String dataTransacao, int qtde, Produto produto){
        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
