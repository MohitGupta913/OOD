package bicycle;

class Gear {
    private float chainring, cog, rim, tire;

    Gear(float chainring, float cog, float rim, float tire) {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tire = tire;
    }

    public float getChainring() {
        return chainring;
    }

    public float getCog() {
        return cog;
    }

    public float getRim(){
        return rim;
    }

    public float getTire() {
        return tire;
    }

    public float ratio() {
        return getChainring() / getCog();
    }

    public float gear_inches() {
        return ratio() * (getRim() + (getTire() * 2));
    }
}

public class Bicycle {

    public static void playWithGear() {
        Gear gear = new Gear(52.0F, 11.0F, 26.0F, 1.5F);
        System.out.println(gear.gear_inches());
    }
    public static void main(String[] args) {
        System.out.println("\nFunction: playWithGear()");
        playWithGear();
    }
}