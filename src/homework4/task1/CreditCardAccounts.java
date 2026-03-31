package homework4.task1;

public class CreditCardAccounts {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(234123, 20000);
        CreditCard creditCard2 = new CreditCard(1235423, 1290);
        CreditCard creditCard3 = new CreditCard(76823123, 32491);

        creditCard1.accrualSum(2398);
        creditCard2.accrualSum(10000);
        creditCard3.withdrawalSum(32400);
        System.out.println();
        creditCard1.getInfo();
        creditCard2.getInfo();
        creditCard3.getInfo();
    }
}
