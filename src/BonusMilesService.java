public class BonusMilesService {

    public int calculate(int price){

        int miles = 20;
        int bonus = price / miles ;
        System.out.println(bonus);

        return bonus;

    }
}
