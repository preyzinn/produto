public class Produto {
    private double preco;
    private String nome;
    private String descricao;
    private int quantidade;
    
    public Produto(double preco, String nome, String descricao, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    // Getters
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
