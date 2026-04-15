package homework4part2;

public class Dentist extends Doctor {
    @Override
    public void treat(String doctorsSpecialization) {
        super.treat(doctorsSpecialization);
        System.out.println("Требуется лечение ротовой полости");
    }
}


