import java.util.Scanner;
public class QuestionarioTargetSistemas {
    // Questionario 

// Questão 1)
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;  // 0 e 1 estão na sequência por definição
        }
        
        int a = 0, b = 1;
        int fibonacci = a + b;
        
        // Gera a sequência de Fibonacci até encontrar um número igual ou maior que o informado
        while (fibonacci < num) {
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        
        // Verifica se o número informado é igual a um valor da sequência
        return fibonacci == num;
    }

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicita o número do usuário
        System.out.print("Digite um número: ");
        int number = entrada.nextInt();
        
        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

    // Questão 2)


     // Solicita ao usuário que insira uma string
     System.out.print("Digite uma string: ");
     String input = entrada.nextLine();
     
     // Variável para contar o número de ocorrências de 'a' ou 'A'
     int count = 0;
     
     // Itera sobre cada caractere da string
     for (int i = 0; i < input.length(); i++) {
         char c = input.charAt(i);
         
         // Verifica se o caractere é 'a' ou 'A'
         if (c == 'a' || c == 'A') {
             count++;
         }
     }
     
    // Verifica se a letra 'a' ou 'A' foi encontrada
     if (count > 0) {
         System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
     } else {
         System.out.println("A letra 'a' não foi encontrada na string.");
     }
     
     entrada.close();

    // Questão 3)
    // Por conta do for ficar somando K + sum e o K++, quando o k = 12 a soma final vai ser de 66

    // Questão 4)
    // a) Res = 9, soma vai de 2 em 2 
    // b) Res = 128, cada número é o dobro do anterior
    // c) Res = 49, cada número esta elevado ao quadrado n^2
    // d) Res = 100, (n^2)*4
    // e) Res = 13, sequência de Fibonacci
    // f) Res = 20

    // Questão 5)
    // 1° -> Acenda a primeira lâmpada por uns minutos e depois desliga
    // 2° -> Acenda a segunda lâmpada e vai para a sala de lâmpadas
    // 3° -> Na sala a lâmpada que estiver apagada, porém acessa é a lâmpada do primeiro interruptor 
    // 4° -> Na sala a lâmpada que estiver acessa é do segundo interruptor e a que estiver apagada é do terceiro interruptor 
    }
}
