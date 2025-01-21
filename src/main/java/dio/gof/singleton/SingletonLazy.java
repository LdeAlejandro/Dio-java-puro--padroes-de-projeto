package dio.gof.singleton;


// Singleton Lazy - Garante que uma instância vai existir apenas quando for utilizada
public class SingletonLazy {

    private static SingletonLazy instance;

    // evita que a classe seja instanciada em outros locais da aplicação
    private SingletonLazy() {
            super();
    }

    // cria uma instância se ela ainda não foi criada ou retorna a instância criada anteriormente
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
