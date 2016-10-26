/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula07.diasemana;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Classe para utilizar métodos a fim de descobrir o dia da semana de uma data
 * específica.
 * @version 1.0
 */
public class DiaSemana {

    /**
     * Método para ver o tamanho da data recebida e retornar se ela é aceita.
     * @param data final int
     * @return int
     */
    public final int verTamanhoData(final int data) {
        final int tamanhoData = 8;
        String convertido = Integer.toString(data);
        if (convertido.length() == tamanhoData) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Método para verificar se o bissexto recebido é aceitável.
     * @param ano final int
     * @return int
     */
    public final int verificaBissextoDado(final int ano) {
        final int umMenosUm = 0;
        if (ano > umMenosUm) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Método para retornar um vetor com a data recebida.
     * @param data final int
     * @return int[]
     */
    public final int[] converteParaVetor(final int data) {
        String convertida = Integer.toString(data);
        final int tamanho = 8;
        final int metadeDeDois = 1;
        int[]vetor = new int[tamanho];
        for (int contador = 0; contador < tamanho; contador++) {
            vetor[contador] = Integer.parseInt(convertida.substring(contador,
                    contador + metadeDeDois));
        }
        return vetor;
    }

    /**
     * Método para receber um vetor com uma data e retornar seu ano como um
     * inteiro.
     * @param vetor final []int
     * @return int
     */
    public final int fazAno(final int[]vetor) {
        int ano = 0;
        final int milenio = 1000;
        int multiplicador = milenio;
        final int divisor = 10;
        final int tamanhoAno = 4;
        for (int contador = 0; contador < tamanhoAno; contador++) {
            ano = ano + vetor[contador] * multiplicador;
            multiplicador = multiplicador / divisor;
        }
        return ano;
    }

    /**
     * Método para verificar se a data recebida é aceita.
     * @param ano final int
     * @param vetor final []int
     * @return int
     */
    public final int verificaData(final int[]vetor, final int ano) {
        final int dobroDeDois = 4;
        final int seculo = 100;
        final int quatroMaisUm = 5;
        final int doisMaisUm = 3;
        final int seisMaisUm = 7;
        final int dobroDeQuatro = 8;
        final int oitoMaisUm = 9;
        final int cincoMaisUm = 6;
        final int dobroDeCinco = 10;
        final int dobroDeQuinze = 30;
        final int trintaMaisUm = 31; 
        final int vinteMaisOito = 28;
        final int umMenosUm = 0;
        final int metadeDeDois = 1;
        final int dobroDeUm = 2;
        boolean bissexto = (ano % dobroDeDois == umMenosUm) && ((ano % seculo != umMenosUm)
                || (ano % (dobroDeDois * seculo) == umMenosUm));
        if (vetor[dobroDeDois] == 0 && (vetor[quatroMaisUm] == metadeDeDois
                || vetor[quatroMaisUm] == doisMaisUm || vetor[quatroMaisUm] == quatroMaisUm
                || vetor[quatroMaisUm] == seisMaisUm || vetor[quatroMaisUm] == dobroDeQuatro)
                && (vetor[cincoMaisUm] * dobroDeCinco + vetor[seisMaisUm] > trintaMaisUm)) {
            return -1;
        } else if ((vetor[dobroDeDois] == metadeDeDois && (vetor[quatroMaisUm] == umMenosUm
                || vetor[quatroMaisUm] == dobroDeUm))
                && (vetor[cincoMaisUm] * dobroDeCinco + vetor[seisMaisUm] > trintaMaisUm)) {
            return -1;
        } else if ((vetor[dobroDeDois] == umMenosUm && (vetor[quatroMaisUm] == dobroDeDois
                || vetor[quatroMaisUm] == cincoMaisUm || vetor[quatroMaisUm] == oitoMaisUm))
                && (vetor[cincoMaisUm] * dobroDeCinco + vetor[seisMaisUm] > dobroDeQuinze)) {
            return -1;
        } else if ((vetor[dobroDeDois] == metadeDeDois && (vetor[quatroMaisUm] == metadeDeDois))
                && (vetor[cincoMaisUm] * dobroDeCinco + vetor[seisMaisUm] > dobroDeQuinze)) {
            return -1;
        } else if (((vetor[dobroDeDois] == umMenosUm && vetor[quatroMaisUm] == dobroDeUm)
                && bissexto) && vetor[cincoMaisUm] >= doisMaisUm) {
            return -1;
        } else if (((vetor[dobroDeDois] == umMenosUm && vetor[quatroMaisUm] == dobroDeUm) && !bissexto)
                && (vetor[cincoMaisUm] * dobroDeCinco + vetor[seisMaisUm] > vinteMaisOito)) {
            return -1;
        } else if (vetor[umMenosUm] + vetor[metadeDeDois] + vetor[dobroDeUm] + vetor[doisMaisUm] <= umMenosUm) {
            return -1;
        } else if (vetor[dobroDeDois] >= metadeDeDois && vetor[quatroMaisUm] >= doisMaisUm) {
            return -1;
        } else if (vetor[dobroDeDois] + vetor[quatroMaisUm] <= umMenosUm) {
            return -1;
        } else if (vetor[cincoMaisUm] + vetor[seisMaisUm] <= umMenosUm) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Método para verificar a quantidade de dias entre duas datas (Data
     * desejada maior que a data referência).
     * @param desejada final int
     * @param referencia final int
     * @throw ParseExcepcion - Caso a data recebida seja fora dos padrões
     * para ser trabalhada ("yyyMMdd")
     * @return int
     */
    public final long desej(final int desejada, final int referencia) {
        final int milenio = 1000;
        final int vinteMaisQuatro = 24;
        final int dobroDeTrinta = 60;
        try {
            String inicial = Integer.toString(referencia);
            String fim = Integer.toString(desejada);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) / (milenio * dobroDeTrinta
                    * dobroDeTrinta * vinteMaisQuatro);
            return dif;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Método para verificar a quantidade de dias entre duas datas (Data
     * desejada menor que a data referência).
     * @param desejada final int
     * @param referencia final int
     * @throw ParseExcepcion
     * @return int
     */
    public final long ref(final int desejada, final int referencia) {
        try {
            final int milenio = 1000;
            final int vinteMaisQuatro = 24;
            final int dobroDeTrinta = 60;
            String inicial = Integer.toString(desejada);
            String fim = Integer.toString(referencia);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) / (milenio * dobroDeTrinta
                    * dobroDeTrinta * vinteMaisQuatro);
            return dif;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Método para verificar a maior data e retornar o número do dia da semana
     * desejado.
     * @param desejada final int
     * @param referencia final int
     * @param dia final int
     * @return int
     */
    public final int resultado(final int desejada, final int referencia,
            final int dia) {
        long d;
        int contador;
        final int seisMaisUm = 7;
        final int cincoMaisUm = 6;
        final int metadeDeDois = 1;
        if (desejada > referencia) {
            d = desej(desejada, referencia);
            contador = 0;
            while (contador < (d % seisMaisUm)) {
                contador++;
            }
            if (contador + dia > cincoMaisUm) {
                return dia - cincoMaisUm + contador;
            } else {
                return dia + contador;
            }
        } else {
            d = ref(desejada, referencia);
            contador = 0;
            while (contador < (d % seisMaisUm)) {
                contador++;
            }
            if (dia - contador < metadeDeDois) {
                return cincoMaisUm - contador + dia;
            } else {
                return dia - contador;
            }
        }
    }
}
