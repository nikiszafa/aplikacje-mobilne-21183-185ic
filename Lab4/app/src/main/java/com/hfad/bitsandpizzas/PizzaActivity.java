package com.hfad.bitsandpizzas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZAID = "pizzaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_PIZZAID);
        Pizza pizza = Pizza.pizzas[drinkId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(pizza.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(pizza.getDescription());

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(pizza.getImageResourceId());
        photo.setContentDescription(pizza.getName());
    }

}