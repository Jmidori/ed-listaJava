import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ApplicationMain {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        System.out.println("                TESTANDO A PERFORMACA DAS 3 IMPLEMENTACOES DE LIST");
        System.out.println();
        System.out.println();
        System.out.println("   ---> Tempo gasto para ADICIONAR 100.000 itens:");

        long startTime = 0;
        long endTime = 0;
        long duration = 0;

// LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - LinkedList (add)");

// ArrayList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - ArrayList (add)");

// Vector add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            vector.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - Vector (add)");

        System.out.println();
        System.out.println("   ---> Tempo gasto para BUSCAR os itens da lista (buscará todos, um por iteração):");

// LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - LinkedList (get)");

// ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - ArrayList (get)");

// Vector get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            vector.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - Vector (get)");

        System.out.println();
        System.out.println("   ---> Tempo gasto para REMOVER os itens da lista (excluira todos, um por iteração):");

// LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - LinkedList (remove)");

// ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - ArrayList (remove)");

// Vector remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            vector.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " - Vector (remove)");
    }
}
