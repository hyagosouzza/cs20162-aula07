package com.github.hyagosouzza.cs20162aula07.diasemana;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiaSemanaTest {
    
    @Test
    public void testverificaBissexto(){
        int ano = 0;
        int expResult = -1;
        int result = DiaSemana.verificaBissextoDado(ano);
        assertEquals(expResult, result);
    }

    @Test
    public void testDescobreDia() {
        int dia = 0;
        String expResult = "Domingo";
        String result = DiaSemana.descobreDia(dia);
        assertEquals(expResult, result);

    }

    @Test
    public void testConverteParaInteiro() {
        int data = 20161005;
        int vetor[] = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 0;
        vetor[6] = 0;
        vetor[7] = 5;
        int[] expResult = vetor;
        int[] result = DiaSemana.converteParaVetor(data);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testFazAno() {
        int v[] = new int[8];
        v[0] = 2;
        v[1] = 0;
        v[2] = 1;
        v[3] = 6;
        v[4] = 1;
        v[5] = 0;
        v[6] = 0;
        v[7] = 5;

        int[] vetor = v;
        int expResult = 2016;
        int result = DiaSemana.fazAno(vetor);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerificaData() {
        int v[] = new int[8];
        v[0] = 2;
        v[1] = 0;
        v[2] = 1;
        v[3] = 6;
        v[4] = 1;
        v[5] = 0;
        v[6] = 0;
        v[7] = 5;
        int[] vetor = v;
        int ano = 2016;
        int expResult = 0;
        int result = DiaSemana.verificaData(vetor, ano);
        assertEquals(expResult, result);

    }

    @Test
    public void testDesej() {
        int desejada = 20161005;
        int referencia = 20161003;
        int d = 1;
        long expResult = 2L;
        long result = DiaSemana.desej(desejada, referencia, d);
        assertEquals(expResult, result);

    }

    @Test
    public void testRef() {
        int desejada = 20161002;
        int referencia = 20161005;
        int d = 0;
        long expResult = 3L;
        long result = DiaSemana.ref(desejada, referencia, d);
        assertEquals(expResult, result);
    }

    @Test
    public void testResultado() {
        int desejada = 20161005;
        int referencia = 20161004;
        int dia = 2;
        int expResult = 3;
        int result = DiaSemana.resultado(desejada, referencia, dia);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testVerTamanho(){
        int data = 12;
        int expResult = -1;
        int result = DiaSemana.verTamanhoData(data);
        assertEquals(expResult, result);
    }
    
}
