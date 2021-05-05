package com.hfad.bitsandpizzas;

public class Pizza {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Margarita", "Pizza z serem i sosem pomidorowym",R.drawable.margarita),
            new Pizza("Capriciosa", "Pizza z pieczarkami i szynką", R.drawable.funghi),
            new Pizza("Diavolo", "Pikantna pizza z papryczkami chilli", R.drawable.diavolo)
    };


    private Pizza(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
