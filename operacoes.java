package loja_coma_bem;

public class operacoes {
    public static void main(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 5;
        System.out.println("Soma: " + (primeiroNumero + segundoNumero));
        System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
        System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
        System.out.println("Divisão: " + (primeiroNumero / segundoNumero));

        int numero20 = 20;
        if (numero20 > 15 && numero20 < 30) {
            System.out.println(numero20);
        }

        int relacional = 20;
        if (relacional == 20) {
            System.out.println("Iguais!");
        }

        int numero10 = 10;
        if (numero10 <= 10) {
            System.out.println("Menor ou igual a 10");
        }

        int numero20_2 = 20;
        if (numero20_2 <= 10) {
            System.out.println("Menor ou igual a 10");
        } else {
            System.out.println("Maior que 10");
        }

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

        int inicializacao = 0; // inicializacao
        while (inicializacao <= 3) // condicao
        {
            System.out.println(inicializacao);
            inicializacao++; // incremento
        }

        int inicializacao_2 = 0; // inicializacao
        do
        {
            System.out.println(inicializacao_2); // instrucao
            inicializacao_2++; // incremento
        } while (inicializacao_2 <= -1); // condicao

        for (int indice = 0; indice <= 10; indice++)
        {
            System.out.println(indice);
        }

    }        
}
