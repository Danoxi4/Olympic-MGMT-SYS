public class FieldSports extends olympic {
    public double longestThrow;
    public void newLongestThrow(double R) {
        if (R > longestThrow) {
            longestThrow = R; //// getter and setter
        }
    }
    public void showLongestThrow() {
        System.out.println(longestThrow + " meters ");
    }
    public void showRanking() {
        System.out.println("The Men Ranking is: ");
    }
}
