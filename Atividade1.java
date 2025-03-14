public class Atividade1 {
    public static void main(String[] args) {
        int[] Array = {10,22,32,43,53,60,71,84};
        int indice = 28;

        try{
            System.out.println("Elemento no indice:"+indice+" = "+Array[indice]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Elemento não está no indice");

        }finally{
            System.out.println("Tchau....");
        }
        System.out.println("oadasd");

    }
}
