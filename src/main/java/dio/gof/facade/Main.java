package dio.gof.facade;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.migrarCliente("Fulano", "12345678");

    }
}
