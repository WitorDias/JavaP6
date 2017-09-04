/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApsProject;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private List<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome) { 
        this.nome = nome; 
    }

    public String getNome() { 
        return nome; 
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " 
                           + getNome() + fimDeLinha;

        for (Aluguel cadaAluguel : fitasAlugadas) {

            double valorCorrente = 0.0;

            // determina valores para cada linha
            // switch com enum
            switch (cadaAluguel.getFita().getCodigoDePreco()) {
            case normal:
                valorCorrente += 2;
                if (cadaAluguel.getDiasAlugada() > 2) {
                    valorCorrente += (cadaAluguel.getDiasAlugada() - 2) 
                                     * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += cadaAluguel.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (cadaAluguel.getDiasAlugada() > 3) {
                    valorCorrente += (cadaAluguel.getDiasAlugada() - 3) 
                                     * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento
            // por pelo menos 2 dias
            if (cadaAluguel.getFita().getCodigoDePreco() 
                    == Fita.Tipo.lancamento
                    && cadaAluguel.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cadaAluguel.getFita().getTitulo() + "\t"
                    + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // for
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";
        return resultado;
    }
}

