package ThirtyDaysOfCode.Day14.Scope;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] array) {
        this.elements = array;
    }

    public void computeDifference() {
        int min = 100;
        int max = 1;
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        maximumDifference = max - min;
    }
}
