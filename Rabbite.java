public class Rabbite extends Herbivores implements Walkable{

    public Rabbite(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pipipi";
    }

    @Override
    public String toString() {
        return String.format("Rabbite,%s",super.toString());
    }

    @Override
    public int walkspeed() {
        return 25;
    }
}
