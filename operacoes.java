package loja_coma_bem;

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

    }    
}
