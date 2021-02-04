public class CajaFruta {
    private String identificador,fruta;
    private int peso;

    public CajaFruta(String identificador,String fruta, int peso){
        this.identificador=identificador;
        this.fruta = fruta;
        this.peso= peso;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getFruta() {
        return fruta;
    }
    public int getPeso() {
        return peso;
    }
}
