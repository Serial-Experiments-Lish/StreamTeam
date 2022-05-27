import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cheese = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                cheese.stream()
                    .forEach(text -> System.out.println(text));

                break;
            }
            cheese.add(input);
        }
    }
}