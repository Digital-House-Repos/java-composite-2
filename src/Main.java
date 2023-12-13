import figura.*;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 4);
        Figura circulo = new Circulo(1);

        FiguraComposite vagon = new FiguraComposite("Vagon");

        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);

        vagon.calcularArea();
        vagon.mostrarFiguras();

        // Area total
        System.out.println("\nArea total: " + vagon.getArea());
    }
}
