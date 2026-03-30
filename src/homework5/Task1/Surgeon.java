package homework5.Task1;

public class Surgeon extends Doctor {
    public Surgeon(String specialist) {
        super(specialist);
    }

    @Override
    public void treat() {
        System.out.println("Проводит операцию " + specialist);
    }
}
