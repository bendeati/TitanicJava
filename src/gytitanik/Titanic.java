
package gytitanik;

public class Titanic {
    
    private String kategoria;
    private int tulelo;
    private int eltunt;
    
    //getterek
    public String getKategoria() {
        return kategoria;
    }

    public int getTulelo() {
        return tulelo;
    }

    public int getEltunt() {
        return eltunt;
    }
    
    //konstruktor
    public Titanic(String sor) 
    {
        String[] d = sor.split(";");
        this.kategoria = d[0];
        this.tulelo = Integer.parseInt(d[1]);
        this.eltunt = Integer.parseInt(d[2]);
    }
    
    public double arany()
    {
        return ((double)eltunt / (eltunt + tulelo));
    }
    
}
