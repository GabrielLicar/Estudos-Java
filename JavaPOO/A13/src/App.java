public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro();

        c.reagir("ALou");
        c.reagir(true);
        c.reagir(22, 10);
    }
}
