public class Telefono extends Dispositivo {

    private String compania;

    public Telefono(String marca, String modelo, double precio, String compania) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.compania = compania;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("===== TELÉFONO =====");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Compañía: " + compania);
        System.out.println("====================");
    }
}