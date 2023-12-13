package figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
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
        this.area = (base * altura) / 2;
    }

    // To String
    @Override
    public String toString() {
        return "Triangulo: " + this.area + " u2";
    }
}
