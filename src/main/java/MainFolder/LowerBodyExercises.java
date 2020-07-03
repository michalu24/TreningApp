package MainFolder;

public enum LowerBodyExercises {
    EXERCISE_1("Przysiady", "Klasyczne przysiady", 10),
    ;


    private String name;
    private String description;
    private int count;

    LowerBodyExercises(String name, String description, int count) {
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
