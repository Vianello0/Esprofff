public class Persona {
    public String cf;
    //codice fiscale che rappresenta in modo univoco ogni persona
    //non possono esistere 2 persone con lo stesso cf
    public String nome;
    public String cognome;
    public int eta;
    public Persona(String cf, String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
    }

//overloading del costruttore
    public Persona(){
        this.cf = "";
        this.nome="";
        this.cognome="";
        this.eta=0;
    }
    public void stampa(){
        System.out.println("nome: " + this.nome);
        System.out.println("cognome: " + this.cognome);
        System.out.println("età: " + this.eta);
        System.out.println("Codice Fiscale: " + this.cf);
    }
    public String getCf(){
        return this.cf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEta(){
        return this.eta;
    }
    public void setCf(String cf){
        this.cf = cf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setEta(int eta){
        this.eta = eta;
    }
}
