package ThirtyDaysOfCode.Day12.Inheritance;

public class Student extends Person{
    private int[] testScores;
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */

    public char calculate() {

        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double average = (double) sum / testScores.length;

        /*
        using stream:

        double average = Arrays.stream(testScores)
                .average().getAsDouble();
        */

        return getSymbol(average);
    }

    private char getSymbol(double average) {
        if (average < 40) return 'T';
        else if (average < 55) return 'D';
        else if (average < 70) return 'P';
        else if (average < 80) return 'A';
        else if (average < 90) return 'E';
        else return 'O';
    }
}
