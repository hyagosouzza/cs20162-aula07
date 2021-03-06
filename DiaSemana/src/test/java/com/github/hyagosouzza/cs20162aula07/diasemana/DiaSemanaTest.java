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
    public void testConverteParaVetor() {
        int data = 20161005;
        int[] vetor = new int[]{2,0,1,6,1,0,0,5};
        int[] expResult = vetor;
        DiaSemana instance = new DiaSemana(); 
        int[] result = instance.converteParaVetor(data);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testFazAno() {
        int[] vetor = new int[]{0,0,1,5,1,1,1,5};
        DiaSemana instance = new DiaSemana();
        int expResult = 15;
        int result = instance.fazAno(vetor);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData() {
        int[] vetor = new int[]{2,0,1,5,1,1,1,5};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData2() {
        int[] vetor = new int[]{2,0,1,5,1,1,3,2};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData3() {
        int[] vetor = new int[]{2,0,1,5,1,1,0,0};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData4() {
        int[] vetor = new int[]{0,0,0,0,1,1,0,1};
        int ano = 0000;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData5() {
        int[] vetor = new int[]{2,0,1,5,0,0,1,0};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData6() {
        int[] vetor = new int[]{2,0,1,5,1,3,1,0};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData7() {
        int[] vetor = new int[]{2,0,1,5,0,2,2,9};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    public void testVerificaData8() {
        int[] vetor = new int[]{2,0,1,6,0,2,3,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    public void testVerificaData9() {
        int[] vetor = new int[]{2,0,0,4,0,1,3,2};
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData10() {
        int[] vetor = new int[]{2,0,0,4,0,4,3,1};
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData11() {
        int[] vetor = new int[]{2,0,0,4,0,2,3,0};
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData12() {
        int[] vetor = new int[]{2,0,0,5,0,2,2,9};
        int ano = 2005;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData13() {
        int[] vetor = new int[]{2,0,1,5,1,1,3,2};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData14() {
        int[] vetor = new int[]{2,0,0,5,0,2,2,8};
        int ano = 2005;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData15() {
        int[] vetor = new int[]{2,0,1,2,0,3,3,2};
        int ano = 2012;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData16() {
        int[] vetor = new int[]{2,0,2,0,0,3,3,0};
        int ano = 2020;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData17() {
        int[] vetor = new int[]{2,0,2,1,0,7,3,0};
        int ano = 2021;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData18() {
        int[] vetor = new int[]{0,0,0,1,0,2,2,8};
        int ano = 1;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData19() {
        int[] vetor = new int[]{0,0,0,2,2,0,8,3,0};
        int ano = 2;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData20() {
        int[] vetor = new int[]{0,0,0,3,0,6,3,0};
        int ano = 3;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData21() {
        int[] vetor = new int[]{0,0,0,4,0,5,2,5};
        int ano = 4;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData22() {
        int[] vetor = new int[]{0,0,0,5,0,5,3,5};
        int ano = 5;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData23() {
        int[] vetor = new int[]{0,0,0,6,0,2,3,5};
        int ano = 6;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData24() {
        int[] vetor = new int[]{2,0,1,6,0,2,3,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData25() {
        int[] vetor = new int[]{2,0,1,6,0,3,3,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData26() {
        int[] vetor = new int[]{2,0,1,5,0,2,3,0};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData27() {
        int[] vetor = new int[]{2,0,1,6,0,2,2,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData28() {
        int[] vetor = new int[]{2,0,1,6,0,2,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData29() {
        int[] vetor = new int[]{2,0,1,6,0,1,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData30() {
        int[] vetor = new int[]{2,0,1,6,0,6,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData31() {
        int[] vetor = new int[]{2,0,1,6,1,1,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData32() {
        int[] vetor = new int[]{2,0,1,6,0,2,3,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData33() {
        int[] vetor = new int[]{2,0,1,6,1,2,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData34() {
        int[] vetor = new int[]{2,0,1,0,1,2,3,2};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData35() {
        int[] vetor = new int[]{2,0,1,6,0,3,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData36() {
        int[] vetor = new int[]{2,0,1,6,0,4,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData37() {
        int[] vetor = new int[]{2,0,1,6,0,5,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData38() {
        int[] vetor = new int[]{2,0,1,6,0,6,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData39() {
        int[] vetor = new int[]{2,0,1,6,0,7,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData40() {
        int[] vetor = new int[]{2,0,1,6,0,8,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData41() {
        int[] vetor = new int[]{2,0,1,6,0,9,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData42() {
        int[] vetor = new int[]{2,0,1,0,1,0,3,5};
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData43() {
        int[] vetor = new int[]{2,0,1,6,1,1,4,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData44() {
        int[] vetor = new int[]{2,0,1,0,1,2,3,5};
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData45() {
        int[] vetor = new int[]{2,0,1,6,1,8,3,0};
        int ano = 2016;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData46() {
        int[] vetor = new int[]{0,4,0,0,0,8,3,2};
        int ano = 400;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData47() {
        int[] vetor = new int[]{0,6,0,0,0,8,3,2};
        int ano = 600;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData48() {
        int[] vetor = new int[]{0,4,0,0,0,8,3,0};
        int ano = 400;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData49() {
        int[] vetor = new int[]{0,6,0,0,0,8,3,0};
        int ano = 600;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData50() {
        int[] vetor = new int[]{2,0,0,0,0,8,4,0};
        int ano = 2000;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData51() {
        int[] vetor = new int[]{2,0,0,0,0,8,3,0};
        int ano = 2000;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData52() {
        int[] vetor = new int[]{2,0,0,0,0,8,4,0};
        int ano = 2004;
        DiaSemana instance = new DiaSemana();
        int expResult = -1;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData53() {
        int[] vetor = new int[]{2,0,1,5,0,8,3,0};
        int ano = 2015;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData54() {
        int[] vetor = new int[]{2,0,1,0,1,2,3,1};
        int ano = 2010;
        DiaSemana instance = new DiaSemana();
        int expResult = 0;
        int result = instance.verificaData(vetor, ano);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificaData55() {
        int[] vetor = new int[]{2,0,1,0,1,0,3,1};
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
        DiaSemana instance = new DiaSemana();
        long expResult = 1L;
        long result = instance.desej(desejada, referência);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDesej2() {
        int desejada = 61013;
        int referência = 20161012;
        DiaSemana instance = new DiaSemana();
        long expResult = -1;
        long result = instance.desej(desejada, referência);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRef() {
        int desejada = 20161012;
        int referencia = 20161013;
        DiaSemana instance = new DiaSemana();
        long expResult = 1L;
        long result = instance.ref(desejada, referencia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRef2() {
        int desejada = 20161012;
        int referencia = 61013;
        DiaSemana instance = new DiaSemana();
        long expResult = -1;
        long result = instance.ref(desejada, referencia);
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
