package com.github.hyagosouzza.cs20162aula07.diasemana;
import org.junit.Test;
import static org.junit.Assert.*;
public class DiaSemanaTest {
    @Test
    public void testVerTamanhoData() {
        int data = 12345;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verTamanhoData(data);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerTamanhoData2() {
        int data = 123456789;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verTamanhoData(data);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerTamanhoData3() {
        int data = 12345678;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verTamanhoData(data);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaBissextoDado() {
        int ano = 0;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaBissextoDado(ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaBissextoDado2() {
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaBissextoDado(ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia() {
        int dia = -1;
        DiaSemana instance = new DiaSemana();
        String expResult = "Esse dia da semana não existe.";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia2() {
        int dia = 0;
        DiaSemana instance = new DiaSemana();
        String expResult = "Domingo";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia3() {
        int dia = 2;
        DiaSemana instance = new DiaSemana();
        String expResult = "Terça";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia4() {
        int dia = 3;
        DiaSemana instance = new DiaSemana();
        String expResult = "Quarta";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia5() {
        int dia = 4;
        DiaSemana instance = new DiaSemana();
        String expResult = "Quinta";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia6() {
        int dia = 5;
        DiaSemana instance = new DiaSemana();
        String expResult = "Sexta";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia7() {
        int dia = 6;
        DiaSemana instance = new DiaSemana();
        String expResult = "Sábado";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescobreDia8() {
        int dia = 1;
        DiaSemana instance = new DiaSemana();
        String expResult = "Segunda";
        String result = instance.descobreDia(dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testConverteParaVetor() {
        int data = 20161005;
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 0;
        vetor[6] = 0;
        vetor[7] = 5;
        int[] expResult = vetor;
        DiaSemana instance = new DiaSemana(); 
        int[] result = instance.converteParaVetor(data);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testFazAno() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 1;
        vetor[7] = 5;
        DiaSemana instance = new DiaSemana();
        int expResult = 15;
        int result = instance.fazAno(vetor);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 1;
        vetor[7] = 5;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData2() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData3() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 0;
        vetor[7] = 0;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData4() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 0;
        vetor[7] = 1;
        int ano = 0000;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData5() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 0;
        vetor[6] = 1;
        vetor[7] = 0;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData6() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 3;
        vetor[6] = 1;
        vetor[7] = 0;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData7() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 9;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    public void testVerificaData8() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    public void testVerificaData9() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 4;
        vetor[4] = 0;
        vetor[5] = 1;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData10() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 4;
        vetor[4] = 0;
        vetor[5] = 4;
        vetor[6] = 3;
        vetor[7] = 1;
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData11() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 4;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData12() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 9;
        int ano = 2005;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData13() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData14() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 8;
        int ano = 2005;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData15() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 2;
        vetor[4] = 0;
        vetor[5] = 3;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 2012;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData16() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 2;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 3;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2020;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData17() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 2;
        vetor[3] = 1;
        vetor[4] = 0;
        vetor[5] = 7;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2021;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData18() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 1;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 8;
        int ano = 1;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData19() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 2;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData20() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 3;
        vetor[4] = 0;
        vetor[5] = 6;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 3;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData21() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 4;
        vetor[4] = 0;
        vetor[5] = 5;
        vetor[6] = 2;
        vetor[7] = 5;
        int ano = 4;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData22() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 5;
        vetor[6] = 3;
        vetor[7] = 5;
        int ano = 5;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData23() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 5;
        int ano = 6;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData24() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData25() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 3;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData26() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData27() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData28() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData29() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 1;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData30() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 6;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData31() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData32() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData33() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 2;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData34() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData35() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 3;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData36() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 4;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData37() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 5;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData38() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 6;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData39() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 7;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData40() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData41() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 0;
        vetor[5] = 9;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData42() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 0;
        vetor[6] = 3;
        vetor[7] = 5;
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData43() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 1;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData44() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 5;
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData45() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 6;
        vetor[4] = 1;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData46() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 4;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 400;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData47() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 6;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 2;
        int ano = 600;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData48() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 4;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 400;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData49() {
        int[] vetor = new int[8];
        vetor[0] = 0;
        vetor[1] = 6;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 600;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData50() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2000;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData51() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 0;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2000;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData52() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 0;
        vetor[3] = 4;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 4;
        vetor[7] = 0;
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData53() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 5;
        vetor[4] = 0;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 0;
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData54() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 2;
        vetor[6] = 3;
        vetor[7] = 1;
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerificaData55() {
        int[] vetor = new int[8];
        vetor[0] = 2;
        vetor[1] = 0;
        vetor[2] = 1;
        vetor[3] = 0;
        vetor[4] = 1;
        vetor[5] = 0;
        vetor[6] = 3;
        vetor[7] = 1;
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    @Test
    public void testDesej() {
        int desejada = 20161013;
        int referência = 20161012;
        int d = 3;
        DiaSemana instance = new DiaSemana();
        long expResult = 1L;
        long result = instance.desej(desejada, referência, d);
        assertEquals(expResult, result);
    }
    @Test
    public void testDesej2() {
        int desejada = 61013;
        int referência = 20161012;
        int d = 3;
        DiaSemana instance = new DiaSemana();
        long expResult = -1;
        long result = instance.desej(desejada, referência, d);
        assertEquals(expResult, result);
    }
    @Test
    public void testRef() {
        int desejada = 20161012;
        int referencia = 20161013;
        int d = 3;
        DiaSemana instance = new DiaSemana();
        long expResult = 1L;
        long result = instance.ref(desejada, referencia, d);
        assertEquals(expResult, result);
    }@Test
    public void testRef2() {
        int desejada = 20161012;
        int referencia = 61013;
        int d = 3;
        DiaSemana instance = new DiaSemana();
        long expResult = -1;
        long result = instance.ref(desejada, referencia, d);
        assertEquals(expResult, result);
    }
    @Test
    public void testResultado() {
        int desejada = 20161012;
        int referencia = 20161011;
        int dia = 2;
        DiaSemana instance = new DiaSemana();
        int expResult = 3;
        int result = instance.resultado(desejada, referencia, dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testResultado2() {
        int desejada = 20161012;
        int referencia = 20161018;
        int dia = 2;
        DiaSemana instance = new DiaSemana();
        int expResult = 3;
        int result = instance.resultado(desejada, referencia, dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testResultado3() {
        int desejada = 20161018;
        int referencia = 20161012;
        int dia = 3;
        DiaSemana instance = new DiaSemana();
        int expResult = 2;
        int result = instance.resultado(desejada, referencia, dia);
        assertEquals(expResult, result);
    }
    @Test
    public void testResultado4() {
        int desejada = 20161018;
        int referencia = 20161020;
        int dia = 4;
        DiaSemana instance = new DiaSemana();
        int expResult = 2;
        int result = instance.resultado(desejada, referencia, dia);
        assertEquals(expResult, result);
    }
}
