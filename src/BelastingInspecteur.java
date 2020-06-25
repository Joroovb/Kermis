import java.util.Random;

public class BelastingInspecteur {
    int i = 15;

    public void taxMan (LadderKlimmen klimmen) {
        Random random = new Random();
        int b = random.nextInt(i--);
        if (b == 0) {
            System.out.println("kassa " + Attracties.kassa);
            Attracties.kassa -= klimmen.belastingSparen;
            klimmen.setBelastingSparen(0);
            System.out.println("je moet belasting betalen. " + Attracties.kassa);
            i = 15;
        }
        System.out.println("Geen belasting vandaag");
    }
}
