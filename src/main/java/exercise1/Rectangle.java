package exercise1; // Igualmente, también se agrega el nombre del paquete

public class Rectangle {
    public double width; // Variable pública para el ancho que permite decimales; editable y accesible
    public double height; // Variable pública para el alto que permite decimales; editable y accesible

    public Rectangle(){ // Constructor de un objeto Rectangle

    }

    public double area() { // Método público para obtener el área del rectángulo
        return this.width * this.height; // Regresar el valor del ancho por el alto
    }
}
