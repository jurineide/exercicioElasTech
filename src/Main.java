import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor da sua hora");
        double valorDaHora = scanner.nextDouble();

        System.out.println("digite a qtd de horas trabalhadas");
        int qtdHoras = scanner.nextInt();

        double salarioBruto = qtdHoras * valorDaHora;
        double impostoRenda;


        if (salarioBruto <= 900) {
            impostoRenda=0;
        } else if (salarioBruto <= 1500) {
            impostoRenda = salarioBruto * 0.05 ;
        } else if (salarioBruto <= 2500) {
           impostoRenda = salarioBruto * 0.10;
        } else {
            impostoRenda = salarioBruto * 0.2;
        }
        double descontoInss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.03;
        double totalDescontos= (descontoInss+fgts)+sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.println("Salario Bruto "+ salarioBruto);
        System.out.println("Desconto inss "+ descontoInss);
        System.out.println("Desconto sindicato "+ sindicato);
        System.out.println("Salario liquido "+ salarioLiquido);


    }
}