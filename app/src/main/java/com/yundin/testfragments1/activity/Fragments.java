package com.yundin.testfragments1.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.yundin.testfragments1.R;
import com.yundin.testfragments1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladislav on 02.12.16.
 */
public class Fragments extends AppCompatActivity{

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments);



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
        products.add(new Product("Капуста", "727",R.drawable.card1));

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

        private void setupViewPager(ViewPager viewPager) {
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
            adapter.addFragment(new OneFragment(), "ONE");
            adapter.addFragment(new TwoFragment(), "TWO");
            viewPager.setAdapter(adapter);
        }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
