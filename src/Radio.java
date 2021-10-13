public class Radio implements VolumenGraduable, Despertador {


    public void subirVolumen() {
        System.out.println("La radio suena mas duro");
    }

    public void bajarVolumen() {
        System.out.println("La radio suena mas bajo.");
    }

    @Override
    public void despertador() {
        System.out.println("La radio tiene despertador integrado");
    }
}
