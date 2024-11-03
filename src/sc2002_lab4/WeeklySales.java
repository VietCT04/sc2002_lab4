package sc2002_lab4;

import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        SalePerson[] salesTeam = {
            new SalePerson("John", "Doe", 500),
            new SalePerson("Jane", "Smith", 450),
            new SalePerson("Mike", "Johnson", 500)
        };
        Arrays.sort(salesTeam);
        for (SalePerson sp : salesTeam) {
            System.out.println(sp);
        }
    }
}
