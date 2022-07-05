import java.util.regex.*;

public class SecureTester{
  public static boolean alphanumeric(String s){ 
    Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
    Matcher matcher = pattern.matcher(s);
    return matcher.matches();
    }
}
  
