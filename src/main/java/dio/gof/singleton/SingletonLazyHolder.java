package dio.gof.singleton;


// Singleton Lazy Holder - Garante que uma instância vai existir apenas quando for utilizada
//Este enfoque retrasa la creación de la instancia del Singleton hasta el momento en que realmente se necesita.
//Reduce el uso de memoria y mejora el rendimiento en casos donde el Singleton no siempre se utiliza.
public class SingletonLazyHolder {

    private static class InstanceHolder {

        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return SingletonLazyHolder.InstanceHolder.instance;
    }

}