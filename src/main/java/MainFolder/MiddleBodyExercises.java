package MainFolder;

public enum MiddleBodyExercises {
    EXERCISE_1("Spięcia brzucha","Zwykłe brzuszki",10)
    ;


    private String name;
    private String description;
    private int count;

    MiddleBodyExercises(String name, String description, int count) {
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
