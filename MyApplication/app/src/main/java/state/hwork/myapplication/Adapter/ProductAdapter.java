package state.hwork.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import state.hwork.myapplication.Activity.ProductDetailActivity;
import state.hwork.myapplication.Modle.ProductModle;
import state.hwork.myapplication.R;

public class ProductAdapter extends BaseAdapter {
    Context context;
    ArrayList<ProductModle> ProductModleArrayList;

    public ProductAdapter(Context context, ArrayList<ProductModle> ProductModleArrayList) {
        this.context = context;
        this.ProductModleArrayList = ProductModleArrayList;
    }
    @Override
    public int getCount() {
        return ProductModleArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return ProductModleArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.product_raw,null);
        TextView id = view.findViewById(R.id.id);
        TextView date = view.findViewById(R.id.date);
        TextView amount = view.findViewById(R.id.amount);
        TextView status = view.findViewById(R.id.status);
        TextView product = view.findViewById(R.id.Product);

        ProductModle langModel = ProductModleArrayList.get(i);
        id.setText(langModel.getId());
        date.setText(langModel.getDate());
        amount.setText(langModel.getAmount());
        status.setText(langModel.getStatus());
        product.setText(langModel.getProductno());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount =  ProductModleArrayList.get(i).getAmount();
                String product =  ProductModleArrayList.get(i).getProductno();

                Intent i = new Intent(context, ProductDetailActivity.class);
                    i.putExtra("amount",amount);
                    i.putExtra("product", product);
                context.startActivity(i);
            }
        });
        return view;
    }
}
