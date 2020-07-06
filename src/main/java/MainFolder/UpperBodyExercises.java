package MainFolder;

import java.util.LinkedList;
import java.util.List;

public enum UpperBodyExercises {
    EXERCISE_PUSHUPS("Pompki Klasyczne", "Zwykłe pompki", 10),
    EXERCISE_WIDE_PUSHUPS("Pompki szerokie", "Szeroki rozstaw dłonie",10),
    EXERCISE_NARROW_PUSHUPS("Pompki wąskie", "Wąski rozstaw dłonie",10),
    EXERCISE_ARCHER_PUSHUPS("Pompki łucznika", "Przybranie pozycji strzału z łuku", 10),
    EXERCISE_KNEE_PUSHUPS("Pompki na kolanach","Klasyczne pompki z oparciem na kolanach",10);

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
