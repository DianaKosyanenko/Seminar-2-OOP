public class Duck extends Herbivores implements Walkable, Flayble, Waterfowl   {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya - krya";
    }

    @Override
    public int flyspeed() {
        return 80;
    }

    @Override
    public int walkspeed() {
        return 5;
    }

    @Override
    public int sweemspeed() {
        return 15;
    }
}
