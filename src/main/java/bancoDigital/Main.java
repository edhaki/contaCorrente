package bancoDigital;

/**
 *
 * @author Ederson .A Silva
 */
public class Main {
    
    public static void main(String[] args) {
        /* Ideia do programa é atribuir um construtor e colocar atributos e mostrar
        na tela do cliente o que ele tem de saldo e alguns outros atributos que adicionei
        como saque etc... Fiz apenas o proposto pelo exercicio.
        */
        contaCorrente dadosContas = new contaCorrente("Ederson Alves " ,50 , 0 , 15.0f);
        
        System.out.println("Bem vindo ao Banco Digital!");
        System.out.println("Bem vindo Cliente: " + dadosContas.getAlterarNome());
        System.out.println("Seu Deposito Recente foi de :" + dadosContas.getDeposito() + " Reais");
        System.out.println("Seu Saldo: " +dadosContas.getSaldo() + " Reais");
        System.out.println("Seu Extrato de Saque: " + dadosContas.getSaque() + "Reais");
        
        
        //Atributos já estão atribuidos no construtor como default na conta corrente.
        
    }

 
        }
    
    

