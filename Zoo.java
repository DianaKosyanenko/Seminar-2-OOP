import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listanimal = new ArrayList<>();


    public List<Animal> getListanimal() {
        return listanimal;
    }

    public Zoo addList(Animal animal) {
        listanimal.add(animal);
        return this;

    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayables = new ArrayList<>();
        for (var item : listanimal) {
            sayables.add(item);

        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkables() {
        List<Walkable> walkables = new ArrayList<>();
        for (var item : listanimal) {
            if (item instanceof Walkable)
                walkables.add((Walkable) item);

            }
        return walkables;
        }
        public List<Flayble> flyable(){
        List<Flayble> flaybles = new ArrayList<>();
            for (var item:listanimal) {
                if(item instanceof Flayble)
                    flaybles.add((Flayble) item);

            }
            return flaybles;
        }

    public List<Waterfowl> waterfowls() {
        List<Waterfowl> waterfowls = new ArrayList<>();
        for (var item :listanimal) {
            if (item instanceof Waterfowl) {
                waterfowls.add((Waterfowl) item);
            }

        }
        return waterfowls;
    }
        public Walkable winnerWalk(){
        int indx = 0;
            for (int i = 0; i < walkables().size(); i++) {
                if(walkables().get(i).walkspeed() > walkables().get(indx).walkspeed())
                    indx = i;

            }
            return walkables().get(indx);

            }
            public Flayble winnerFly(){
                int indx = 0;
                for (int i = 0; i < flyable().size(); i++) {
                    if ((flyable().get(i).flyspeed() > flyable().get(indx).flyspeed()))
                        indx = i;

                }
                return flyable().get(indx);
            }

    public Waterfowl winnerSwim(){
        int indx = 0;
        for (int i = 0; i < waterfowls().size(); i++) {
            if(waterfowls().get(i).sweemspeed() > waterfowls().get(indx).sweemspeed())
                indx = i;

        }
        return waterfowls().get(indx);

    }
        }



