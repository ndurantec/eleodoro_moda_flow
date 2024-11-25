import java.time.LocalDate;

public class Avaliacao {
    
    public Avaliacao(Double nota, String comentario, LocalDate dataAvaliacao, Venda venda) {
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
        this.venda = venda;
    }

    public Avaliacao() {
    }
    
    private Double nota;
    private String comentario;
    private LocalDate dataAvaliacao;
    private Venda venda;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nota == null) ? 0 : nota.hashCode());
        result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result = prime * result + ((dataAvaliacao == null) ? 0 : dataAvaliacao.hashCode());
        result = prime * result + ((venda == null) ? 0 : venda.hashCode());
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
        return true;
    }

    @Override
    public String toString() {
        return "Avaliacao [nota=" + nota + ", comentario=" + comentario + ", dataAvaliacao=" + dataAvaliacao
                + ", venda=" + venda + "]";
    }

    
    
    
}
