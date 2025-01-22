import java.util.Scanner;

public class Main {

    //CONSTANTES
    static boolean sair = false;
    static double num1;
    static double num2;
    static Scanner scan = new Scanner(System.in);

    //MÉTODO MAIN
    public static void main(String[] args) {

        while(!sair){
            System.out.println("Escolha a operação desejada");
            imprimirMenu();
            String operacao = scan.nextLine();

            switch(operacao){
                case "1":
                    somarOp();
                    break;
                case "2":
                    subtrairOp();
                    break;
                case "3":
                    multiplicarOp();
                    break;
                case "4":
                    dividirOp();
                    break;
                case "5":
                    sairOp();
                    sair = true;
                    break;
                default:
                    errMsg();
                    break;
            }
        }
    }

    //MÉTODO DIVIDIR
    private static void dividirOp() {
        System.out.println("Qual o primeiro número?");
        num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Qual o segundo número");
        num2 = scan.nextDouble();
        scan.nextLine();

        try{
            double result = num1 / num2;
            if (num2 == 0){
                throw new ArithmeticException("Não foi possível dividir por 0");
            }
            System.out.println("Dividindo os números " + num1 + " e " + num2);
            System.out.println("O resultado da divisão é " + result);
        }catch (ArithmeticException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    //MÉTODO MULTIPLICAR
    private static void multiplicarOp() {
        System.out.println("Qual o primeiro número?");
        num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Qual o segundo número");
        num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Multiplicando os números " + num1 + " e " + num2);

        double result = num1 * num2;
        System.out.println("O resultado da multiplicação é " + result);
    }

    //MÉTODO SUBTRAIR
    private static void subtrairOp() {
        System.out.println("Qual o primeiro número?");
        num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Qual o segundo número");
        num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Subtraindo os números " + num1 + " e " + num2);

        double result = num1 - num2;
        System.out.println("O resultado da subtração é " + result);
    }

    //MÉTODO SOMAR
    private static void somarOp() {
        System.out.println("Qual o primeiro número?");
        num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Qual o segundo número");
        num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Somando os números " + num1 + " e " + num2);

        double result = num1 + num2;
        System.out.println("O resultado da soma é " + result);
    }

    //MÉTODO DE ERRO
    private static void errMsg() {
        System.out.println("Escolha uma operação válida");
    }

    //MÉTODO SAIR
    private static void sairOp() {
        System.out.println("Saindo...");
    }


    //MÉTODO DO MENU
    private static void imprimirMenu() {
        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Sair");
    }
}