import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }

            for (Integer num : set) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
