import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);  // chamando a opção de introduzir dados

         System.out.println("Digite a nota da primeira prova:"); // introduzindo a primeira nota
         double nota1= scanner.nextDouble();

         System.out.println("Digite a nota da segunda prova:"); // introduzindo a segunda nota
         double nota2= scanner.nextDouble();

         double media = (nota1+nota2)/2;  // informando ao java que eu quero que ele some a nota1 com a nota2 e depois divida por dois para achar a média
         System.out.println("Média" + media);  // pedindo ao java pra concatenar ou seja associar o valor da media a palavra média

         if (media >= 6){  // informando que se a media do aluno for igual ou maior que 6 ele ta aprovado

            System.out.println(" Aluno aprovado!"); //imprimindo o texto
            
         } else if (media<=4){  // se a media for menor ou igual a 4 ele está de recuperação

            System.out.println("Aluno está de recuperação"); // imprimindo o texto
         }else{  // caso a nota  for menor que 4 ele está reprovado direto
            System.out.println("Aluno Reprovado"); // imprimindo texto
         }
         scanner.close();
    }
    
}
