package bicycle;

class Wheel {
    private float rim;
    private float tire;

    Wheel(float rim, float tire) {
        this.rim = rim;
        this.tire  = tire;
    }

    public float diameter() {
        return rim + (2 * tire);
    }

    public float circumference() {
        return diameter() * 3.14F;
    }

}

class Gear {
    private float chainring;
    private float cog;
    private Wheel wheel;

    Gear(float chainring, float cog) {
        this.chainring = chainring;
        this.cog = cog;
    }

    Gear(float chainring, float cog, Wheel wheel) {
        this.chainring = chainring;
        this.cog = cog;
        this.wheel = wheel;
    }

    public float getChainring() {
        return chainring;
    }

    public float getCog() {
        return cog;
    }

    public float ratio() {
        return getChainring() / getCog();
    }

    public float gear_inches() {
        return ratio() * wheel.diameter();
    }
}

public class Bicycle {

    public static void playWithGear() {
        Wheel wheel = new Wheel(26.0F, 1.5F);
        System.out.println(wheel.circumference());
        Gear gear = new Gear(52.0F, 11.0F, wheel);
        System.out.println(gear.gear_inches());
        System.out.println(new Gear(10, 2).ratio());
    }
    public static void main(String[] args) {
        System.out.println("\nFunction: playWithGear()");
        playWithGear();
    }
}