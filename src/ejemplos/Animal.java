package ejemplos;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    Animal(String nombre_,int edad_,double peso_){
        setEdad(edad_);
        setNombre(nombre_);
        setPeso(peso_);
    }

    public double getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
