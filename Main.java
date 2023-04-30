public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Wolf"))
                .addList(new Rabbite("Hare"))
                .addList(new Duck("DonaltDuck"))
                .addList(new Bet("Betmen"))
                .addList(new Crocodile("Gena"))
                .addList(new Dolphin("Sebasa"));
         for (var item:zoo.getListanimal()) {
            System.out.println(item);

        }
        System.out.println("-----------------");
        for(var item: zoo.getSayable()){
            System.out.println(item.say());
        }
        System.out.println("------------------");
        for (var item :zoo.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.walkspeed());

        }
        System.out.println("-----------------");
        for (var item:zoo.flyable()) {
            System.out.printf("%s - %d\n", item.toString(),item.flyspeed());

        }

        System.out.println("------------------");
        for (var item :zoo.waterfowls()) {
            System.out.printf("%s - %d\n", item.toString(), item.sweemspeed());
        }
        System.out.println("-----------------");
        System.out.println("Winner" +" "+ zoo.winnerWalk());
        System.out.println("-----------------");
        System.out.println("Winner" + " " + zoo.winnerFly());
        System.out.println("Winner" + " " + zoo.winnerSwim());



    }
}