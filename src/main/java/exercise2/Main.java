package exercise2; // Paquete al que pertenece la clase

public class Main {
    public static void main(String[] args) { // Falto la sintaxis para crear el método main que es el que se ejecuta al inicio de cualquier programa
        IdentifyMyParts a = new IdentifyMyParts(); // Creación de dos instancias del objeto
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5; // Asignación de los valores a las variables de las instancias. Valor de 'y' para la instancia 'a'.
        b.y = 6; // Valor de 'y' para la instancia 'b'.
        a.x = 1; // Valor de la variable 'x'. 7 => 1.
        b.x = 2; // Valor de la variable 'x'. 1 => 2.
        // Marca advertencias porque estamos haciendo referencia a una variable de clase mediante una instancia
        System.out.println("a.y = " + a.y); // Regresa 5.
        System.out.println("b.y = " + b.y); // Regresa 6.
        System.out.println("a.x = " + a.x); // Regresa 2, porque es una variable de clase y afecta a todas las instancias.
        System.out.println("b.x = " + b.x); // Igual que arriba.
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x); // Regresa el valor de la variable de clase, es decir, 2.
    }
}
