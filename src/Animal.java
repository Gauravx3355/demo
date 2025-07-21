public class Animal {
    private int legs_count;
    private String can_fly;

    public Animal(){}

    public Animal(int legs_count, String can_fly) {
        this.legs_count = legs_count;
        this.can_fly = can_fly;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs_count=" + legs_count +
                ", can_fly='" + can_fly + '\'' +
                '}';
    }

    public void noise(String noise_type)
    {
        System.out.println("animal make "+ noise_type);
    }
}
