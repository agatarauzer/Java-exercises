package CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String num = "";
        for(int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        StringBuilder sb = new StringBuilder(num);
        sb.insert(0, '(').insert(4, ')').insert(5, ' ').insert(9, '-');
        return sb.toString();
    }
}
