package org.example.interpreter;

public class Financeiro {
    public static String formula = "valorAluguel + resultado";

    public static double calcularReajuste(double valorAluguel, double indice, double resultado) {
        String expressao;
        expressao = formula.replace("valorAluguel", Double.toString(valorAluguel));
        expressao = expressao.replace("indice", Double.toString(indice));
        expressao = expressao.replace("resultado", Double.toString(valorAluguel * indice));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
