package org.example.interpreter;

public class Financeiro {
    public static String formula = "valorAluguel + (valorAluguel * indice)";

    public static double calcularReajuste(double valorAluguel, double indice) {
        String expressao;
        expressao = formula.replace("valorAluguel", Double.toString(valorAluguel));
        expressao = expressao.replace("indice", Double.toString(indice));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
