package ComparablePets;

public class Dragon extends Pet{
    public Dragon(String name) {
        super(name);
    }

    @Override
    public String  speak() {
       return "Roar";
    }
}
