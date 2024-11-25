import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nomeArtista;
    private String estiloMusical;
    private List<Disco> discos;

    public Artista(String nomeArtista, String estiloMusical) {
        this.nomeArtista = nomeArtista;
        this.estiloMusical = estiloMusical;
        this.discos = new ArrayList<>();
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }

    public void adicionarDiscos(Disco disco) {
        this.discos.add(disco);
    }

    public void RemoverDiscos(Disco disco) {
        this.discos.remove(disco);
    }

    public String toString(){
        return "Artista: " + this.nomeArtista + "\n" +
                "Estilo Musical: " + this.estiloMusical;
    }
}
