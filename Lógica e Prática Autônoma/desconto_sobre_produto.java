//Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo desconto. 
// Faça um programa que possa entrar com o nome de um produto e seu valor unitário e calcular e 
// exibir um novo valor com um desconto de 9%.

public class Exercicio_01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declaração das variáveis
        String nome_produto;
        double valor_produto, valor_final;
        
        // Entrada de dados
        System.out.println("Digite o nome do produto abaixo: ");
         nome_produto= input.nextLine(); 
        
        System.out.println("Digite o valor unitário do produto: ");
          valor_produto = input.nextDouble(); 
 
         valor_final= valor_produto * 0.91;

     
        
        System.out.printf("Produto: ", nome_produto);
        System.out.printf("Valor Original: R$ ", valor_produto);
        System.out.printf("Valor final (com 9 porcento de desconto): R$ %.2f", valor_final);
        
        
        //.2f, duas casas decimais, 2f varias casas decimais 
        
        input.close();
    }
}