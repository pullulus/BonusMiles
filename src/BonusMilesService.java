public class BonusMilesService {
    public int calculate(int cost) {
        int miles = cost / 100 / 20;

        return miles;
    }
}
