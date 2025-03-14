import java.util.Scanner;
import java.util.InputMismatchException;

public class Conveter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                System.out.println("Digite um numero inteiro: ");
                int numero = sc.nextInt();

                System.out.println("Numero inteiro: "+numero);
                break;

            }catch(InputMismatchException e){
                System.out.println("Erro: Entrada inválida! Digite um número inteiro válido.");
                sc.next();
            }
        }
        System.out.println("Finalizando...");
        sc.close();
    }
}