package dio.gof.singleton;


// Singleton Eager - Garante que uma instância vai existir ao iniciar o programa e sempre retornar a mesma instância

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    // evita que a classe seja instanciada em outros locais da aplicação
    private SingletonEager() {
        super();
    }
    // retorna a instância unica
    public static SingletonEager getInstance() {
        return instance;
    }
}
