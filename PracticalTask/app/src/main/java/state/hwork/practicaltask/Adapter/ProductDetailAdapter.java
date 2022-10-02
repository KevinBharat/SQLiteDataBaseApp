package state.hwork.practicaltask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.security.auth.Subject;

import state.hwork.practicaltask.Model.ImageModel;
import state.hwork.practicaltask.Model.ProductDetail;
import state.hwork.practicaltask.R;


public class ProductDetailAdapter extends RecyclerView.Adapter<ProductDetailAdapter.ViewHolder> {

    // ... ViewHolder class and its constructor as per above


    ArrayList<ProductDetail> list;
    int imgLang[] = {R.drawable.product3,R.drawable.product2,R.drawable.product1};
    ArrayList<ImageModel> imageModelArrayList;

    // Constructor
    public ProductDetailAdapter(ArrayList<ProductDetail> list) {
        this.list = list;
    }

    // Creating a viewHolder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_list, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    // Assigning respective data for the views based on the position of the current item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the Subject based on the current position
        ProductDetail currentItem = list.get(position);


        TextView id = holder.id;
        TextView date=holder.date;
        TextView Amount=holder.Amount;
        TextView status=holder.status;
        TextView Product=holder.Product;
        id.setText(currentItem.getId());
        date.setText(currentItem.getDate());
        Amount.setText(currentItem.getAmount());
        status.setText(currentItem.getStatus());
        Product.setText(currentItem.getProduct());

        imageModelArrayList = new ArrayList<ImageModel>();
        for (int i = 0; imgLang.length > i; i++) {
            ImageModel langModel = new ImageModel(imgLang[i]);
            imageModelArrayList.add(langModel);
        }

        RecyclerView recyclerView = holder.recyclerView;
        ImageAdapter adapter = new ImageAdapter(imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), RecyclerView.HORIZONTAL, false));
    }

    // Indicating how long your data is
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView id;
        public TextView date;
        public TextView Amount;
        public TextView status;
        public TextView Product;
        RecyclerView recyclerView;

        // Constructor - accepts entire row item
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Find each view by id you set up in the list_item.xml
            id = itemView.findViewById(R.id.id);
            date = itemView.findViewById(R.id.date);
            Amount = itemView.findViewById(R.id.amount);
            status = itemView.findViewById(R.id.status);
            Product = itemView.findViewById(R.id.Product);



            recyclerView = itemView.findViewById(R.id.recycler_view);
        }
    }
}