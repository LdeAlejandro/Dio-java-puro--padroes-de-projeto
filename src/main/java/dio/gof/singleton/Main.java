package dio.gof.singleton;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Singleton Eager");
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println("*************************************************************");
        System.out.println("Singleton Lazy");
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println("*************************************************************");
        System.out.println("Singleton Lazy Holder");
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
    }
}
