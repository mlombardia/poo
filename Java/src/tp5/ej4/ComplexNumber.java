package tp5.ej4;

public class ComplexNumber {
    private Number real;
    private Number imaginary;

    public ComplexNumber(Number real, Number imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Number real){
        this.real = real;
        this.imaginary = 0;
    }

    public String toString(){
        return String.format("%d +%di", real, imaginary);
    }

    public Number getReal() {
        return real;
    }

    public Number getImaginary() {
        return imaginary;
    }

    public ComplexNumber plus(ComplexNumber other){
        return new ComplexNumber(2,3);
        // new ComplexNumber(real + other.getReal(), imaginary + other.getImaginary());
    }
}
