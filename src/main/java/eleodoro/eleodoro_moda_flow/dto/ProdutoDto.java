package eleodoro.eleodoro_moda_flow.dto;

import eleodoro.eleodoro_moda_flow.modelo.Pedido;
import eleodoro.eleodoro_moda_flow.modelo.Produto;

public class ProdutoDto {

    private String nome;
    private String modelo;
    private String cor;
    private int tamanho;
    private Pedido pedido;

    public ProdutoDto() {
    }

    public ProdutoDto(String nome, String modelo, String cor, int tamanho, Pedido pedido) {
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto novoProduto(){
        return new Produto(nome, modelo, cor, tamanho, pedido);
    }

    
    
}
