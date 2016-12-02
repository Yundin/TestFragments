package com.yundin.testfragments1;

/**
 * Created by vladislav on 01.12.16.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        TextView text = (TextView) itemView.findViewById(R.id.textpart);
        TextView text2 = (TextView) itemView.findViewById(R.id.name);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imagepart);

        text.setText(products.get(position).getName());
        text2.setText(products.get(position).getPrice());
        imageView.setImageResource(products.get(position).getPic());

        return itemView;
    }
}
