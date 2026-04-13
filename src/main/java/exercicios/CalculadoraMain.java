package exercicios;
import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n===== Calculadora =====");
            System.out.println("\t1 - Multiplição (tabuada)");
            System.out.println("\t2 - Adição");
            System.out.println("\t3 - Subtração");
            System.out.println("\t4 - Divisão");
            System.out.println("\t0 - Sair");
            System.out.println("=======================\n");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    calcularMultiplicacao(sc);
                    break;

                case 2:
                    calcularAdicao(sc);
                    break;

                case 3:
                    calcularSubtracao(sc);
                    break;

                case 4:
                    calcularDivisao(sc);
                    break;

                case 0:
                    System.out.println("\nSaindo do Sistema");
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA! TENTE NOVAMENTE!!");

            }

        }while (opcao != 0);

        sc.close();
    }

     static void calcularMultiplicacao(Scanner sc){
         sc.nextLine();

         System.out.print("\n\tDigite um número para  ver a tabuada: ");
         int num1 = sc.nextInt();

         sc.nextLine();

         MultiplicacaoTabuada multiplicacaoTabuada = new MultiplicacaoTabuada();
         multiplicacaoTabuada.setNumero1(num1);
         multiplicacaoTabuada.fazerTabuada(num1);

     }

     static void calcularAdicao(Scanner sc){
         sc.nextLine();

         System.out.print("\n\tDigite o primeiro número: ");
         int num1 = sc.nextInt();
         System.out.print("\tDigite o segundo número: ");
         int num2 = sc.nextInt();

         sc.nextLine();

         Adicao adicao = new Adicao();
         adicao.setNumero1(num1);
         adicao.setNumero2(num2);

         int resultado = adicao.calcularSoma(num1, num2);
         System.out.println("\n--- Resultado da Adição ---\n");
         System.out.printf("%d + %d = %d\n", num1, num2, resultado);

     }

     static void calcularSubtracao(Scanner sc){
         sc.nextLine();

         System.out.print("\n\tDigite o primeiro número: ");
         int num1 = sc.nextInt();
         System.out.print("\tDigite o segundo número: ");
         int num2 = sc.nextInt();

         sc.nextLine();

         Subtracao subtracao = new Subtracao();
         subtracao.setNumero1(num1);
         subtracao.setNumero2(num2);

         int resultado = subtracao.calcularSubtracao(num1, num2);
         System.out.println("\n--- Resultado da Subtração ---\n");
         System.out.printf("%d - %d = %d\n", num1, num2, resultado);

    }

    static void calcularDivisao(Scanner sc){
        sc.nextLine();

        System.out.print("\n\tDigite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("\tDigite o segundo número: ");
        double num2 = sc.nextDouble();

        sc.nextLine();

        Divisao divisao = new Divisao();
        divisao.setNumero1(num1);
        divisao.setNumero2(num2);

        double resultado = divisao.calcularDivisao(num1, num2);
        System.out.println("\n--- Resultado da Divisão ---\n");
        System.out.printf("%.2f / %.2f = %.2f %n\n", num1, num2, resultado);

    }

}
