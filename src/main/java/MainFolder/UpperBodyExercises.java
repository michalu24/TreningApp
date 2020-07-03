package MainFolder;

public enum UpperBodyExercises {
    EXERCISE1("Pompki Klasyczne", "Zwykłe pompki", 10);

    private String name;
    private String description;
    private int count;

    UpperBodyExercises(String name, String description, int count) {
        this.name = name;
        this.description = description;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
