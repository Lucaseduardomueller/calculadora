import java.util.Scanner;

public class executavel {
    static Scanner sc = new Scanner(System.in);
    static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        menuOperacoes();
    }

    public static void menuOperacoes() {
        System.out.println(
                "Escola a operação: "
                + "\n1- Soma "
                + "\n2- Multiplicação "
                + "\n3- Divisão "
                + "\n4- Subtração "
                + "\n5- Potenciação "
                + "\n6- Porcentagem "
                + "\n7- Raíz Quadrada \n> ");
        
        int opcao = sc.nextInt();

        if (opcao < 1 || opcao > 7) {
            System.out.println("Informe um número valido");
            menuOperacoes();
        } else {
            informarNumeros(opcao);
        }
    }

    public static void informarNumeros(int opcao) {
        double num1, num2;
        
        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextDouble();

        
            System.out.println("Informe o segundo número: ");
            num2 = sc.nextDouble();
       

        switch (opcao) {
            case 1:
                 System.out.println(calculadora.somar(num1, num2)); 
                break;
            case 2: 
            	System.out.println(calculadora.multiplicar(num1,num2));
                break;
            case 3:
            	System.out.println( calculadora.divisao(num1, num2));
                break;
            case 4:
            	System.out.println(calculadora.subtrair(num1, num2));
                break;
            case 5:
            	System.out.println(calculadora.potenciacao(num1, num2));
                break;
            case 6:
            	System.out.println(calculadora.porcentagem(num1, num2));
                break;
            case 7:
            	System.out.println( calculadora.raiz(num1));
                break;
        }
        
        calculadora.resetar();
        menuOperacoes();
    }
}