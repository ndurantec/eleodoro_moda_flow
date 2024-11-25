package eleodoro.eleodoro_moda_flow.modelo;

import java.time.LocalDate;

public class Devolucao {
    private LocalDate dataDevolucao;
    private String motivo;
    private double valorReembolsado;
    private Venda venda;

    public Devolucao(LocalDate dataDevolucao, String motivo, double valorReembolsado, Venda venda) {
        this.dataDevolucao = dataDevolucao;
        this.motivo = motivo;
        this.valorReembolsado = valorReembolsado;
        this.venda = venda;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValorReembolsado() {
        return valorReembolsado;
    }

    public void setValorReembolsado(double valorReembolsado) {
        this.valorReembolsado = valorReembolsado;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Devolucao{" +
                "dataDevolucao=" + dataDevolucao +
                ", motivo='" + motivo + '\'' +
                ", valorReembolsado=" + valorReembolsado +
                ", venda=" + venda +
                '}';
    }
}
