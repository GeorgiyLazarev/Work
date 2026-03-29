package homework4.task2;

/**
 * Задача 2:
 * Создать класс, описывающий банкомат. Набор купюр, находящихся в
 * банкомате, должен задаваться тремя свойствами: количеством купюр
 * номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а
 * возвращает булевое значение - успешность выполнения операции. При
 * снятии денег, функция должна распечатывать каким количеством купюр
 * какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
 * -количеством купюр каждого номинала
 */

public class Atm {

    private int quantity20;
    private int quantity50;
    private int quantity100;
    private int totalAmount;

    public Atm(int quantity20, int quantity50, int quantity100) {
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
        this.quantity100 = quantity100;
    }

    public void getNumberBills() {
        System.out.println(
                "Количество купюр наминалом 20: " + quantity20 +
                "\nКоличество купюр наминалом 50: " + quantity50 +
                "\nКоличество купюр наминалом 100: " + quantity100
        );
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addingMoney(int banknote20, int banknote50, int banknote100) {
        if (banknote20 > 0) {
            for (int i = 0; i < banknote20; i++) {
                quantity20++;
            }
        }
        if (banknote50 > 0) {
            for (int i = 0; i < banknote50; i++) {
                quantity50++;
            }
        }
        if (banknote100 > 0) {
            for (int i = 0; i < banknote100; i++) {
                quantity100++;
            }
        }
        totalAmount = (quantity20 * 20) + (quantity50 * 50) + (quantity100 * 100);

        setTotalAmount(totalAmount);
        System.out.println("Всего денег в банкомате: " + getTotalAmount());
    }

    public boolean withdrawalSum(int withdraw) {
        if (withdraw < 20 || withdraw % 10 != 0 || withdraw == 30) {
            System.out.println("Некорректная сумма");
            return false;
        }

        int give20;
        int give50;
        int give100;

        for (int i = Math.min(withdraw / 100, quantity100); i >= 0; i--) {
            int after100 = withdraw - i * 100;

            for (int j = Math.min(after100 / 50, quantity50); j >= 0; j--) {
                int after50 = after100 - j * 50;

                if (after50 % 20 == 0 && after50 / 20 <= quantity20) {
                    give100 = i;
                    give50 = j;
                    give20 = after50 / 20;

                    quantity20 -= give20;
                    quantity50 -= give50;
                    quantity100 -= give100;
                    totalAmount = (quantity20 * 20) + (quantity50 * 50) + (quantity100 * 100);

                    System.out.println("Выдано: " + withdraw + " (100:" + give100 + ", 50:" + give50 + ", 20:" + give20 + ")");
                    return true;
                }
            }
        }

        System.out.println("Невозможно выдать, не хватает купюр в банкомате, сорян");
        return false;
    }
}
