public class Dolphin extends Predator implements Waterfowl {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "va - va";
    }

    @Override
    public int sweemspeed() {
        return 35;
    }
}
