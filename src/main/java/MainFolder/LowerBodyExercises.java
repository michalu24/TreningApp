package MainFolder;

public enum LowerBodyExercises {
    EXERCISE_SQUAT("Przysiady", "Klasyczne przysiady", 10),
    EXERCISE_WALKING_LUNGE("Wykroki", "Wykroki nogą w przód", 10),
    EXERCISE_ARCHER_SQUAT("Przysiady łucznika", "Przysiady z przenoszeniem ciężaru", 10),
    EXERCISE_ONE_LEG_BOX_SQUAT("Przysiady na jednej nodze", "Przysiady na jednej nodze z oparciem", 10),
    EXERCISE_HOVER_LUNGE ("Przysiady na jednej nodze ze zgięciem kolana", "Zgięte kolano do przyklęku",10);


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
