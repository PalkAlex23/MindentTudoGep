package teszt;

import modell.MindentTudoGep;

public class TesztMindentTudoGep {
    public static void main(String[] args) {
        new TesztMindentTudoGep().tesztesetek();
    }
    
    private void tesztesetek() {
        tesztSzelvenyGeneralas();
    }

    private void tesztSzelvenyGeneralas() {
        tesztUres();
        
        String[] sz = teszt5Szam();
        
        for (String s: sz) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                assert Character.isDigit(c): "nem csak számjegy";
            }
        }
        
    }

    private String[] teszt5Szam() {
        System.out.println("teszt: 5 számot tartalmaz");
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        String[] sz = szelveny.split(",");
        assert sz.length == 5: "nem 5 elemű";
        return sz;
    }

    private void tesztUres() {
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        System.out.println("teszt: nem üres a szelvény");
        assert !szelveny.isBlank(): "üres a szelvény";
    }
    
    private void tesztIntervallum() {
        System.out.println("teszt: minden szám [1;90]");
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        String[] sz = szelveny.split(",");
        for (String s : sz) {
            int szam = Integer.parseInt(s.trim());
            boolean jo = szam >= 1 && szam <= 90;
            assert jo: "hibás intervallum";
        }
    }
    
    private void tesztAzonos() {
        System.out.println("teszt: nincs azonos elem");
        assert false: "van azonos elem";
    }
    
    private void tesztRendezett() {
        System.out.println("teszt: növekvőbe rendezett");
        assert false: "nem rendezett";
    }
}
