package main;
import modell.MindentTudoGep;

public class MindentTudoGep2Program {

    public static void main(String[] args) {
        new MindentTudoGep2Program().szelvenyBemutato();
    }

    private void szelvenyBemutato() {
        MindentTudoGep gep = new MindentTudoGep();
        //v Hibás, ha nem hívjuk meg a metódust!! v
        // gep.booleSzelvenytGeneral();
        System.out.println("1. boole szelvény");
        boolean[] szelveny = gep.getSzelvenyBoole();
        booleSzelvenyMutat(szelveny);
        
        System.out.println("\n2. boole szelvény");
        gep.booleSzelvenytGeneral();
        szelveny = gep.getSzelvenyBoole();
        booleSzelvenyMutat(szelveny);
        
        System.out.println("\n3. (int) szelvény");
        gep.intSzelvenytGeneral();
        int[] szelvenyInt = gep.getSzelvenyInt();
        szelvenyInt[0] = 1000;
        szelvenyInt = gep.getSzelvenyInt();
        intSzelvenyMutat(szelvenyInt);
    }

    private void booleSzelvenyMutat(boolean[] szelveny) {
        for (int i = 0; i < szelveny.length; i++) {
            if (szelveny[i]) {
                System.out.print(i + " ");
            }
        }
    }
    
    private void intSzelvenyMutat(int[] szelveny) {
        for (int i = 0; i < szelveny.length; i++) {
            System.out.print(szelveny[i] + " ");
        }
    }
}
