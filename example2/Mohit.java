package learnJava;

class Bicycle {
    private String size;
    private String tape_color;
    private String chain;
    private String tire_size;
    private String style;
    private String front_shock;
    private String rear_shock;

    public Bicycle(String size, String tape_color, String style, String front_shock, String rear_shock) {
        this.size = size;
        this.tape_color = tape_color;
        this.style = style;
        this.front_shock = front_shock;
        this.rear_shock = rear_shock;
    }

    public void spares() {
        if(style.equals("road")) {
            chain = "10-speed";
            tire_size = "23";
        }
        else {
            chain = "10-speed";
            tire_size = "2.1";
        }
    }

    public String getSize() {
        return size;
    }

}

public class Mohit {

    public static void playWithBike() {
        Bicycle bike =  new Bicycle("M", "red", "mountain", "Manitou", "Fox");
        bike.spares();
        System.out.println(bike.getSize());
    }
    public static void main(String[] args) {
        playWithBike();
    }
}