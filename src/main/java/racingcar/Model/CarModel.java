package racingcar.Model;

public class CarModel {
    private String carName;
    private int carRaceCnt;
    private String carRaceString;

    public CarModel(String carName){
        this.carName = carName;
        this.carRaceCnt = 0;
        this.carRaceString = "";
    }

    public void goForward(){
        carRaceCnt += 1 ;
        carRaceString += "-";
    }

    public String printRacing(){
        if(carRaceString.equals(""))
            return carName + " : " + "\n";
        return carName + " : " + carRaceString + "\n";
    }

    public String getCarName(){
        return carName;
    }

    public Integer getRaceCnt(){
        return carRaceCnt;
    }

}
