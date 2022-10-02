package state.hwork.practicaltask.Model;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductDetail extends RecyclerView.Adapter {
    private String id;
    private String date;
    private String amount;
    private String status;
    private String Product;
    public ProductDetail(String id,String date,String amount,String status,String Product)
    {
        this.id = id;
        this.date=date;
        this.amount=amount;
        this.status=status;
        this.Product=Product;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }
}
