import java.util.Scanner;

public class mainM {
    public static void main(String[] args) {
        int X;
        int a;

        do {
            Scanner input = new Scanner(System.in);

        System.out.println("C H O O S E  M O D E");
        System.out.println("1. User");
        System.out.println("2. Administrator");
        System.out.println("====================");
        System.out.print("Enter choice: "); 
            X = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (X == 1) {
                do {
                    System.out.println(
                            "press 0 for 1982 olympics\npress 1 for 1986 olympics\npress 2 for 1990 olympics\npress 3 for 1994 olympic\npress 4 for 1998 olympics\npress 5 for 2002 olympics\npress 6 for 2006 olympics\npress 7 for 2010 olympics\npress 7 for 2014 olympics\npress 8 for 2018 olympics\npress 9 for 2022 olympics");
                    a = input.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    if (a > 3 || a < 0) {
                        System.out.println("Data not present please enter again...");
                        continue;
                    }
                } while (a > 9 || a < 0);

                System.out.println(
                        "press\n1 3000meter stats\n2 5000 meter stats\n3 10000 meter stats\n4 javlin throw stats\n5 hammer throw stats\n6 discus throw stats\n7 Swimming stats\n any key to exit");
                int Y = input.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                switch (Y) {
                    case 1:
                        ThreeThousandMeters W = new ThreeThousandMeters();
                        W.showWorldRecord();
                        W.showRanking(a);
                        break;

                    case 2:
                        FiveThousandMeters Z = new FiveThousandMeters();
                        Z.showWorldRecord();
                        Z.showRanking(a);
                        break;
                    case 3:
                        TenThousandMeter P = new TenThousandMeter();
                        P.showWorldRecord();
                        P.showRanking(a);
                        break;

                    case 4:
                        JavelinThrow J = new JavelinThrow();
                        J.showLongestThrow();
                        J.showRanking(a);
                        break;
                    case 5:
                        HammerThrow H = new HammerThrow();
                        H.showLongestThrow();
                        H.showRanking(a);
                        break;
                    case 6:
                        DiscusThrow D = new DiscusThrow();
                        D.showLongestThrow();
                        D.showRanking(a);
                        break;
                    case 7:
                        SwimmingShort S = new SwimmingShort();
                        S.showWorldRecord();
                        S.showRanking(a);
                        break;
                }
            }
            else {
                System.out.println(
                        "Edit for\n1 3000meter stats\n2 5000 meter stats\n3 10000 meter stats\n4 javlin throw stats\n5 hammer throw stats\n6 discus throw stats\n7 Swimming stats\n any key to exit");
                int Y = input.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                do {
                    System.out.println(
                            "press 4 for 1998 olympics\npress 5 for 2002 olympics\npress 6 for 2006 olympics\npress 7 for 2010 olympics\npress 7 for 2014 olympics\npress 8 for 2018 olympics\npress 9 for 2022 olympics");
                    a = input.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    } while (a < 4 || a > 9);

                    
                switch (Y) {
                    case 1:
                        ThreeThousandMeters T = new ThreeThousandMeters();
                        Athlete W = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        T.goldMedalist[a] = W.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        T.silverMedalist[a] = W.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        T.bronzeMedalist[a] = W.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R = input.nextInt();
                        T.newWorldRecord(R);
                        break;

                    case 2:
                        FiveThousandMeters F = new FiveThousandMeters();
                        Athlete G = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        F.goldMedalist[a] = G.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        F.silverMedalist[a] = G.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        F.bronzeMedalist[a] = G.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R2 = input.nextInt();
                        F.newWorldRecord(R2);

                        break;
                    case 3:
                        TenThousandMeter P = new TenThousandMeter();
                        Athlete O = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        P.goldMedalist[a] = O.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        P.silverMedalist[a] = O.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        P.bronzeMedalist[a] = O.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R3 = input.nextInt();
                        P.newWorldRecord(R3);

                        break;
                    case 4:
                        JavelinThrow U = new JavelinThrow();
                        Athlete I = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        U.goldMedalist[a] = I.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        U.silverMedalist[a] = I.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        U.bronzeMedalist[a] = I.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R4 = input.nextInt();
                        U.newLongestThrow(R4);
                        break;
                    case 5:
                        HammerThrow V = new HammerThrow();
                        Athlete H = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        V.goldMedalist[a] = H.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        V.silverMedalist[a] = H.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        V.bronzeMedalist[a] = H.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R5 = input.nextInt();
                        V.newLongestThrow(R5);
                        break;
                    case 6:
                        DiscusThrow N = new DiscusThrow();
                        Athlete S = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        N.goldMedalist[a] = S.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        N.silverMedalist[a] = S.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        N.bronzeMedalist[a] = S.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R6 = input.nextInt();
                        N.newLongestThrow(R6);
                        break;
                    case 7:
                        SwimmingShort K = new SwimmingShort();
                        Athlete E = new Athlete();
                        System.out.println("Enter the Gold Medalist information");
                        K.goldMedalist[a] = E.addNewWinner();
                        System.out.println("Enter the silver Medalist information");
                        K.silverMedalist[a] = E.addSilverMedalist();
                        System.out.println("Enter the bronze Medalist information");
                        K.bronzeMedalist[a] = E.addBronzeMedalist();
                        System.out.println("enter the new record");
                        double R7 = input.nextInt();
                        K.newWorldRecord(R7);
                        break;
                }
            }
        } while (X == 1 || X == 2);
    }
}
