package figura;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.calcularArea();
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Methods
    @Override
    public void calcularArea() {
        this.area = base * altura;
    }

    // To String
    @Override
    public String toString() {
        return "Rectangulo: " + this.area + " u2";
    }
}
