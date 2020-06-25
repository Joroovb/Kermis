import java.util.Random;
import java.util.Scanner;

public class AvondUit {
    boolean b = true;

    // Global Notifier
    Notifications notify = new Notifications();

    Attracties botsAuto = new BotsAuto("Bobbie Botsers", 2.50);
    Attracties spin = new Spin("Mega Spinner", 2.25, 5, false, 5);
    Attracties spiegelPaleis = new SpiegelPaleis("Super Spiegels", 2.75);
    Attracties spookHuis = new Spookhuis("The Haunted House", 3.20);
    Attracties hawaii = new Hawaii("Hawaii", 2.90, 10, false, 10);
    LadderKlimmen ladderKlimmen = new LadderKlimmen("Snakes & Ladders", 5.00);
    BelastingInspecteur barry = new BelastingInspecteur();

    void start() {
        Scanner inputScan = new Scanner(System.in);
        while (b) {
            notify.WatWilJeDoen();
            String input = inputScan.nextLine();
            input = input.toLowerCase();

            if (input.equals("o") || input.equals("p") || input.equals("m")) {
                activity(input);
                continue;
            } else {
                activity(input);
                barry.taxMan(ladderKlimmen);
            }
        }
    }

    void activity(String y) {
        // y is user input
        switch (y) {
            case "1":
                botsAuto.watbenik();
                botsAuto.attractieBezocht();
                System.out.println("totale omzet" + Attracties.kassa);
                System.out.println("aantal kaartjes" + botsAuto.aantalGekochteKaartjes);
                System.out.println("attractie omzet" + botsAuto.omzet);
                break;
            case "2":
                spin.watbenik();
                try {
                    spin.attractieBezocht();
                } catch (Exception e) {
                    System.out.println("Dit mag niet meer");
                    break;
                }
                System.out.println(Attracties.kassa);
                System.out.println(spin.aantalGekochteKaartjes);
                break;
            case "3":
                spiegelPaleis.watbenik();
                spiegelPaleis.attractieBezocht();
                System.out.println(Attracties.kassa);
                System.out.println(spiegelPaleis.aantalGekochteKaartjes);
                break;
            case "4":
                spookHuis.watbenik();
                spookHuis.attractieBezocht();
                System.out.println(Attracties.kassa);
                System.out.println(spookHuis.aantalGekochteKaartjes);
                break;
            case "5":
                hawaii.watbenik();
                try {
                    hawaii.attractieBezocht();
                } catch (Exception e) {
                    System.out.println("Dit mag niet meer");
                    break;
                }
                System.out.println(Attracties.kassa);
                System.out.println(hawaii.aantalGekochteKaartjes);
                break;
            case "6":
                ladderKlimmen.watbenik();
                ladderKlimmen.attractieBezocht();
                System.out.println(Attracties.kassa);
                System.out.println(ladderKlimmen.aantalGekochteKaartjes);
                ladderKlimmen.kansSpelBelastingBetalen();
                break;
            case "o":
                System.out.println(Attracties.kassa);
                break;
            case "k":
                System.out.println(Attracties.totaalGekochteKaartjes);
                break;
            case "m":
                hawaii.onderhoudsBeurt();
        }
    }
}
