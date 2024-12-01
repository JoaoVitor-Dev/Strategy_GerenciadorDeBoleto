package org.example;


public class Principal {
    public static void main(String[] args) {
        //Banco do Brasil
        final var processadorBB =
                new ProcessarBoletos(LeitorRetornoBB::lerArquivoBb);

        processadorBB.processar("banco-brasil-1.csv");

        //Bradesco
        final var
                processadorBradesco = new ProcessarBoletos(LeitorRetornoBradesco::lerArquivo);

        processadorBradesco.processar("bradesco-1.csv");
    }
}