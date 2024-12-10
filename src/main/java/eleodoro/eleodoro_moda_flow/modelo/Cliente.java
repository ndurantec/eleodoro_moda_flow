package eleodoro.eleodoro_moda_flow.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cliente implements Serializable {

// mapeamento concluido
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private LocalDate dateCad;
    private String cpf;   
   

    @Deprecated
    public Cliente() {
    }
    
    //tudo ok
     
    public Cliente(String nome, LocalDate dateCad, String cpf) {
        Nome = nome;
        this.dateCad = dateCad;
        this.cpf = cpf;
    }

   

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getDateCad() {
        return dateCad;
    }

    public void setDateCad(LocalDate dateCad) {
        this.dateCad = dateCad;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Cliente [Nome=" + Nome + ", dateCad=" + dateCad + ", cpf=" + cpf + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((dateCad == null) ? 0 : dateCad.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        Cliente other = (Cliente) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (dateCad == null) {
            if (other.dateCad != null)
                return false;
        } else if (!dateCad.equals(other.dateCad))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    public Map<String, ?> getId() {
        return null;
    }

}
