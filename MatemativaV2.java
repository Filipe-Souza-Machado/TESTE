import java.util.Scanner;
import java.util.InputMismatchException;

public class MatemativaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //-Analisando exceção-------------------------------------------------------------------------------------------------------------
            try{
                //-Coletando dados--------------------------------------------------------
                System.out.println("Digite um numero: ");
                int numerador = sc.nextInt(); 

                System.out.println("Digite um numero: ");
                int denominador = sc.nextInt();

                int resultado = numerador / denominador;
                System.out.println("Resultado: "+resultado);

                //Caso a divisão esteja correta o laço para
                break;

                //-Verificando exceção--------------------------------------------------------
            }catch(ArithmeticException e){
                System.out.println("Não é possivel dividir por zero. tente novamente.");

                //-ca
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
                sc.next();
            }
        }
        System.out.println("Finalizando...");
        sc.close();
    }   
}
