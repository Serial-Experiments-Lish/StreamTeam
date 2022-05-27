package src4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) throws Exception {
        List<String> selectNmbrs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type 'end' to stop.");

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input2 = scanner.nextLine();

                if(input2.isEmpty()) {
                    continue;
                }

                if(input2.equalsIgnoreCase("n")) {
                    double negativeAvg = selectNmbrs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(i -> i < 0)
                        .average()
                        .getAsDouble();

                        System.out.println("Average of the negative numbers: " + negativeAvg);
                } else if(input2.equalsIgnoreCase("p")) {
                    double positiveAvg = selectNmbrs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter (i -> i >= 0)
                        .average()
                        .getAsDouble();

                        System.out.println("Average of the positive numbers: " + positiveAvg);
                }
                break;
            }
            selectNmbrs.add(input);
        }
    }
}