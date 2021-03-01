package santana.fernandes.julia;

public class Main{
    public static void main(String[] args) {
        int ano = 2020;
        //Estrutura de decisão simples
//        if (ano % 2 == 0){
//            System.out.println("Ano Par!");
//        }
//        if (ano % 2 != 0){
//            System.out.println("Ano Impar!");
//        }


        //Estrutura de decisão composta
        if (ano % 2 == 0) {
            System.out.println("Ano Par");
        } else {
            System.out.println("Ano Impar!");
        }

        switch (ano) {
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon!");
                break;
            default:
                System.out.println("Segue!");
                break;
        }
    }
}

//C:\Program Files (x86)\Common Files\Oracle\Java\javapath