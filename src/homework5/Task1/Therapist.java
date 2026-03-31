package homework5.Task1;

public class Therapist extends Doctor {

    Surgeon surgeon;
    Dentist dentist;

    public Therapist(String specialist) {
        super(specialist);
        this.surgeon = new Surgeon("Хирург");
        this.dentist = new Dentist("Дантист");
    }

    @Override
    public void treat() {
        System.out.println("На все руки мастер " + specialist);
    }

    public void assignDoctor(Patient patient) {
        if (patient.getPlanTreatment() == 1) {
            patient.doctor = surgeon;
            surgeon.treat();
        } else if (patient.getPlanTreatment() == 2) {
            patient.doctor = dentist;
            dentist.treat();
        } else {
            patient.doctor = this;
            this.treat();
        }
    }
}
