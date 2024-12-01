package org.example;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.ProcessarBoletos.FORMATO_DATA;

public class LeitorRetornoBB {
    public static List<Boleto> lerArquivoBb(String caminhoArquivo) {
        try {
            List<String> linhas = Files.readAllLines(Path.of(caminhoArquivo));//ler todo o arquivo
            var boletos = new ArrayList<Boleto>(linhas.size());

            for (String linha : linhas) {
                String[] vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setDataVecimento(LocalDate.parse(vetor[2],FORMATO_DATA));
                boleto.setDataPagamento(LocalDate.parse(vetor[3],FORMATO_DATA).atStartOfDay());
                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setJurus(Double.parseDouble(vetor[6]));
                boleto.setMulta(Double.parseDouble(vetor[7]));

                boletos.add(boleto);
            }
            return boletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);//nesse caso não é obrigado a tratar o erro.
        }
    }
}
