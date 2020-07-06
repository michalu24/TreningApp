package MainFolder;

import java.util.*;

public class ShuffleExercise {

    private static List<UpperBodyExercises> listUpper = new LinkedList<>(Arrays.asList(UpperBodyExercises.values()));
    private static List<LowerBodyExercises> listLower = new LinkedList<>(Arrays.asList(LowerBodyExercises.values()));
    private static List<MiddleBodyExercises> listMiddle = new LinkedList<>(Arrays.asList(MiddleBodyExercises.values()));

    private ShuffleExercise() {

    }

    public static List<UpperBodyExercises> fromUpperBody() {

        Collections.shuffle(listUpper);
        List<UpperBodyExercises> result = new LinkedList<>();

        result.add(listUpper.get(0));
        result.add(listUpper.get(1));
        result.add(listUpper.get(2));

        return result;

    }
    public static List<LowerBodyExercises> fromLowerBody() {

        Collections.shuffle(listUpper);
        List<LowerBodyExercises> result = new LinkedList<>();

        result.add(listLower.get(0));
        result.add(listLower.get(1));
        result.add(listLower.get(2));

        return result;

    }
    public static List<MiddleBodyExercises> fromMiddleBody() {

        Collections.shuffle(listUpper);
        List<MiddleBodyExercises> result = new LinkedList<>();

        result.add(listMiddle.get(0));
        result.add(listMiddle.get(1));
        result.add(listMiddle.get(2));

        return result;

    }
}
