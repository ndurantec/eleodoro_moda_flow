package eleodoro.eleodoro_moda_flow.dto;

import java.time.LocalDate;

import eleodoro.eleodoro_moda_flow.modelo.Avaliacao;
import eleodoro.eleodoro_moda_flow.modelo.Cliente;
import eleodoro.eleodoro_moda_flow.modelo.Venda;

public class AvaliacaoDto {
    
    private Double nota;
    private String comentario;
    private LocalDate dataAvaliacao;
    private Venda venda;
    private Cliente cliente;

    
    public AvaliacaoDto() {
    }

    public AvaliacaoDto(Double nota, String comentario, LocalDate dataAvaliacao, Venda venda, Cliente cliente) {
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
        this.venda = venda;
        this.cliente = cliente;
    }


    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Avaliacao novoAvaliacao(){
        return new Avaliacao(nota, comentario, dataAvaliacao, venda, cliente);
    }

}
