package homework5.Task1;

public class Dentist extends Doctor {
    public Dentist(String specialist) {
        super(specialist);
    }

    @Override
    public void treat() {
        System.out.println("Лечит зубы " + specialist);
    }
}
