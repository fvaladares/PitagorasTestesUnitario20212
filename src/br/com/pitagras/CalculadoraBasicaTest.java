package br.com.pitagras;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBasicaTest {
    CalculadoraBasica cb;

    @BeforeEach
    public void iniciarDados() {
        System.out.println("Inicizando Dados");
        cb = new CalculadoraBasica();
    }

    @Test
    public void testAdicao_OK() {
        double resposta = cb.adicao(10, 35);
        System.out.println("Executando metodo adicaoOK");
        assertEquals(45., resposta);
    }

    @Test
    public void testAdicao_falha() {
        System.out.println("Executando metodo adicaoFalha");
        double resposta = cb.adicao(10, 35);

        assertNotEquals(45.01, resposta);
    }

    @Test
    public void testSubtracao_ok() {
        double resposta = cb.subtracao(50, 20);
        assertEquals(30.0, resposta);
    }

    @Test
    public void testEhMaiorComValorAMaiorQueVarolB() {
        boolean resposta = cb.ehMaior(5, 4);
        assertTrue(resposta);
    }

    @Test
    public void testEhMaiorComValoresIguaisDeveFalhar() {
        boolean resposta = cb.ehMaior(5, 5);
        assertFalse(resposta);
    }

    @AfterEach
    public void finalizar() {
        System.out.println("Finalizando dados");
        cb = null;
    }
}