public class Laptop extends Dispositivo {

    private int ramGB;

    public Laptop(String marca, String modelo, double precio, int ramGB) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.ramGB = ramGB;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("===== LAPTOP =====");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("==================");
    }
}