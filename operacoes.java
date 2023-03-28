package loja_coma_bem;

import static java.lang.Math.*;
import java.util.Date;
import java.text.DecimalFormat;

public class operacoes {
    public static void SomaSubtraiMultiplicaDivide() {
        int primeiroNumero = 10;
        int segundoNumero = 5;
        System.out.println("Soma: " + (primeiroNumero + segundoNumero));
        System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
        System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
        System.out.println("Divisão: " + (primeiroNumero / segundoNumero));
        System.out.println("------------------------------------------------------");
    }
    
    public static void ELogico() {
        int numero = 20;
        if (numero > 15 && numero < 30) {
            System.out.println(numero);
        }
        System.out.println("------------------------------------------------------");
    }

    public static void ERelacional() {
        int relacional = 20;
        if (relacional == 20) {
            System.out.println("Iguais!");
        }
        System.out.println("------------------------------------------------------");
    }

    public static void MenorIgual() {
        int numero = 10;
        if (numero <= 10) {
            System.out.println("Menor ou igual a 10");
        }
        System.out.println("------------------------------------------------------");
    }

    public static void MenorIgualComElse() {
        int numero20_2 = 20;
        if (numero20_2 <= 10) {
            System.out.println("Menor ou igual a 10");
        } else {
            System.out.println("Maior que 10");
        }
        System.out.println("------------------------------------------------------");
    }

    public static void NumeroDoMes() {
        int numeroDoMes = 3;
        String mes = "mês não válido";
        switch (numeroDoMes)
        {
            case 1:
            mes = "janeiro";
            break;
            case 2:
            mes = "fevereiro";
            break;
            case 3:
            mes = "março";
            break;
            case 4:
            mes = "abril";
            break;
            case 5:
            mes = "maio";
            break;
            case 6:
            mes = "junho";
            break;
            case 7:
            mes = "julho";
            break;
            case 8:
            mes = "agosto";
            break;
            case 9:
            mes = "setembro";
            break;
            case 10:
            mes = "outubro";
            break;
            case 11:
            mes = "novembro";
            break;
            case 12:
            mes = "dezembro";
            break;
            default:
            break;
        }
        System.out.println(mes);
        System.out.println("------------------------------------------------------");
    }

    public static void FuncaoComWhile() {
        int inicializacao = 0; // inicializacao
        while (inicializacao <= 3) // condicao
        {
            System.out.println(inicializacao);
            inicializacao++; // incremento
        }
        System.out.println("------------------------------------------------------");
    }

    public static void FuncaoComDoWhile() {
        int inicializacao_2 = 0; // inicializacao
        do
        {
            System.out.println(inicializacao_2); // instrucao
            inicializacao_2++; // incremento
        } while (inicializacao_2 <= -1); // condicao
        System.out.println("------------------------------------------------------");
    }

    public static void FuncaoComFor() {
        for (int indice = 0; indice <= 10; indice++)
        {
            System.out.println(indice);
        }
        System.out.println("------------------------------------------------------");
    }
    
    public static void SomarNumeros() {
        int primeiroNumero = 10;
        int segundoNumero = 20;
        System.out.println(primeiroNumero + segundoNumero);
        System.out.println("------------------------------------------------------");
    }

    public static int calcSomaComRet() {
        int primeiroNumero = 10;
        int segundoNumero = 20;
        return primeiroNumero + segundoNumero;
    }

    public static int calcularSomaRetornoEParamentro(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public static void maiorNumero() {
        System.out.println("O maior número é: " + Math.max(10, 20));
        System.out.println("------------------------------------------------------");
    }

    public static void manipulacaoString() {
        String texto = "Você teve uma ótima idéia.";
        texto = texto.replace("ótima", "excelente");
        System.out.println(texto);
        System.out.println("------------------------------------------------------");
    }

    public static void manipulacaoString_2() {
        String texto = " Esse texto aparecerá sem espaços no início ou no fim. ";
        System.out.println(texto.trim());
        System.out.println("------------------------------------------------------");
    }

    public static void manipulacaoString_3() {
        String texto = "Senai";
        System.out.println(texto.length());
        System.out.println("------------------------------------------------------");
    }

    public static void manipulacaoString_4() {
        String texto = "João Carlos";
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println("------------------------------------------------------");
    }

    public static void datas() {
        Date data = new Date();
        System.out.println(data);
        System.out.println(data.getDate());
        System.out.println(data.getMonth());
        System.out.println(data.getYear());
        System.out.println(data.getHours());
        System.out.println(data.getMinutes());
        System.out.println(data.getSeconds());
        System.out.println("------------------------------------------------------");
    }

    public static void FormatacaoNumeros() {
        String numero = "10";
        double numeroDouble = Double.parseDouble(numero);
        int numeroInteiro = Integer.parseInt(numero);
        System.out.println(numeroDouble);
        System.out.println(numeroInteiro);
        System.out.println("------------------------------------------------------");
    }
    
    public static void FormatacaoNumeros2() {
        double numero = 10000.0;
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(df.format(numero));
        System.out.println("------------------------------------------------------");
    }
    public static void main(String[] args) {
        SomaSubtraiMultiplicaDivide();

        ELogico();

        ERelacional();
        
        MenorIgual();

        MenorIgualComElse();
        
        NumeroDoMes();

        FuncaoComWhile();

        FuncaoComDoWhile();

        FuncaoComFor();

        SomarNumeros();

        System.out.println(calcSomaComRet());

        System.out.println(calcularSomaRetornoEParamentro(10, 20));

        maiorNumero();

        System.out.println("A raiz quadrada de 16 é: " + sqrt(16));

        System.out.println("O número 3 elevado a potência de 2 é: " + pow(3, 2));

        System.out.println("O valor de PI é: " + PI);

        manipulacaoString();

        manipulacaoString_2();

        manipulacaoString_3();

        manipulacaoString_4();

        datas();

        FormatacaoNumeros();

        FormatacaoNumeros2();
    }    
}
