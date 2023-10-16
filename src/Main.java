import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

        final int [] d = new int[]{scanner.nextInt()};
        int[] weights = new int[n];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = scanner.nextInt();
        }

        int rez = 0;
        String s = String.valueOf(rez);
        Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
}