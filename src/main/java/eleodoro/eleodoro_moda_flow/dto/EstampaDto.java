package eleodoro.eleodoro_moda_flow.dto;

import eleodoro.eleodoro_moda_flow.modelo.Estampa;

public class EstampaDto {

    private String nome;
    private String imagem;
    private String tipo;
    private double comprimento;
        
    public EstampaDto() {
    }

    public EstampaDto(String nome, String imagem, String tipo, double comprimento) {
        this.nome = nome;
        this.imagem = imagem;
        this.tipo = tipo;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public Estampa novaEstampa(){
        return new Estampa(nome, null, imagem, tipo, comprimento);
    }

    public Estampa novoEstampa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoEstampa'");
    }
    
  
  
    
    

}