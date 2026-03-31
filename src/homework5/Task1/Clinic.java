package homework5.Task1;

/**
 * Задача 1:
 * Создать программу для имитации работы клиники. Пусть в клинике будет три
 * врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
 * каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
 * «План лечения» и полем «Доктор». Создать объект класса «Пациент» и
 * добавить пациенту план лечения. У терапевта создать метод, который будет
 * назначать врача пациенту согласно плану лечения:
 * Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 – назначить дантиста и выполнить метод
 * лечить.
 * Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
 * лечить.
 */

public class Clinic {
    public static void main(String[] args) {
        Therapist therapist = new Therapist("Терапевт");

        Patient patient1 = new Patient(2);
        Patient patient2 = new Patient(1);
        Patient patient3 = new Patient(3);

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);

        System.out.printf("Пациент 1 лечился у %s%n", patient1.doctor.getSpecialist());
        System.out.printf("Пациент 2 лечился у %s%n", patient2.doctor.getSpecialist());
        System.out.printf("Пациент 3 лечился у %s", patient3.doctor.getSpecialist());
    }
}
