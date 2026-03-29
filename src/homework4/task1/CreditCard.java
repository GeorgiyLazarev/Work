package homework4.task1;

/**
 * Задача 1:
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Добавьте метод, который выводит текущую информацию о карточке. Напишите
 * программу, которая создает три объекта класса CreditCard у которых заданы
 * номер счета и начальная сумма.
 * Тестовый сценарий для проверки: Положите деньги на первые две карточки и
 * снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCard {

    private final int numberScore;
    private int sumScore;

    public CreditCard(int numberScore, int sumScore) {
        this.numberScore = numberScore;
        this.sumScore = sumScore;
    }

    public int getNumberScore() {
        return numberScore;
    }

    public int getSumScore() {
        return sumScore;
    }

    public void setSumScore(int sumScore) {
        this.sumScore = sumScore;
    }

    public void getInfo() {
        System.out.println("Номер счета: " + numberScore + "\nБаланс счета: " + sumScore);
    }

    public void accrualSum(int accrual) {
        int sum = accrual + sumScore;
        setSumScore(sum);

        System.out.printf("Баланс счета \"%d\" после начисления: %d%n", getNumberScore(), getSumScore());
    }

    public void withdrawalSum(int withdraw) {
        int subtraction = sumScore - withdraw;

        if (subtraction >= 0) {
            setSumScore(subtraction);

            System.out.printf("Баланс счета \"%d\" после снятия: %d%n", getNumberScore(), getSumScore());
        } else {
            System.out.printf("Нельзя снять сумму \"%d\" больше чем на балансе: %d", withdraw, getSumScore());
        }
    }
}
