package dio.gof.strategy;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Comportamento Agressivo = new ComportamentoAgressivo();
        Comportamento Defensivo = new ComportamentoDefensivo();
        Comportamento Normal = new ComportamentoNormal();

        robot.setComportamento(Agressivo);
        robot.mover();
        robot.mover();
        robot.setComportamento(Defensivo);
        robot.mover();
        robot.mover();
        robot.setComportamento(Normal);
        robot.mover();
        robot.mover();

    }
}
