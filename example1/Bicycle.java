package bicycle;

class Gear {
    private int chainring, cog;

    Gear(int chainring, int cog) {
        this.chainring = chainring;
        this.cog = cog;
    }

    public float ratio() {
        return chainring / (float)cog;
    }
}

public class Bicycle {

    public static void playWithGear() {
        Gear gear = new Gear(52, 11);
        System.out.println(gear.ratio());
    }
    public static void main(String[] args) {
        System.out.println("\nFunction: playWithGear()");
        playWithGear();
    }
}