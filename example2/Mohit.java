package learnJava;

class Bicycle {
    private String size;
    private String chain;
    private String tire_size;
    

    public Bicycle(String size) {
        this.size = size;
        this.chain = chainVal();
        this.tire_size = getTireSize();
    }

    private String chainVal() {
        return "10-speed";
    }

    private String getTireSize(){
        return "";
    }

    public String spares() {
        return "Size: " + size + ", chain: " + chain;
    }

    public String getSize() {
        return size;
    }

}

class RoadBikes extends Bicycle {    
    private String tape_color;

    public RoadBikes(String size, String tape_color ) {
        super(size);
        this.tape_color = tape_color;
    }

    private String getTireSize() {
        return "23";
    }

    public String spares() {
        return super.spares() + ", tape color: " + tape_color;
    }

}

class MountainBike extends Bicycle {
    private String front_shock;
    private String rear_shock;

    public MountainBike(String size, String front_shock, String rear_shock) {
        super(size);
        this.front_shock = front_shock;
        this.rear_shock = rear_shock;
    }

    private String getTireSize() {
        return "2.1";
    }

    public String spares() {
        return super.spares() + ", front shock: " + front_shock + ", rear shock: " + rear_shock;
    }

}

public class Mohit {

    public static void playWithBike() {
        MountainBike mb = new MountainBike("M", "Manitou", "Fox");
        System.out.println(mb.getSize());
        System.out.println(mb.spares());

        RoadBikes rb = new RoadBikes("SM", "Red");
        System.out.println(rb.getSize());
        System.out.println(rb.spares());

    }
    public static void main(String[] args) {
        playWithBike();
    }
}