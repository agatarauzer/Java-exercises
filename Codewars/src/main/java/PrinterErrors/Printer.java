public class Printer {
    
    public static String printerError(String s) {
    long counter = s.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c > 109 && c < 123)
        .count(); 
    return counter + "/" + s.length();
    }
}
