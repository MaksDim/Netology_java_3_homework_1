public class BonusMilesService {
    public int calculate(int cost) {
        int partForMile = 20;
        //расчет
        int countMile = cost / partForMile;

        return countMile;
    }
}
