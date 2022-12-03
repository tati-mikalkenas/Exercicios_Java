import java.util.Scanner;
import java.awt.geom.Arc2D.Float;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Exercício 1
    // System.out.println("Digite um valor e falaremos se ele é positivo, negativo
    // ou 0");
    Scanner pergunta1 = new Scanner(System.in);
    int valor= pergunta1.nextInt();

    if(valor > 0){
    System.out.println("O valor informado é positivo");
    } else if(valor ==0){
    System.out.println("O valor informado é 0");
    } else {
    System.out.println("O valor informado é negativo");
    }

    // Exercício 2
    // Faça um programa para ler 3 valores (considere que não serão informados
    valores iguais) e escrever o maior deles.

    System.out.println("Informe o valor 1");
    Scanner sc1= new Scanner(System.in);
    int valor1= sc1.nextInt();

    System.out.println("Informe o valor 2");
    Scanner sc2= new Scanner(System.in);
    int valor2= sc2.nextInt();

    System.out.println("Informe o valor 3");
    Scanner sc3= new Scanner(System.in);
    int valor3= sc3.nextInt();

    int maior=Math.max(valor1,(Math.max(valor2, valor3)));
    System.out.println("Esse é o maior valor: " + maior);

    // Exercício 3
    // //Faça um programa que leia 3 valores (considere que não serão informados
    // valores iguais) e escrever a soma dos 2 maiores.

    System.out.println("Informe o valor 1");
    Scanner sc4= new Scanner(System.in);
    int valor4= sc4.nextInt();

    System.out.println("Informe o valor 2");
    Scanner sc5= new Scanner(System.in);
    int valor5= sc5.nextInt();

    System.out.println("Informe o valor 3");
    Scanner sc6= new Scanner(System.in);
    int valor6= sc6.nextInt();

    int min=Math.min(valor4,Math.min(valor5,valor6));
    int soma= (valor4+ valor5+ valor6)-min;
    System.out.println("Essa é a soma dos dois maiores: "+ soma);

    // Exercício 4
    // Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba
    // os números informados e escreva a média aritmética desses valores lidos.

    ArrayList<Float> numeros = new ArrayList<>();

    float number = 0;
    float soma = 0;
    float media = 0;

    while (numeros.size() < 10) {
      System.out.println("Informe 10 valores");
      Scanner entrada = new Scanner(System.in);
      number = entrada.nextFloat();

      numeros.add(number);
      soma = soma + number;
      media = soma / 10;
    }

    System.out.println("Esses são os valores informados: " + numeros + "E essa é a média entre eles: " + media);

    // Exercício 5:  - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
  
    
    float valores=0;
    float media=0;
    float soma=0;

    System.out.println("Informe a 1° nota");
    Scanner entrada1 = new Scanner(System.in);
    float notas = entrada1.nextFloat();

    System.out.println("Informe a 2° nota");
    Scanner entrada2 = new Scanner(System.in);
    float notas2 = entrada2.nextFloat();

    System.out.println("Informe a 3° nota");
    Scanner entrada3 = new Scanner(System.in);
    float notas3 = entrada3.nextFloat();

    System.out.println("Informe a 4° nota");
    Scanner entrada4 = new Scanner(System.in);
    float notas4 = entrada4.nextFloat();

    valores=(notas+notas2+notas3+notas4);
    media= valores/4;

    if (media >= 6){
       System.out.println("PARABÉNS! Você foi aprovado!");
     } else {
      System.out.println("Você não conseguiu média suficiente para ser aprovado.");

    }
  }
}