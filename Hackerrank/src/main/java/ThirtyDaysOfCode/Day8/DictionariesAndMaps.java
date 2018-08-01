package ThirtyDaysOfCode.Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

    public static void main(String []arg) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap();
        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String name = in.next();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
