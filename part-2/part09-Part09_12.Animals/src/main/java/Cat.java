
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    

    @Override
    public void makeNoise() {
    purr();
}
}
