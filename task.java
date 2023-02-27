
import java.util.*;

public class task {
    public static void main(String[] args) {
        Map<Integer, String> linkedList = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            String[] split = input.split("~");
            String word = split[0];
            int number = Integer.parseInt(split[1]);

            if (word.equals("print")) {
                String value = linkedList.remove(number);
                if (value == null) {
                    System.out.println("Пустая строка или исключение NoSuchElementException");
                } else {
                    System.out.println(value);
                }
            } else {
                String value = split[0];
                linkedList.put(number, value);
            }
        }
    }
}
