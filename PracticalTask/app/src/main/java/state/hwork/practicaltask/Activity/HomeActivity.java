package state.hwork.practicaltask.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import state.hwork.practicaltask.Model.ProductDetail;
import state.hwork.practicaltask.R;

public class HomeActivity extends AppCompatActivity {
    String id[]={"1234"};
    String date[]={"23-03-2020"};
    String amount[]={"30"};
    String status[]={"ewr"};
    String Product[]={"34"};

    ArrayList<ProductDetail> ProductDetailArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        ProductDetailArrayList=new ArrayList<ProductDetail>();
        for (int i = 0; id.length > i; i++) {
            ProductDetail langModel = new ProductDetail(id[i],date[i],amount[i],status[i],Product[i]);
           ProductDetailArrayList.add(langModel);

        }
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ProductDetail adapter = new ProductDetail(ProductDetailArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

    }
}
