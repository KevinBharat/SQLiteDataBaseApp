package state.hwork.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import state.hwork.myapplication.R;

public class ProductDetailActivity extends AppCompatActivity {
    TextView pamount,count;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        back = findViewById(R.id.back);
        pamount = findViewById(R.id.pamount);
        count = findViewById(R.id.count);

        Intent i = getIntent();
        String amount = i.getStringExtra("amount");
        String countno =i.getStringExtra("product");
        pamount.setText(amount);
        count.setText(countno);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductDetailActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}