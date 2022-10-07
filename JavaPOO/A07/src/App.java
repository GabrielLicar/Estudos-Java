//import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        
        Lutador l[] = new Lutador[3];
        
        l[0] = new Lutador("Jason", "Australia", 27, 1.70, 75, 2, 3, 0);
        l[1] = new Lutador("Nosaj", "Australia", 34, 1.80, 88, 5, 3, 1);
        l[2] = new Lutador("Sajno", "Australia", 0, 0, 120, 0, 0, 0);

        //l[1].Status();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[2]);
        UEC01.lutar();
        l[1].Status();
        l[0].Status();

        /**
         * Testando ArrayList
         * ArrayList<Lutador> ll = new ArrayList<Lutador>();
         * ll.add(new Lutador("Fulaninho", "Brazil", 5, 1.8, 90, 0, 0, 0));
         * ll.get(0).Status();
        */
    }
}
