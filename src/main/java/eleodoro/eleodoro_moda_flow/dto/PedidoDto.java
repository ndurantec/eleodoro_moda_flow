package eleodoro.eleodoro_moda_flow.dto;

import java.time.LocalDate;

import eleodoro.eleodoro_moda_flow.modelo.Estampa;
import eleodoro.eleodoro_moda_flow.modelo.Pedido;

public class PedidoDto {

    private Long id;
    private int quantidade;
    private LocalDate data;
    private double valorTotal;
    private Estampa estampa;

    @Deprecated
    public PedidoDto() {
    }  

    public PedidoDto(int quantidade, LocalDate data, double valorTotal, Estampa estampa) {
        this.quantidade = quantidade;
        this.data = data;
        this.valorTotal = valorTotal;
        this.estampa = estampa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }

    @Override
    public String toString() {
        return "PedidoDto [id=" + id + ", quantidade=" + quantidade + ", data=" + data + ", valorTotal=" + valorTotal
                + ", estampa=" + estampa + "]";
    }

    public Pedido novoPedido() {
        return new Pedido(quantidade, data, valorTotal, estampa);
    }

    

}
