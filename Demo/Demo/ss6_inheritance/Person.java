package ss6_inheritance;

public abstract class Person {
    private int id;
    private String name;

    public Person() {

    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void howToGo();
    public abstract void doTask();

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name;
    }
}
