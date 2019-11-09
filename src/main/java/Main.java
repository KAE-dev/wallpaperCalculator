import service.CalculateRollService;

public class Main {
    public static void main(String[] args) {

        CalculateRollService calculateRoll = new CalculateRollService();
        int numberOfRolls = (int) calculateRoll.calculationOfRolls(5, 6, 1.06, 10, 2.75);
        System.out.println(numberOfRolls);

    }
}
