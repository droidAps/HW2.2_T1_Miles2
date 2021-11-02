public class BonusMilesService {
    public int calculate(int price) {
        int amountPerMile = 20;                 // сумма, соответствующая 1-ой бонусной миле
        int miles = price / amountPerMile;      // количество бонусных миль, исходя из стоимости билета

        return miles;
    }
}
