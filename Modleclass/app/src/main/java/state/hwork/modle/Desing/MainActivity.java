package state.hwork.modle.Desing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import state.hwork.modle.Model.Model_Item;
import state.hwork.modle.Model.MyBaseAdapter;
import state.hwork.modle.R;

public class MainActivity extends AppCompatActivity {
ListView listView;
    int imgLang[]={R.mipmap.ic_launcher,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants,R.drawable.croissants};
String title[]={"Croissants","Croissants","Croissants","Croissants","Croissants","Croissants","Croissants",};
String subtile[]={"For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
        "For all of you ambitious bakers out",
};
ArrayList<Model_Item>arrayListArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        listView=findViewById(R.id.list_user);
        arrayListArrayList=new ArrayList<Model_Item>();
        for(int i = 0; title.length > i; i++){
            Model_Item model_item=new Model_Item(title[i],subtile[i],imgLang[i]);
            arrayListArrayList.add(model_item);
        }
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this,arrayListArrayList);
        listView.setAdapter(myBaseAdapter);

    }
}