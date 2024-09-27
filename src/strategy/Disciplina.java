package strategy;

public class Disciplina {

    ICalcMedia calcMedia;
    double media;
    String nome;
    double p1;
    double p2;
    String situacao;

    // Método para calcular a média e determinar a situação
    public void CalcularMedia() {
        this.media = calcMedia.CalculaMedia(this.p1, this.p2);
        this.situacao = calcMedia.Situacao(this.media);
    }

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}