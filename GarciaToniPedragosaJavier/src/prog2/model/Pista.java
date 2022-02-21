package prog2.model;

public class Pista {
    private String nom;
    private String color;
    private float longitud;
    private String estatNeu;
    private String estatPista;
    private LlistaRemuntadors dependencies;

    Pista(String nom, String color, float longitud,
            String estatNeu, String estatPista) {

        this.nom = nom;
        this.color = color;
        this.longitud = Math.max(0, longitud);
        this.estatNeu = estatNeu;
        this.estatPista = estatPista;
        this.dependencies = new LlistaRemuntadors();

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLongitud() {
        return this.longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getEstatNeu() {
        return this.estatNeu;
    }

    public void setEstatNeu(String estatNeu) {
        if (estatNeu.toLowerCase().equals("pols") ||
            estatNeu.toLowerCase().equals("primavera") ||
            estatNeu.toLowerCase().equals("dura"))

            this.estatNeu = estatNeu;
    }

    public String getEstatPista() {
        return this.estatPista;
    }

    public void setEstatPista(String estatPista) {
        if (estatPista.toLowerCase().equals("oberta") ||
            estatPista.toLowerCase().equals("tancada"))

            this.estatPista = estatPista;
    }

    //TODO: actualitzaEstat()
    //public void actualitzaEstat();

    public String toString() {
        return "Pista: " + this.nom + ", Color: " + this.color + ", Longitud: " +
        longitud + "Km, Estat de la neu: " + estatNeu + ", Estat de la pista: " +
        estatPista + ", Dependències: " + dependencies.getNoms();
    }

    public void afegirDependencia(Remuntador rm) {
        if (rm != null) dependencies.afegirRemuntador(rm);
    }


}


