/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula07.diasemana;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**Classe para obter o dia da semana a partir de uma data e referência.
 * @author Hyago Vieira de Souza
 * @version 1.0
 */
public class DiaSemana {

    /**Método para ver o tamanho da data recebida e retornar se ela é aceita.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param data int
     * @return int
     */ 
    public static int verTamanhoData(int data){
        String convertido = Integer.toString(data);
        if(convertido.length() == 8){
            return 0;
        }else{
            return -1;
        }
    }
    
    /**Método para verificar se o bissexto recebido é aceitável.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param ano int
     * @return int
     */ 
    public static int verificaBissextoDado(int ano){
        if(ano > 0){
            return 0;
        }else{
            return -1;
        }
    }
    
    /**Método para retornar o dia da semana correspondente a um certo número.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param dia int
     * @return String - Dia da semana
     */ 
    public static String descobreDia(int dia){
        switch (dia) {
            case 0:
                return "Domingo";
            case 1:
                return "Segunda";
            case 2:
                return "Terça";
            case 3:
                return "Quarta";
            case 4:
                return "Quinta";
            case 5:
                return "Sexta";
            case 6:
                return "Sábado";
            default:
                return "Esse dia da semana não existe.";
        }
    }
    
    /**Método para retornar um vetor com a data recebida.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param data int
     * @return int[]
     */ 
    public static int[] converteParaVetor(int data){
        String convertida = Integer.toString(data);
        int vetor[] = new int[8];
        
        for(int i = 0; i < 8; i++){
            vetor[i] = Integer.parseInt(convertida.substring(i, i+1));
        }
        
        return vetor;
    }
    
    /**Método para receber um vetor com uma data e retornar seu ano como um
     * inteiro.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param vetor []int
     * @return int
     */ 
    public static int fazAno(int []vetor){
        int ano = 0;
        int multiplicador = 1000;
        for(int i = 0; i < 4; i++){
            ano += vetor[i] * multiplicador;
            multiplicador /= 10;
        }
        return ano;
    }
    
    /**Método para verificar se a data recebida é aceita.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param ano int
     * @param vetor []int
     * @return int
     */ 
    public static int verificaData(int []vetor, int ano){
        boolean bissexto = (ano % 4 == 0) && ( (ano % 100 != 0) || 
                (ano % 400 == 0) );
        
        if(((vetor[4] == 0 || vetor[4] == 1) && (vetor[5] == 1 || vetor[5] == 3 
                || vetor[5] == 5 || vetor[5] == 7 || vetor[5] == 8 
                || vetor[5] == 0 || vetor[5] == 2)) && (vetor[6] >= 3 
                && vetor[7] >=2 )){
            return -1;
        }
        else if(((vetor[4] == 0 || vetor[4] == 1) && (vetor[5] == 4 || vetor[5]
                == 6 || vetor[5] == 9 || vetor[5] == 1 )) && (vetor[6] >= 3 
                && vetor[7] >=1 )){
            return -1;
        }
        else if(((vetor[4] == 0 && vetor[5] == 2) && bissexto)&& vetor[6] >= 3){
            return -1;
        }
        else if(((vetor[4] == 0 && vetor[5] == 2) && !bissexto)&& 
                (vetor[6] >= 2 && vetor[7] >= 9)){
            return -1;
        }
        else if (vetor[0] + vetor[1] + vetor[2] + vetor[3] <= 0){
            return -1;
        }
        else if(vetor[4] >= 1 && vetor[5] >= 3){
            return -1;
        }
        else if(vetor[4] + vetor[5] <= 0){
            return -1;
        }
        else if(vetor[6] + vetor[7] <= 0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    /**Método para verificar a quantidade de dias entre duas datas (Data 
     * desejada maior que a data referência).
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param desejada int
     * @param referência int
     * @param d int
     * @throw ParseExcepcion
     * @return int
     */ 
    public static long desej(int desejada, int referência, int d){
        try{
            String inicial = Integer.toString(referência);
            String fim = Integer.toString(desejada);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) /(1000*60*60*24);
            return dif;
        }catch (ParseException e){
            e.printStackTrace();
            return -1;
        }  
    }
    
    /**Método para verificar a quantidade de dias entre duas datas (Data 
     * desejada menor que a data referência).
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param desejada int
     * @param referencia int
     * @param d int
     * @throw ParseExcepcion
     * @return int
     */ 
    public static long ref(int desejada, int referencia, int d){
        try{
            String inicial = Integer.toString(desejada);
            String fim = Integer.toString(referencia);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date dataDe = sdf.parse(inicial);
            Date dataAte = sdf.parse(fim);
            long dif = (dataAte.getTime() - dataDe.getTime()) /(1000*60*60*24);
            return dif;
        }catch (ParseException e){
            e.printStackTrace();
            return -1;
        }
        
    }
    
    /**Método para verificar a maior data e retornar o número do dia da semana
     * desejado.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param desejada int
     * @param referencia int
     * @param dia int
     * @return int
     */ 
    public static int resultado(int desejada, int referencia, int dia){
        long d;
        int i;
        
        if(desejada > referencia){
            d = desej(desejada, referencia, dia);
            for(i = 0; i < d % 7; i++){
            }
            if(i + dia > 6){
                return (i + dia) - 7;
            }
            return i + dia;
        }else{
            d = ref(desejada, referencia, dia);
            for(i = 0; i < d % 7; i++){
            }
            if(dia - i < 0){
                return 7 -(dia +((dia - i)*(-1))) + dia;
            }else{
                return dia - i;
            }
            
        }
        
    }
    
    /**Metodo para ler valor(es) e mostrar/imprimir o dia da semana desejado.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param args String
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma data desejada: ");
        int desejada = ler.nextInt();
        while(verTamanhoData(desejada) == -1){
            System.out.print("Digite uma data maior que 0 e com 8 números: ");
            desejada = ler.nextInt();
        }
        while(verificaData(converteParaVetor(desejada), 
                fazAno(converteParaVetor(desejada))) == -1){
            System.out.print("Data inválida, digite outra data: ");
            desejada = ler.nextInt();
        }
        
        System.out.print("Digite um ano \"bissexto\": ");
        int bi = ler.nextInt();
        while(verificaBissextoDado(bi) == -1){
            System.out.print("Digite um número maior que 0: ");
            bi = ler.nextInt();
        }
        
        System.out.print("Digite uma data para referência: ");
        int referencia = ler.nextInt();
        while(verTamanhoData(referencia) == -1){
            System.out.print("Digite uma data maior que 0 e com 8 números: ");
            referencia = ler.nextInt();
        }
        while(verificaData(converteParaVetor(referencia), 
                fazAno(converteParaVetor(referencia))) == -1){
            System.out.print("Data inválida, digite outra data: ");
            referencia = ler.nextInt();
        }
        
        System.out.print("Digite um dia da semana para referência: ");
        int dia = ler.nextInt();
        while("Esse dia da semana não existe.".equals(descobreDia(dia))){
            System.out.print("Esse dia da semana dado como referência não "
                    + "existe. Digite outro: ");
            dia = ler.nextInt();
        }
        
        System.out.println("Data desejada: " + desejada);
        System.out.println("Data de referência " + referencia);
        System.out.println("Dia da semana de referência: " + descobreDia(dia));
        
        System.out.println("O dia da semana desejado é " 
                + descobreDia(resultado(desejada, referencia, dia)));
        
    }
    
}
