public class parkingLot {
    parkingSpot spaces [];
    
    public parkingLot(){
        spaces = new parkingSpot[8];
        for (int i = 0; i<8; i++){
            if(i<2){
                spaces[i] = new parkingSpot(true);
            }
            else {
                spaces[i] = new parkingSpot(false);
            }

        }
    }
   
    public int parkcar(car car){
        //int choice = -1
        if(car.handicapParking==true){
            for(int i=0; i<2; i++){
                if(spaces[i].car == null){
                    if(spaces[i].Handicap==true){
                        spaces[i].car=car;
                        //choice = i;
                        return i;
                    }
                }

            }
        }
        else {
            for (int j = 2; j < 8; j++){
                if(spaces[j].car==null){
                    if(spaces[j].Handicap==false){
                        spaces[j].car=car;
                        //choice = j
                        return j;
                    }
                }

            }
        }
        return -1;

    }
    public car removecar(int space){
        car car = spaces[space].car;
        spaces[space].car = null;
        return car;
    }

    public String toString(){
        int handiSpots = 0;
        int nonhandiSpots = 0;
        for (int i = 0; i<8; i++){
            if (spaces[i].car == null){
                if (spaces[i].Handicap){
                    handiSpots++;
                }
                else{
                    nonhandiSpots++;
                }
            }
        }
        return "" + handiSpots + " " + nonhandiSpots;
    }

}
