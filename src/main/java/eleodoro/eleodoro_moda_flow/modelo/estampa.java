package eleodoro.eleodoro_moda_flow.modelo;

public class estampa {

    private String imagem;
    private String tipo;
    private double comprimento;
   
   
    public estampa() {
    }


    public estampa(String imagem, String tipo, double comprimento) {
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


    

    @Override
    public String toString() {
        return "estampa [imagem=" + imagem + ", tipo=" + tipo + ", comprimento=" + comprimento + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        estampa other = (estampa) obj;
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


    


}
