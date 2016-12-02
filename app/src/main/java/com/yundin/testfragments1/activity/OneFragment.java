package com.yundin.testfragments1.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.yundin.testfragments1.R;
import com.yundin.testfragments1.adapter.ProductAdapter;
import com.yundin.testfragments1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladislav on 02.12.16.
 */
public class OneFragment extends Fragment {

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_one, container, false);


        ArrayList<Product> products = new ArrayList<>();
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
        products.add(new Product("Капуста", "727",R.drawable.card1));

        GridView gridView = (GridView) v.findViewById(R.id.gridView);
        gridView.setAdapter(new ProductAdapter(getContext(),products));

        return v;
    }
}
