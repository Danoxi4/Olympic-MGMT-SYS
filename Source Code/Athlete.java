import java.util.Scanner;

class Athlete {
    private String name;
    private int age;
    private String sex;
    private String nationality;
    private int rank;

    Athlete() {

    }

    Athlete(String name, int age, String sex, String Nationality, int rank) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nationality = Nationality;
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNationality(String Nationality) {
        this.nationality = Nationality;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public int getRank() {
        return rank;
    }

    public String toString() {
        return name + " " + age + " " + sex + " " + nationality;
    }

    Scanner input = new Scanner(System.in);

    public Athlete addNewWinner() {
        Athlete X = new Athlete();
        System.out.println("Name: ");
        X.name = input.nextLine();
        System.out.println("sex: ");
        X.sex = input.nextLine();
        System.out.println("Nationality: ");
        X.nationality = input.nextLine();
        System.out.println("age: ");
        try {
            X.age = input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
        return X;
    }

    public Athlete addBronzeMedalist() {
        Athlete X = new Athlete();
        input.nextLine();
        System.out.println("Name: ");
        X.name = input.nextLine();
        System.out.println("sex: ");
        X.sex = input.nextLine();
        System.out.println("Nationality: ");
        X.nationality = input.nextLine();
        System.out.println("age: ");
        try {
            X.age = input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
        return X;
    }

    public Athlete addSilverMedalist() {
        Athlete X = new Athlete();
        input.nextLine();
        System.out.println("Name: ");
        X.name = input.nextLine();
        System.out.println("sex: ");
        X.sex = input.nextLine();
        System.out.println("Nationality: ");
        X.nationality = input.nextLine();
        System.out.println("age: ");
        try {
            X.age = input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
        return X;
    }

}
