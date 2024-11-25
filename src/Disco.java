import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String tituloDisco;
    private int anoLancamentoDisco;
    private List<FaixaDisco> faixasDisco;
    private Artista artista;

    public Disco(String tituloDisco, int anoLancamentoDisco) {
        this.tituloDisco = tituloDisco;
        this.anoLancamentoDisco = anoLancamentoDisco;
        this.faixasDisco = new ArrayList<>();
    }

    public String getTituloDisco() {
        return tituloDisco;
    }

    public void setTituloDisco(String tituloDisco) {
        this.tituloDisco = tituloDisco;
    }

    public int getAnoLancamentoDisco() {
        return anoLancamentoDisco;
    }

    public void setAnoLancamentoDisco(int anoLancamentoDisco) {
        this.anoLancamentoDisco = anoLancamentoDisco;
    }

    public List<FaixaDisco> getFaixasDisco() {
        return faixasDisco;
    }

    public void setFaixasDisco(List<FaixaDisco> faixasDisco) {
        this.faixasDisco = faixasDisco;
    }

    public void adicionarFaixas(FaixaDisco faixaDisco) {
        FaixaDisco faixa = new FaixaDisco(faixaDisco.getNomeFaixa(), faixaDisco.getDuracaoFaixa());
        this.faixasDisco.add(faixaDisco);
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String toString(){
        return "Disco: " + this.tituloDisco + "\n" +
                "Ano de Lançamento: " + this.anoLancamentoDisco + "\n" +
                "Artista: " + this.artista + "\n" +
                "Faixa do disco: " + this.faixasDisco;
    }
}