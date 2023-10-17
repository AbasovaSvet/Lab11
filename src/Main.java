import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));
        int n = scanner.nextInt();
        /*int d = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
           array[i] = scanner.nextInt();
        }
        int counter = n;
        for (int i = n-1; i >= 1 ; i--) {
        }*/
        final int d = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(weights));
        System.out.println("Грузоподъёмность d = "+d);
        System.out.println("Всего человек = "+n);
        int rez = 0;
        Arrays.sort(weights);
        int i_light = 0; // самый легкий по весу человек TODO:после сортировки
        int i_heavy = n-1;// самый тяжелый по весу человек TODO:после сортировки
        System.out.println(Arrays.toString(weights));

        if (!((n <= 1) || (d <= 1) || (n >= 15000) || (d >= 15000)||(weights[i_heavy])>d)) {

            while ((i_light <= i_heavy)){

                if ((weights[i_light] + weights[i_heavy]) <= d) {
                    i_light++;
                }
                rez++;
                i_heavy--;

            }
            System.out.println("Байдарок нужно = "+rez);
        }
        else
            System.out.println("Конец истории или все не уедут");
        String s = String.valueOf(rez);
        Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
}