import java.util.ArrayList;

public class Cafe {
    private String tipo;
    private ArrayList<Integer> codigos;

    public Cafe(String tCafe) {
        tipo = tCafe;
        codigos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantComplemento() {
        return codigos.size();
    }

    public int getComplementoPosicao(int x) {
        return codigos.get(x);
    }

    public void addComplemento(int cod) {
        codigos.add(cod);
    }

}