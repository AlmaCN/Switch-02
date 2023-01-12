import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho creato una lista chiamata list
         */
        List<String> list = new ArrayList<>();

        String i = "";

        /**
         * Ho creato un loop infinito.
         */
        while(i != " "){

            /**
             * Ho creato uno scanner per permettere all'user di introdurre stringhe.
             */
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextLine();

            /**
             * Ho creato lo switch con le tre casistiche ed il default.
             * size per printare la grandezza della lista
             * clear per rimuovere tutto quello che c'e nella lista
             * print per printare in console il contenuto della lista
             * ed il default prevede che le cose scritte vengano aggiunte alla lista.
             */
            switch (i){
                case "size":
                    System.out.println(list.size());
                    break;
                case "clear":
                    list.removeAll(list);
                    break;
                case "print":
                    System.out.println(list);
                    break;
                default:
                    list.add(i);
            }
        }
    }
}
