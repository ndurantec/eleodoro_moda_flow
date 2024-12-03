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

    public Avaliacao novoAvaliacao(){
        return new Avaliacao(nota, comentario, dataAvaliacao, venda, cliente);
    }

}
