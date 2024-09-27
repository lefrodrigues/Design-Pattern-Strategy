package strategy;

public class Geometrica implements ICalcMedia {

    @Override
    public double CalculaMedia(double a, double b) {
        return Math.sqrt(a * b);
    }

    @Override
    public String Situacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

