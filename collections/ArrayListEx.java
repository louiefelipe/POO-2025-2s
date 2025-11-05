package collections;
import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

       ArrayList<String> listanomes = new ArrayList<>();   
       listanomes.add("Ana");
       listanomes.add("Bruno");
       listanomes.add("Carlos");

        for (String nome : listanomes) {
           System.out.println(nome);
    }


       for (int i = 0; i < listanomes.size(); i++) {
           System.out.println(listanomes.get(i));
       }

       if (listanomes.contains("Ana")) {
           System.out.println("Ana está na lista.");
       } else {
           System.out.println("Ana não está na lista.");
       }

         listanomes.remove("Bruno");
         if(! listanomes.contains("Bruno")) {
            System.out.println("Bruno foi removido da lista.");
         }

         //listanomes.clear();
    
         if(listanomes.isEmpty()) {
            System.out.println("A lista está vazia.");
            } else { 
            System.out.println("A lista não está vazia.");
         }
    }
}
