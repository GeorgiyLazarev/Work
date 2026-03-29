package homework4.task2;

public class Test {
    public static void main(String[] args) {
        Atm atm = new Atm(1, 1 , 1);

        atm.addingMoney(5000, 5000, 5000);
        atm.withdrawalSum(40);
        atm.getNumberBills();
    }
}
