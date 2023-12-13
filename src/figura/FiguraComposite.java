package figura;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposite extends Figura {
    private String nombre;
    private List<Figura> listaFiguras;

    // Constructor
    public FiguraComposite(String nombre) {
        this.nombre = nombre;
        this.listaFiguras = new ArrayList<>();
    }

    // Methods
    public void agregarFigura(Figura figura) {
        this.listaFiguras.add(figura);
    }

    @Override
    public void calcularArea() {
        for (Figura figura : this.listaFiguras) {
            this.area += figura.getArea();
        }
    }

    public void mostrarFiguras() {
        System.out.println("Figura (" + this.nombre + "):");
        for (Figura figura : this.listaFiguras) {
            System.out.println(figura);
        }
    }
}
