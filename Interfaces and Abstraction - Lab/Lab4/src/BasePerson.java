public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String nameToSet) {
        this.name = nameToSet;
    }
}
