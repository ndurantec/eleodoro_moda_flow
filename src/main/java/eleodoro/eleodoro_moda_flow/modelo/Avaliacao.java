package eleodoro.eleodoro_moda_flow.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Avaliacao implements Serializable{

    private static final long serialVerionUID = 1L;   

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;    
    private Double nota;
    private String comentario;
    private LocalDate dataAvaliacao;
    private Venda venda;
    private Cliente cliente;
    
    @Deprecated
    public Avaliacao() {
    }

    public Avaliacao(Double nota, String comentario, LocalDate dataAvaliacao, Venda venda, Cliente cliente) {
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
        this.venda = venda;
        this.cliente = cliente;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Avaliacao [id=" + id + ", nota=" + nota + ", comentario=" + comentario + ", dataAvaliacao="
                + dataAvaliacao + ", venda=" + venda + ", cliente=" + cliente + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nota == null) ? 0 : nota.hashCode());
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((dataAvaliacao == null) ? 0 : dataAvaliacao.hashCode());
        result = prime * result + ((venda == null) ? 0 : venda.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Avaliacao other = (Avaliacao) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nota == null) {
            if (other.nota != null)
                return false;
        } else if (!nota.equals(other.nota))
            return false;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (dataAvaliacao == null) {
            if (other.dataAvaliacao != null)
                return false;
        } else if (!dataAvaliacao.equals(other.dataAvaliacao))
            return false;
        if (venda == null) {
            if (other.venda != null)
                return false;
        } else if (!venda.equals(other.venda))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        return true;
    }   
}