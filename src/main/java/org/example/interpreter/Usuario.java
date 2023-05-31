package org.example.interpreter;

public class Usuario {
    private double valorAluguel;
    private double indice;

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public double calcularReajuste() {
        return Financeiro.calcularReajuste(this.valorAluguel, this.indice);
    }
}
