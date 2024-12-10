package eleodoro.eleodoro_moda_flow.dto;

import java.time.LocalDate;

import eleodoro.eleodoro_moda_flow.modelo.Avaliacao;
import eleodoro.eleodoro_moda_flow.modelo.Pedido;
import eleodoro.eleodoro_moda_flow.modelo.Cliente;

public class ClienteDto {
    private Long id;
    private String Nome;
    private LocalDate dateCad;
    private String cpf;
       
        public ClienteDto() {
    }   

        @Deprecated
    
        public ClienteDto(String nome, LocalDate dateCad, String cpf) {
            Nome = nome;
            this.dateCad = dateCad;
            this.cpf = cpf;
        }   
    
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
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
            return "ClienteDto [Nome=" + Nome + ", dateCad=" + dateCad + ", cpf=" + cpf + ", id=" + id + "]";
        }




}