public class Attracties {
    String naam;
    double prijs;
    int aantalGekochteKaartjes = 0;
    double omzet = 0;
    static int totaalGekochteKaartjes = 0;
    static double kassa;

    public void watbenik() {
        System.out.println(naam);
    }

    public void attractieBezocht() {
        kassa += prijs;
        omzet += prijs;
        aantalGekochteKaartjes++;
        totaalGekochteKaartjes++; }

    public void onderhoudsBeurt() {}
}

interface GokAttractie {

    void kansSpelBelastingBetalen();

    void setBelastingSparen(double newBelastingSparen);
}

abstract class RisicoRijkeAttracties extends Attracties {
    int draaiLimiet;
    int draaiLimietCounter;
    boolean keuring;

    public void opstellingsKeuring() {
        keuring = true;
        System.out.println(naam + " is goed gekeurd!\n");
    }

    public void onderhoudsBeurt() {
        keuring = true;
        draaiLimiet = draaiLimietCounter;
        System.out.println("Ziet er weer goed uit baas!");
        System.out.println(draaiLimiet);
    }
}

class BotsAuto extends Attracties{
    BotsAuto (String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
}

class Spin extends RisicoRijkeAttracties implements GokAttractie {
    double belastingSparen = 0;
    int[] blabla = new int[10];

    Spin(String naam, double prijs, int draaiLimiet, boolean keuring, int draaiLimietCounter) {
        this.naam = naam;
        this.prijs = prijs;
        this.keuring = keuring;
        opstellingsKeuring();
        this.draaiLimiet = draaiLimiet;
        this.draaiLimietCounter = draaiLimietCounter;
    }

    public void attractieBezocht() {
        if (keuring) {
            draaiLimiet--;
            blabla[draaiLimiet] = draaiLimiet;
            kassa += prijs;
            aantalGekochteKaartjes++;
            totaalGekochteKaartjes++;
        }
    }

        public void kansSpelBelastingBetalen () {
            double temp = (prijs * 30) / 100;
            belastingSparen += temp;
            System.out.println("belasting gespaard " + belastingSparen);
        }

        public void setBelastingSparen ( double newBelastingSparen){
            belastingSparen = newBelastingSparen;
        }
    }

    class SpiegelPaleis extends Attracties {

        SpiegelPaleis(String naam, double prijs) {
            this.naam = naam;
            this.prijs = prijs;
        }
    }

    class Spookhuis extends Attracties {
        Spookhuis(String naam, double prijs) {
            this.naam = naam;
            this.prijs = prijs;
        }
    }

    class Hawaii extends RisicoRijkeAttracties {
        int[] blabla = new int[10];

        Hawaii(String naam, double prijs, int draaiLimiet, boolean keuring, int draaiLimietCounter) {
            this.naam = naam;
            this.prijs = prijs;
            this.keuring = keuring;
            opstellingsKeuring();
            this.draaiLimiet = draaiLimiet;
            this.draaiLimietCounter = draaiLimietCounter;
        }

        public void attractieBezocht() {
            if (keuring) {
                draaiLimiet--;
                System.out.println("dit is een test");
                blabla[draaiLimiet] = draaiLimiet;
                kassa += prijs;
                aantalGekochteKaartjes++;
                totaalGekochteKaartjes++;
            }
        }
    }

    class LadderKlimmen extends Attracties implements GokAttractie {
        double belastingSparen = 0;

        LadderKlimmen(String naam, double prijs) {
            this.naam = naam;
            this.prijs = prijs;
        }

        public void kansSpelBelastingBetalen() {
            double temp = (prijs * 30) / 100;
            belastingSparen += temp;
            System.out.println("belasting gespaard " + belastingSparen);
        }

        public void setBelastingSparen(double newBelastingSparen) {
            belastingSparen = newBelastingSparen;
        }
    }