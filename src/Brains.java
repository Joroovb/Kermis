public class Brains {

    Attracties botsAuto = new BotsAuto("jannie", 2.50);
    Attracties spin = new Spin("jannie", 2.25, 5, false, 5);
    Attracties spiegelPaleis = new SpiegelPaleis("jannie", 2.75);
    Attracties spookHuis = new Spookhuis("jannie", 3.20);
    Attracties hawaii = new Hawaii("jannie", 2.90, 10, false, 10);
    LadderKlimmen ladderKlimmen = new LadderKlimmen("jannie", 5.00);
    BelastingInspecteur barry = new BelastingInspecteur();

    void activity(String y) {
    // y is user input
        switch(y){
            case "1":
                botsAuto.watbenik();
                botsAuto.attractieBezocht();
                System.out.println("totale omzet" + Attracties.kassa);
                System.out.println("aantal kaartjes" + botsAuto.aantalGekochteKaartjes);
                System.out.println("attractie omzet" + botsAuto.omzet);
                break;
            case "2":
                spin.watbenik();
                spin.attractieBezocht();
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
                hawaii.attractieBezocht();
                System.out.println(Attracties.kassa);
                System.out.println(hawaii.aantalGekochteKaartjes);
                break;
            case "6":
                ladderKlimmen.watbenik();
                ladderKlimmen.attractieBezocht();
                System.out.println(Attracties.kassa);
                System.out.println(ladderKlimmen.aantalGekochteKaartjes);
                ladderKlimmen.kansSpelBelastingBetalen();
                barry.taxMan(ladderKlimmen);

                break;
            case "o":
                System.out.println(Attracties.kassa);
                break;
            case "k":
                System.out.println(Attracties.totaalGekochteKaartjes);
                break;
            case "p":
                hawaii.onderhoudsBeurt();
        }
    }
}
