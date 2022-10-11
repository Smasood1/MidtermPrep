package ComparablePets;

public class Pet {

    private String name;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }

    public Pet(String name) {
        this.name = name;
    }

    public String speak(){
      return "Animal Noises";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
