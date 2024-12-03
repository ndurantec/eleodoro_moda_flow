package eleodoro.eleodoro_moda_flow.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Venda implements Serializable{

    public Venda(int qantidade, double valor, LocalDate data, Pedido pedido) {
        this.qantidade = qantidade;
        this.valor = valor;
        this.data = data;
        this.pedido = pedido;
    }
    public Venda() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int qantidade;
    private double valor;
    private LocalDate data;
    private Pedido pedido;
    
    public int getQantidade() {
        return qantidade;
    }
    public void setQantidade(int qantidade) {
        this.qantidade = qantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + qantidade;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
        Venda other = (Venda) obj;
        if (qantidade != other.qantidade)
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Venda [qantidade=" + qantidade + ", valor=" + valor + ", data=" + data + ", pedido=" + pedido + "]";
    }


   

}
