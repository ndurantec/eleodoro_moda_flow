package eleodoro.eleodoro_moda_flow.modelo;

import java.time.LocalDate;

public class Venda {

    public Venda(int qantidade, double valor, LocalDate data) {
        this.qantidade = qantidade;
        this.valor = valor;
        this.data = data;
    }

    public Venda() {
    }

    private int qantidade;
    private double valor;
    private LocalDate data;

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

@Override
public String toString() {
    return "Venda [qantidade=" + qantidade + ", valor=" + valor + ", data=" + data + "]";
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
    return true;
}


   

}
