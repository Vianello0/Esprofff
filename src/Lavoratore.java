//il lavortore ha tutte le daratteristiche di persona

//eredita tutti gli attibuti e metodi di persona (Ereditarietà)
public class Lavoratore extends Persona{
    public String mansione;
    public double stipendio;

    public Lavoratore(String cf, String nome, String cognome, int eta, String mansione, double stipendio){
        //chiamo il costruttore della superclasse
        //la persona è la superclasse e il lavoratore è la sottoclasse di persona
        super(cf, nome, cognome, eta);
        this. mansione=mansione;
        this.stipendio=stipendio;
    }
    // overloading(sovraccarico) del metodo costruttore
    //significa avere nella stessa classe più metodi con lo stesso nome ma parametri diversi
    //non tutti i linguaggi supportano l'overloading

    public Lavoratore(){
        //costruttore senza parametri
        super();
        //chiamo il costruttore senza parametri di persona
        //(obbligatorio definirlo anche nella superclasse)
        this.mansione = "";
        this.stipendio = 0.0;
    }
    //si può fare overloading di qualsiasi metodo

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
    //overridding ridefinisco (sovrascrivere) metodo di stampa della classe persona
    //(un metodo della superclasse)
    //abbiamo due metodi con la stessa firma uno nella sottoclasse, l'altro nella superclasse
    public void stampa(){
        //chiamo il metodo di stampa della superclasse
        super.stampa();
        System.out.println("Mansione: " + mansione);
        System.out.println("Stipendio: " + stipendio);
    }
}
