
package gytitanik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GyTitanik {

    
    public static void main(String[] args) {
        
        ArrayList<Titanic> lista = new ArrayList<>();
        
        try 
        {
            FileReader fajl = new FileReader("titanic.txt");
            BufferedReader br = new BufferedReader(fajl);
            String sor = null;
            while ((sor = br.readLine()) != null) 
            {                
                Titanic t = new Titanic(sor);
                lista.add(t);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Hiba a beolvasáskor!" + e);
        }
        
        System.out.println("2. feladat");
        System.out.println("Kategóriák száma: " + lista.size());
        
        System.out.println("3. feladat");
        int osszesEmber = 0;
        for (Titanic t : lista) {
            osszesEmber += t.getEltunt() + t.getTulelo();
        }
        System.out.println(osszesEmber + " fő");
        
        System.out.println("4. feladat");
        Scanner be = new Scanner(System.in);
        System.out.print("Kérek egy szót: ");
        String szo = be.next();
        boolean van = false;
        for (Titanic t : lista) {
            if (t.getKategoria().contains(szo)) {
                System.out.println(t.getKategoria() + ": " +
                        (t.getEltunt()+t.getTulelo()) + " fő");
                van = true;
            }
        }
        if (!van) {
            System.out.println("Nincs találat!");
        }
        
        System.out.println("6. feladat");
        for (Titanic t : lista) {
            if(t.arany() > 0.6)
            {
                System.out.println(t.getKategoria());
            }
        }
        
        System.out.println("7. feladat");
        int maxTulelo = lista.get(0).getTulelo();
        int maxIndex = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getTulelo() > maxTulelo)
            {
                maxTulelo = lista.get(i).getTulelo();
                maxIndex = i;
            }
        }
        System.out.println(lista.get(maxIndex).getKategoria());
    }
    
}
