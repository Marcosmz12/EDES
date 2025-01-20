/**
 * 
 * La clase Car representa un coche con atributos como la
 * marca, modelo, año y precio.
 * Proporciona métodos para acceder y modificar estos atributos,
 * así como para obtener una descripción del coche.
 * 
 * @author Marcos Molis Zapata 1ºDAM (T)
 * 
 * 
 *         make La marca del coche.
 *         model El modelo del coche.
 *         year El año del coche.
 *         price El precio del coche.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor de la clase Car que inicializa los atributos con los valores
     * proporcionados.
     *
     * @param make  Sirve para saber la marca del coche.
     * @param model Model es para saber el modelo del coche.
     * @param year  Funciona para saber el año del coche.
     * @param price Su funcion es para saber el precio del coche.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * getMake obtiene la marca del coche.
     *
     * @return muestra la marca del coche.
     */
    public String getMake() {
        return make;
    }

    /**
     * setMake establece la marca del coche.
     *
     * @param make muestra la nueva marca del coche.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * getModel obtiene el modelo del coche.
     *
     * @return muestra el modelo del coche.
     */
    public String getModel() {
        return model;
    }

    /**
     * setModel establece el modelo del coche.
     *
     * @param model muestra el nuevo modelo del coche.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * getYear obtiene el año del coche.
     *
     * @return ,muestra el año del coche.
     */
    public int getYear() {
        return year;
    }

    /**
     * setYear establece el año del coche.
     *
     * @param year muestra el nuevo año del coche.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getPrice obtiene el precio del coche.
     *
     * @return muestra el precio del coche.
     */
    public double getPrice() {
        return price;
    }

    /**
     * setPrice establece el precio del coche.
     *
     * @param price muestra el nuevo precio del coche.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una descripción del coche, incluyendo su marca, modelo, año y
     * precio.
     *
     * @return Muestra una cadena que describe el coche.
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Método toString que sobrescribe el método de la clase Object para
     * proporcionar la descripción
     * del coche en lugar de la representación por defecto.
     *
     * @return La descripción del coche.
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Metedo principal:
     * 
     * @param args Método principal que crea un objeto de la clase Car y muestra su
     *             descripción en la consola.
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}
