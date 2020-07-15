package learnJava;

class Bicycle {
    private String size;
    private String tape_color;
    private String chain;
    private String tire_size;

    public Bicycle(String size, String tape_color) {
        this.size = size;
        this.tape_color = tape_color;
        chain = "10-speed";
        tire_size = "23";
    }

    public String getSize() {
        return size;
    }

}

public class Mohit {

    public static void playWithBike() {
        Bicycle bike =  new Bicycle("M", "red");
        System.out.println(bike.getSize());
    }
    public static void main(String[] args) {
        playWithBike();
    }
}