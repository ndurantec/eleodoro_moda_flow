package eleodoro.eleodoro_moda_flow.dto;

import eleodoro.eleodoro_moda_flow.modelo.Estampa;
import eleodoro.eleodoro_moda_flow.modelo.Produto;

public class EstampaDto {

    private String imagem;
    private String tipo;
    private double comprimento;
  
  
    public EstampaDto() {
    }
    
    
     public EstampaDto(String imagem, String tipo, double comprimento) {
        this.imagem = imagem;
        this.tipo = tipo;
        this.comprimento = comprimento;
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


    public Estampa novoEstampa(){
        return new Estampa(imagem, tipo, comprimento);

    }
}