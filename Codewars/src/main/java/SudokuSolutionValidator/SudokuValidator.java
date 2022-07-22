import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
      
      Set<Integer> validNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
      
      Set<Integer> lines = new HashSet<>();
      Set<Integer> columns = new HashSet<>();
      Set<Integer> subSquare1 = new HashSet<>();
      Set<Integer> subSquare2 = new HashSet<>();
      Set<Integer> subSquare3 = new HashSet<>();
    
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          lines.add(sudoku[i][j]);
          columns.add(sudoku[j][i]);
          if (j < 3) {
            subSquare1.add(sudoku[i][j]);
          }
          else if (j < 6) {
            subSquare2.add(sudoku[i][j]);
          }
          else {
            subSquare3.add(sudoku[i][j]);
          }
        }
          
        if (!lines.containsAll(validNumbers)) {
          return false;
        }
        if (!columns.containsAll(validNumbers)) {
          return false;
        }
        lines.clear();
        columns.clear();
        
        if ((i + 1) % 3 == 0) {
          if (!subSquare1.containsAll(validNumbers)) {
            return false;
          }
          if (!subSquare2.containsAll(validNumbers)) {
            return false;
          }
          if (!subSquare3.containsAll(validNumbers)) {
            return false;
          }
        subSquare1.clear();
        subSquare2.clear();
        subSquare3.clear(); 
        }
      }
         return true;
    }
}
