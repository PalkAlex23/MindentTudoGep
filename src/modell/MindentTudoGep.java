package modell;

// import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class MindentTudoGep {
    private boolean[] szelvenyBoole;
    private int[] szelvenyInt;
    private ArrayList<Integer> szelvenyLista;
    private HashSet<Integer> szelvenyHalmaz;

    public MindentTudoGep() {
        szelvenyBoole = new boolean[91]; // 1 - 90
        booleSzelvenytGeneral();
        intSzelvenytGeneral();
        
        szelvenyHalmaz = new HashSet<>();
        szelvenyGeneral();
    }
    
    public void booleSzelvenytGeneral() {
        Arrays.fill(szelvenyBoole, false);
        int db = 0;
        while (db < 5) {
            int v = (int) (Math.random()* 90) + 1;
            if(!szelvenyBoole[v]) {
                szelvenyBoole[v] = true;
                db++;
            }
        }
    }
    
    
    /*  PROBLÉMÁK
    a getter referenciát ad vissza --> setter
    FÜGG a belső adatszerkezet típusától
    */
    
    public boolean[] getSzelvenyBoole() {
        return szelvenyBoole;
    }

    public void intSzelvenytGeneral() {
        int db = 0;
        while (db < 5) {
            int v = (int) (Math.random()* 90) + 1;
            if(!benneVan(v, db)) {
                szelvenyInt[db] = v;
                db++;
            }
        }
    }

    private boolean benneVan(int v, int db) {
        int i = 0;
        while (i < db && !(szelvenyInt[i] == v)) {
            i++;
        }
        return i < db;
    }
    
    public void szelvenyGeneral() {
        /*
        while (szelvenyLista.size() < 5) {
            int v = (int) (Math.random()* 90) + 1;
            if(!szelvenyLista.contains(v)) {
                szelvenyLista.add(v);
            }
        }
        Collections.sort(szelvenyLista);
        
        /* HashSet */
        while (szelvenyHalmaz.size() < 5) {
            int v = (int) (Math.random() * 90) + 1;
            szelvenyHalmaz.add(v);
        }
    }
    
    public int[] getSzelvenyInt() {
        int[] ujTomb = Arrays.copyOf(szelvenyInt, szelvenyInt.length); 
        return ujTomb;
    }
    
    public String getSzelvenySzoveg() {
        String szoveg = "";
        for (int i = 0; i < szelvenyInt.length-1; i++) {
            szoveg += szelvenyInt[i] + ", ";
        }
        szoveg += szelvenyInt[5];
        return szoveg;
    }
    
    public List<Integer> getSzelvenyLista() {
        /* egy új adatszerkezetet (tömb) adok vissza, már nincs referenciája */
        // return new ArrayList<>(szelvenyLista);
        
        /* nem módosítható listát adunk vissza */
        return Collections.unmodifiableList(szelvenyLista);
    }
}
