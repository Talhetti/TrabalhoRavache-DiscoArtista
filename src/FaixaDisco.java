public class FaixaDisco {
    private String nomeFaixa;
    private int duracaoFaixa;

    public FaixaDisco(String nomeFaixa, int duracaoFaixa) {
        this.nomeFaixa = nomeFaixa;
        this.duracaoFaixa = duracaoFaixa;
    }

    public String getNomeFaixa() {
        return nomeFaixa;
    }

    public void setNomeFaixa(String nomeFaixa) {
        this.nomeFaixa = nomeFaixa;
    }

    public int getDuracaoFaixa() {
        return duracaoFaixa;
    }

    public void setDuracaoFaixa(int duracaoFaixa) {
        this.duracaoFaixa = duracaoFaixa;
    }

    public String toString(){
        return "\n" + "Faixa: " + this.nomeFaixa + "\n" +
                "Duração: " + this.duracaoFaixa+ "\n";
    }
}
