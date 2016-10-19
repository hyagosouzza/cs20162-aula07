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
        if (ano > 0) {
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
        int[]vetor = new int[tamanho];
        for (int contador = 0; contador < tamanho; contador++) {
            vetor[contador] = Integer.parseInt(convertida.substring(contador,
                    contador + 1));
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
        final int mil = 1000;
        int multiplicador = mil;
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
        final int quatro = 4, cem = 100, cinco = 5, tres = 3, sete = 7,
                oito = 8, seis = 6, nove = 9, dez = 10, trinta = 30,
                trintaUm = 31, vinteOito = 28;
        boolean bissexto = (ano % quatro == 0) && ((ano % cem != 0)
                || (ano % (quatro * cem) == 0));
        if (vetor[quatro] == 0 && (vetor[cinco] == 1
                || vetor[cinco] == tres || vetor[cinco] == cinco
                || vetor[cinco] == sete || vetor[cinco] == oito)
                && (vetor[seis] * dez + vetor[sete] > trintaUm)) {
            return -1;
        } else if ((vetor[quatro] == 1 && (vetor[cinco] == 0
                || vetor[cinco] == 2))
                && (vetor[seis] * dez + vetor[sete] > trintaUm)) {
            return -1;
        } else if ((vetor[quatro] == 0 && (vetor[cinco] == quatro
                || vetor[cinco] == seis || vetor[cinco] == nove))
                && (vetor[seis] * dez + vetor[sete] > trinta)) {
            return -1;
        } else if ((vetor[quatro] == 1 && (vetor[cinco] == 1))
                && (vetor[seis] * dez + vetor[sete] > trinta)) {
            return -1;
        } else if (((vetor[quatro] == 0 && vetor[cinco] == 2)
                && bissexto) && vetor[seis] >= tres) {
            return -1;
        } else if (((vetor[quatro] == 0 && vetor[cinco] == 2) && !bissexto)
                && (vetor[seis] * dez + vetor[sete] > vinteOito)) {
            return -1;
        } else if (vetor[0] + vetor[1] + vetor[2] + vetor[tres] <= 0) {
            return -1;
        } else if (vetor[quatro] >= 1 && vetor[cinco] >= tres) {
            return -1;
        } else if (vetor[quatro] + vetor[cinco] <= 0) {
            return -1;
        } else if (vetor[seis] + vetor[sete] <= 0) {
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
     * @param d final int
     * @throw ParseExcepcion - Caso a data recebida seja fora dos padrões
     * para ser trabalhada ("yyyMMdd")
     * @return int
     */
    public final long desej(final int desejada, final int referencia,
            final int d) {
        final int mil = 1000, vinteQuatro = 24, sessenta = 60;
        try {
            String inicial = Integer.toString(referencia);
            String fim = Integer.toString(desejada);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) / (mil * sessenta
                    * sessenta * vinteQuatro);
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
     * @param d final int
     * @throw ParseExcepcion
     * @return int
     */
    public final long ref(final int desejada, final int referencia,
            final int d) {
        try {
            final int mil = 1000, vinteQuatro = 24, sessenta = 60;
            String inicial = Integer.toString(desejada);
            String fim = Integer.toString(referencia);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) / (mil * sessenta
                    * sessenta * vinteQuatro);
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
        final int sete = 7, seis = 6;
        if (desejada > referencia) {
            d = desej(desejada, referencia, dia);
            contador = 0;
            while (contador < (d % sete)) {
                contador++;
            }
            if (contador + dia > seis) {
                return dia - seis + contador;
            } else {
                return dia + contador;
            }
        } else {
            d = ref(desejada, referencia, dia);
            contador = 0;
            while (contador < (d % sete)) {
                contador++;
            }
            if (dia - contador < 1) {
                return seis - contador + dia;
            } else {
                return dia - contador;
            }
        }
    }
}
