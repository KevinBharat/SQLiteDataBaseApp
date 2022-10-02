package state.hwork.modle.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import state.hwork.modle.R;

public class MyBaseAdapter extends BaseAdapter {
    Context context;
        ArrayList<Model_Item>model_itemsArrayList;

    public MyBaseAdapter(Context context,ArrayList<Model_Item>model_itemsArrayList){
        this.context=context;
        this.model_itemsArrayList=model_itemsArrayList;
    }
    @Override
    public int getCount() {
        return model_itemsArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return model_itemsArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.user_row,null);

        ImageView itemimg=view.findViewById(R.id.item_img);
        TextView titlename=view.findViewById(R.id.title_name);
        TextView subtitle=view.findViewById(R.id.sub_title);

        Model_Item model_item=model_itemsArrayList.get(i);
        itemimg.setImageResource(model_itemsArrayList.get(i).getImgLang());
        titlename.setText(model_itemsArrayList.get(i).title);
        subtitle.setText(model_itemsArrayList.get(i).subtitle);
        return view;
    }

}
