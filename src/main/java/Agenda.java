import java.util.ArrayList;

public class Agenda {
    private String nombre;
    private ArrayList<Contacto> listaDeContactos;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.listaDeContactos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", listaDeContactos=" + listaDeContactos +
                '}';
    }

    public void agregarContacto(Contacto contacto) {
        if (validarNumero(contacto)) {
            listaDeContactos.add(contacto);
        } else {
            System.err.println("El numero no es válido");
        }
    }

    public void eliminarContacto(Contacto contacto) {
        listaDeContactos.remove(contacto);
    }

    public boolean validarNumero(Contacto contacto) {
        return (contacto.getNumero().matches("^+?[569]?[0-9]{8}$"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contacto> getListaDeContactos() {
        return listaDeContactos;
    }

    public void setListaDeContactos(ArrayList<Contacto> listaDeContactos) {
        this.listaDeContactos = listaDeContactos;
    }
}
