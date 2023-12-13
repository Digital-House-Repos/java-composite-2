package figura;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
        this.calcularArea();
    }

    // Getters
    public double getRadio() {
        return radio;
    }

    // Methods
    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    // To String
    @Override
    public String toString() {
        return "Circulo: " + this.area + " u2";
    }
}
