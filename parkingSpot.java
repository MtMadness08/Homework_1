public class parkingSpot {
    public car car;
    public boolean Handicap = false;

    public parkingSpot(boolean Handicap){
        car = null;
        this.Handicap= Handicap;
    }

    public parkingSpot(car car, boolean Handicap){
        this.car = car;
        this.Handicap = Handicap;
    }

    public String toString(){
        return "car" + car + "Handicap spot" + Handicap;
    }

    }

