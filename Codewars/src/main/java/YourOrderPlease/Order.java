package YourOrderPlease;

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        String[] arr = words.split("\\s+");
        String[] resultArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (Character.isDigit(ch)) {
                    int digit = Character.getNumericValue(ch);
                    resultArr[digit - 1] = arr[i];
                    break;
                }
            }
        }
        return String.join(" ", resultArr);
    }
}
