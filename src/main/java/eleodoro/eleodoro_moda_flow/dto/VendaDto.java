package eleodoro.eleodoro_moda_flow.dto;

import java.time.LocalDate;

import eleodoro.eleodoro_moda_flow.modelo.Cliente;
import eleodoro.eleodoro_moda_flow.modelo.Produto;
import eleodoro.eleodoro_moda_flow.modelo.Venda;

public class VendaDto {

    private Long id;
    private Double valorTotal;
    private LocalDate dataVenda;
    private Produto produto;
    private Cliente cliente;

    @Deprecated
    public VendaDto() {
    }

    public VendaDto(Double valorTotal, LocalDate dataVenda, Produto produto, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.produto = produto;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda novoVenda() {
        return new Venda(valorTotal, dataVenda, produto, cliente);
    }

    public Venda atualizarVenda(Venda vendaExistente) {
        if (vendaExistente == null) return null;

        vendaExistente.setValorTotal(this.valorTotal);
        vendaExistente.setDataVenda(this.dataVenda);
        vendaExistente.setProduto(this.produto);
        vendaExistente.setCliente(this.cliente);

        return vendaExistente;
    }

    @Override
    public String toString() {
        return "VendaDto [id=" + id + ", valorTotal=" + valorTotal + ", dataVenda=" + dataVenda +
                ", produto=" + produto + ", cliente=" + cliente + "]";
    }
}
