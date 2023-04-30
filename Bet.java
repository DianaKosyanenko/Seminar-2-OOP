public class Bet extends Predator implements Flayble{


    public Bet(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pip - pip - pip";
    }
    @Override
    public int flyspeed() {
        return 100;
    }
}

