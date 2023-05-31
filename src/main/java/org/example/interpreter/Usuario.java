package org.example.interpreter;

public class Usuario {
    private double valorAluguel;
    private double indice;

    private double resultado;

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }

    public double calcularReajuste() {
        return Financeiro.calcularReajuste(this.valorAluguel, this.indice, this.resultado);
    }
}
