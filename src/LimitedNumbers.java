import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> limited = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int input = scanner.nextInt();

            if(input < 0) {
                limited.stream()
                    .filter(nmbr -> nmbr <= 5)
                    .forEach(nmbr -> System.out.println(nmbr + ""));
                
                break;
            }
            limited.add(input);
        }
    }
}