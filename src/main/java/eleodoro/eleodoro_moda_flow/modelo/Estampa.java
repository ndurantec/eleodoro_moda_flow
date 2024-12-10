package eleodoro.eleodoro_moda_flow.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estampa implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String imagem;
    private String tipo;
    private double comprimento;   
   
    public Estampa() {
    }

    public Estampa(String imagem, String tipo, double comprimento) {
        this.imagem = imagem;
        this.tipo = tipo;
        this.comprimento = comprimento;
    }

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Estampa [id=" + id + ", imagem=" + imagem + ", tipo=" + tipo + ", comprimento=" + comprimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((imagem == null) ? 0 : imagem.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(comprimento);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Estampa other = (Estampa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (imagem == null) {
            if (other.imagem != null)
                return false;
        } else if (!imagem.equals(other.imagem))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
            return false;
        return true;
    }    
   
    public Estampa novoEstampa(){
        return new Estampa(imagem, tipo, comprimento);
    }

    public void setNome(Object nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }
}
