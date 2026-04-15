package homework4part2;

public class Surgeon extends Doctor {
    @Override
    public void treat(String doctorsSpecialization) {
        super.treat(doctorsSpecialization);
        System.out.println("Требуется хирургическое вмешательство");
    }
}



