package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    int id;
    String codBanco;
    LocalDate dataVecimento;
    LocalDateTime dataPagamento;
    String cpfCliente;
    double valor;
    double multa;
    double jurus;
    String agencia;
    String contaBancaria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVecimento() {
        return dataVecimento;
    }

    public void setDataVecimento(LocalDate dataVecimento) {
        this.dataVecimento = dataVecimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJurus() {
        return jurus;
    }

    public void setJurus(double jurus) {
        this.jurus = jurus;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "id=" + id +
                ", codBanco='" + codBanco + '\'' +
                ", dataVecimento=" + dataVecimento +
                ", dataPagamento=" + dataPagamento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", jurus=" + jurus +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}
