package com.hfad.workout;

public class Workout {
    private String name;
    private String description;
    public static final Workout[] workouts = {
            new Workout("Trening podstawowy",
                    "5 pompek\n10 przysiadów\n15 podciągnięć"),
            new Workout("Trening rozszerzony",
                    "100 Podciagniec\n100 Przysiadow\n100 Pajacykow\n100 Brzuszków"),
            new Workout("Trening specjalny",
                    "5 podciagnięc\n10 Przysiadów\n15 Pompek"),
            new Workout("Trening wytrzymałościowy",
                    "Bieg na 500metrów\n21 x 1.5 wyciskanie sztangi\n21 x podciągnięć na drążku")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}