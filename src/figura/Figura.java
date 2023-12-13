package figura;

public abstract class Figura {
    protected double area;

    // Constructor
    public Figura() {
        this.area = 0;
    }

    // Getters
    public double getArea() {
        return area;
    }

    // Methods
    public abstract void calcularArea();
}
