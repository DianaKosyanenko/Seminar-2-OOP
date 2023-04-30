public class Crocodile extends Predator implements Walkable,Waterfowl{
    public Crocodile(String name) {super(name);}

    @Override
    public int walkspeed() {
        return 10;
    }

    @Override
    public int sweemspeed() {
        return 25;
    }

    @Override
    public String say() {
        return "Hr - hr ";
    }
}
