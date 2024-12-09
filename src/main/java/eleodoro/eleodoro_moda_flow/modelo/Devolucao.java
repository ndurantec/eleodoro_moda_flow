package eleodoro.eleodoro_moda_flow.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Devolucao implements Serializable{
    
    private static final long SerialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataDevolucao;
    private String motivo;
    private double valorReembolsado;
    private Venda venda;

      public Devolucao(LocalDate dataDevolucao, String motivo, double valorReembolsado, Venda venda) {
        this.dataDevolucao = dataDevolucao;
        this.motivo = motivo;
        this.valorReembolsado = valorReembolsado;
        this.venda = venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValorReembolsado() {
        return valorReembolsado;
    }

    public void setValorReembolsado(double valorReembolsado) {
        this.valorReembolsado = valorReembolsado;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Devolucao{" +
                "dataDevolucao=" + dataDevolucao +
                ", motivo='" + motivo + '\'' +
                ", valorReembolsado=" + valorReembolsado +
                ", venda=" + venda +
                '}';
    }

    public void setNome(Object nome) {
    }
}
