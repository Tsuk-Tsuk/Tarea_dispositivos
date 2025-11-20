import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dispositivo> lista = new ArrayList<>();

        try {
            lista.add(new Laptop("HP", "Pavilion", 850.50, 16));
            lista.add(new Telefono("Samsung", "Galaxy S22", 950, "Movistar"));

            lista.add(new Laptop("", "Inspiron", 600, 8));

        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear dispositivo: " + e.getMessage());
        }

        try {
            lista.add(new Telefono("Apple", "iPhone 13", -1200, "Claro"));
        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear dispositivo: " + e.getMessage());
        }
        System.out.println("\n=== LISTA DE DISPOSITIVOS REGISTRADOS ===");
        for (Dispositivo d : lista) {
            d.mostrarInfo(); // POLIMORFISMO
        }
    }
}
