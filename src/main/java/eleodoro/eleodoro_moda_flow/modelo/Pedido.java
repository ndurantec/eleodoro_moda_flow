package eleodoro.eleodoro_moda_flow.modelo;

import java.time.LocalDate;

public class Pedido {
    

    public Pedido(int quantidade, LocalDate data, double valorTotal, Estampa estampa) {
        this.quantidade = quantidade;
        this.data = data;
        this.valorTotal = valorTotal;
        this.estampa = estampa;
        }
    
    public Pedido() {
    }

        private int quantidade;
        private LocalDate data;
        private double valorTotal;
        private Estampa estampa;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Estampa getEstampa() {
        return estampa;
    }

    public void setEstampa(Estampa estampa) {
        this.estampa = estampa;
    }
    
    @Override
    public String toString() {
        return "Pedido [quantidade=" + quantidade + ", data=" + data + ", valorTotal=" + valorTotal + ", estampa="
                + estampa + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quantidade;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valorTotal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((estampa == null) ? 0 : estampa.hashCode());
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
        Pedido other = (Pedido) obj;
        if (quantidade != other.quantidade)
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (Double.doubleToLongBits(valorTotal) != Double.doubleToLongBits(other.valorTotal))
            return false;
        if (estampa == null) {
            if (other.estampa != null)
                return false;
        } else if (!estampa.equals(other.estampa))
            return false;
        return true;
    }

    
}
