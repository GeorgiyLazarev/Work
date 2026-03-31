package homework5.Task1;

public class Doctor {

    String specialist;

    public Doctor(String specialist) {
        this.specialist = specialist;
    }

    public void treat() {
        System.out.println("Лечит");
    }

    public String getSpecialist() {
        return specialist;
    }
}
