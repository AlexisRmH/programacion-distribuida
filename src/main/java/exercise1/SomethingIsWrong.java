package exercise1; // Se agrega el nombre del paquete al que pertenece la clase

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); // La instancia del objeto estaba mal inicializada,
        myRect.width = 40;                  // necesitaba el "new Rectangle()" para crear su instancia.
        myRect.height = 50;                 // La clase Rectangle no venía incluída, y por este código
        System.out.println("myRect's area is " + myRect.area()); // podemos entender que debe de incluir
                                            // las variables width, height y un método area. Resultado = 2000.0
    }
}
