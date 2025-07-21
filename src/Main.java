public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(100,"yes");
        do_animal_stuff(animal,"walk");
        Dog tommy = new Dog();
        do_animal_stuff(tommy,"run");

    }
    public static void do_animal_stuff(Animal animal, String speed)
    {
        animal.noise("bark");
        System.out.println("animal "+speed );
        System.out.println(animal);
    }
}
