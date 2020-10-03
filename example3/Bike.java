package Classpath;

class Bicycle {
    private String size;
    private Parts parts;
    Bicycle(String size, Parts parts) {
        this.size = size;
        this.parts = parts;
    }
    public String spares() {
        return parts.spare();
    }
}

class Parts{
    Part[] parts;

    Parts(Part[] parts) {
        this.parts = parts;
    }

    public String spare() {
        String spares = "";
        for(Part part : parts) {
            if(part.getIsReq()){
                spares += ( part.getName() + " : " + part.getDesc() + ", " );
            }
        }
        return spares;
    }
}

class Part {
    private String name;
    private String desc;
    private boolean isReq;

    Part(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.isReq = true;
    }

    Part(String name, String desc, boolean isReq) {
        this.name = name;
        this.desc = desc;
        this.isReq = isReq;;
    }

    public String getName() { return name; }
    public String getDesc() { return desc; }
    public boolean getIsReq() { return isReq; }
}

public class Bike {
    public static void playWithBike() {
        Part[] roadParts = {
            new Part("chain", "10-speed"),
            new Part("tire_size", "23"),
            new Part("tape_color", "red")
        };
        Parts roadConfig = new Parts(roadParts);

        Part[] mountainParts = {
            new Part("chain", "10-speed"),
            new Part("tire_size", "2.1"),
            new Part("front_shock", "Manitou", false),
            new Part("rear_shock", "Fox")
        };

        Parts mountainConfig = new Parts(mountainParts);

        Bicycle roadBike = new Bicycle("L", roadConfig);
        Bicycle mountainBike = new Bicycle("L", mountainConfig);

        System.out.println(roadBike.spares());
        System.out.println(mountainBike.spares());
    }
    public static void main(String[] args) {
        playWithBike();
    }
}
