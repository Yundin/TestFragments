package com.yundin.testfragments1;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Рыжик", "22", R.drawable.card1));
        products.add(new Product("Барсик", "66", R.drawable.card2));
        products.add(new Product("Мурзик", "89", R.drawable.card3));
        products.add(new Product("Мурка", "77", R.drawable.card4));
        products.add(new Product("Васька", "78", R.drawable.card5));
        products.add(new Product("Полосатик", "73", R.drawable.card6));
        products.add(new Product("Матроскин", "75", R.drawable.card7));
        products.add(new Product("Лизка", "7754",R.drawable.card8));
        products.add(new Product("Томосина", "73",R.drawable.card1));
        products.add(new Product("Бегемот", "747",R.drawable.card1));
        products.add(new Product("Чеширский", "723",R.drawable.card1));
        products.add(new Product("Дивуар", "74",R.drawable.card1));
        products.add(new Product("Тигра", "3457",R.drawable.card1));
        products.add(new Product("Лаура", "7sdf7",R.drawable.card1));
        products.add(new Product("Антон", "7sd7",R.drawable.card1));
        products.add(new Product("Котя", "7df7",R.drawable.card1));
        products.add(new Product("Стар", "77ZXVF",R.drawable.card1));
        products.add(new Product("Зимбабве", "7СМЯ7",R.drawable.card1));
        products.add(new Product("Игорь", "7457",R.drawable.card1));
        products.add(new Product("Пантера", "7sdf7",R.drawable.card1));
        products.add(new Product("Тульский", "727",R.drawable.card1));

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ProductAdapter(this, products));
    }
}