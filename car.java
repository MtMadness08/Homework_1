public class car {
    public String make;
    public String color;
    public boolean handicapParking = false;

    public car(){
        make = null;
        color = null;
        handicapParking = false;
    }

    public car(String make, String color, boolean handicapParking){
        this.make = make;
        this.color = color;
        this.handicapParking = handicapParking;
    }
    public String toString(){
        return "make" + make + "color" + color + "handicap" + handicapParking;
    }

    }