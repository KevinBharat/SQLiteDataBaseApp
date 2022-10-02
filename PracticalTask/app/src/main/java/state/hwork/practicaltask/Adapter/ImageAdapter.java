package state.hwork.practicaltask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import state.hwork.practicaltask.Model.ImageModel;
import state.hwork.practicaltask.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    // ... ViewHolder class and its constructor as per above
      ArrayList<ImageModel> list;
    // Constructor
    public ImageAdapter(ArrayList<ImageModel> list) {
        this.list = list;
    }
    // Creating a viewHolder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_img, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }
    // Assigning respective data for the views based on the position of the current item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the Subject based on the current position
        ImageModel currentItem = list.get(position);
        ImageView imgData1 = holder.imgData;
        imgData1.setImageResource(currentItem.getImg());
    }
    // Indicating how long your data is
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgData;
        // Constructor - accepts entire row item
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find each view by id you set up in the list_item.xml
            imgData = itemView.findViewById(R.id.img_Product);
        }
    }
}
