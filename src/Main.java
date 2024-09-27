

import strategy.Aritmetica;
import strategy.Disciplina;
import strategy.Geometrica;
import strategy.ICalcMedia;

public class Main {
    public static void main(String[] args) throws Exception {
        // Usando cálculo de média aritmética
        ICalcMedia aritmetica = new Aritmetica();
        Disciplina disciplinaAritmetica = new Disciplina(aritmetica);
        disciplinaAritmetica.setNome("Padrões de Desenvolvimento");
        disciplinaAritmetica.setP1(10);
        disciplinaAritmetica.setP2(5);
        disciplinaAritmetica.CalcularMedia();
        System.out.println(String.format("Disciplina: %s P1: %.2f P2: %.2f Media: %.2f Situação: %s",
                disciplinaAritmetica.getNome(),
                disciplinaAritmetica.getP1(),
                disciplinaAritmetica.getP2(),
                disciplinaAritmetica.getMedia(),
                disciplinaAritmetica.getSituacao()));

        // Usando cálculo de média geométrica
        ICalcMedia geometrica = new Geometrica();
        Disciplina disciplinaGeometrica = new Disciplina(geometrica);
        disciplinaGeometrica.setNome("Estrutura de Dados");
        disciplinaGeometrica.setP1(8);
        disciplinaGeometrica.setP2(6);
        disciplinaGeometrica.CalcularMedia();
        System.out.println(String.format("Disciplina: %s P1: %.2f P2: %.2f Media: %.2f Situação: %s",
                disciplinaGeometrica.getNome(),
                disciplinaGeometrica.getP1(),
                disciplinaGeometrica.getP2(),
                disciplinaGeometrica.getMedia(),
                disciplinaGeometrica.getSituacao()));
    }
}