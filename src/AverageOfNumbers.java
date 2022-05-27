import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) throws Exception {
        List<String> nmbrList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type 'end' to stop.");

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("end")) {
                double averages = nmbrList.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .average()
                    .getAsDouble();

                System.out.println("average of the numbers: " + averages);
                break;
            }

            nmbrList.add(input);
        }
    }
}