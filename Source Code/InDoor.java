public class InDoor extends olympic{
    private double worldRecord;

    public double getworldRecord() {
        return worldRecord;
    }

    public void setWorldRecord(double worldRecord) {
        this.worldRecord = worldRecord;
    }

    public void showRanking() {
        System.out.println("The Men  Ranking is: ");
    }

    public void newWorldRecord(double R) {
        if (R < getworldRecord()) {
            setWorldRecord(R);
        }
    }

    public void showWorldRecord() {
        System.out.println(getworldRecord() + " minutes");
    }
}
