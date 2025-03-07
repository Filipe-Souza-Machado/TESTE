import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static void renderizarMenu(){
        System.out.println("========Gerenciamento de ar condicionado=======");
        System.out.println("1-Cadastra novo dispositivo");
        System.out.println("2-Visualizar dispositivos");
        System.out.println("3-sair");
        
        
    }

    private static void registrarDispositivo(){
        String modelo;
        String codigo;
        String marca;
        int btu;
        String defeito="n";
        String tipoDefeito;
        System.out.println("Modelo: ");
        System.out.println("Codigo: ");
        System.out.println("Marca: ");
        System.out.println("BTU: ");
        System.out.println("Possui defeito? (s/n): ");
        if(defeito=="s"||defeito=="S"){
            System.out.println("Tipo defeito: ");
        }
        System.out.println("Informe o modelo: ");
    }
    public static void main(String[] args) {
        


        int escolha =0;

        while (escolha != 3) {
            renderizarMenu();

            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    
                    break;
            
                case 2:
                    
                    break;
            
                case 3:
                    
                    break;
            
                default:
                    break;
            }

        }
        sc.close();
    }
    
}
