package homework4part2;

public class Therapist extends Doctor {
    @Override
    public void treat(String doctorsSpecialization) {
        super.treat(doctorsSpecialization);
        System.out.println("Требуется лечение общего профиля");
    }
    public String direction(String treatmentPlan) {
        if (treatmentPlan.equals("К1")) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat("хирург");
            return "хирург";
        } else if (treatmentPlan.equals("К2")) {
            Dentist dentist = new Dentist();
            dentist.treat("дантист");
            return "дантист";
        } else {
            Therapist therapist = new Therapist();
            therapist.treat("терапевт");
            return "терапевт";
        }
    }
}


