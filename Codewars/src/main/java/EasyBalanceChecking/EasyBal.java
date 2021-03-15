package EasyBalanceChecking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EasyBal {
    public static String balance(String book) {
        book = book.replaceAll("[^a-zA-Z0-9.\\n]+", " ");
        String[] lines = book.split("\\n");
        BigDecimal balance = new BigDecimal(lines[0].trim());

        StringBuilder sb = new StringBuilder();
        sb.append("Original Balance: " + balance.toString() + "\\r\\n");

        BigDecimal totalExpense = new BigDecimal(0.0);
        int counter = 0;
        for (int i = 1; i < lines.length; i++) {
            if (!lines[i].isEmpty()) {
                String expenses[] = lines[i].split("\\s");
                BigDecimal expense = new BigDecimal(expenses[2].trim());
                totalExpense = totalExpense.add(expense);
                balance = balance.subtract(expense);
                counter++;
                sb.append(expenses[0] + " " + expenses[1] + " " + expenses[2])
                        .append(" Balance " + balance.toString() + "\\r\\n" );
            }
        }
        BigDecimal count = new BigDecimal(counter);
        BigDecimal averageExpense = totalExpense.divide(count, 2, RoundingMode.HALF_UP);
        sb.append("Total expense  " + totalExpense.toString() + "\\r\\n")
                .append("Average expense  " + averageExpense.toString());

        return sb.toString();
    }
}
