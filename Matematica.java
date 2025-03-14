import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //-Coletando dados--------------------------------------------------------
        
        System.out.println("Digite um numero: ");
        int numerador = sc.nextInt(); 

        System.out.println("Digite um numero: ");
        int denominador = sc.nextInt();
        
        //-Analisando exceção-----------------------------------------------------
        try{
            int resultado = numerador / denominador;
            System.out.println("Resultado: "+resultado);

        //-Tratando exceção-------------------------------------------------------
        }catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero seu burro");

        //-Finalizando exceção----------------------------------------------------
        }finally{
            System.out.println("Finalizano....");

        }

        sc.close();
    }
}