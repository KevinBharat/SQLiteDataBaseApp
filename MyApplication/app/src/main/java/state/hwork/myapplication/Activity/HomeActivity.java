package state.hwork.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import state.hwork.myapplication.Adapter.ProductAdapter;
import state.hwork.myapplication.Modle.ProductModle;
import state.hwork.myapplication.R;

public class HomeActivity extends AppCompatActivity {
    ListView listView;

    String id[] = {"1234","12342","12321","12323"};
    String date[] = {"01-01-2022","01-02-2022","01-03-2022","01-05-2022"};
    String amount[] = {"120","120","125","400"};
    String status[] = {"ABC","XYZ","ZZZ","AAA"};
    String productno[] = {"12","3","2","23"};
    ArrayList<ProductModle> ProductModleArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        listView = findViewById(R.id.listview);
        ProductModleArrayList = new  ArrayList<ProductModle>();
        for (int i = 0; id.length > i; i++) {
            ProductModle langModel = new ProductModle(id[i],date[i],amount[i],status[i],productno[i]);
            ProductModleArrayList.add(langModel);
        }
        ProductAdapter productAdapter = new ProductAdapter(this,ProductModleArrayList);
        listView.setAdapter(productAdapter);
    }
}