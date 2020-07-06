package MainFolder;

public enum MiddleBodyExercises {
    EXERCISE_CRUNCHES("Spięcia brzucha","Zwykłe brzuszki",10),
    EXERCISE_LEG_RISES("Wznosy nóg", "Wznosy nóg w lerzeniu na plecach", 10),
    EXERCISE_SCISSORS("Norzyczki", "Skosy nóg w lerzeniu na plecach", 10),
    EXERCISE_RUSSIAN_TWIST("Skosy tułowie", "Skosy siedząc z obniżonymi plecami", 10),
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
