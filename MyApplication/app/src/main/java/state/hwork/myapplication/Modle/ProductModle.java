package state.hwork.myapplication.Modle;

import android.icu.lang.UProperty;

public class ProductModle {
    String id;
    String date;
    String amount;
    String status;
    String productno;
    public ProductModle(String id,String date,String amoumt,String status,String productno) {
        this.id=id;
        this.date=date;
        this.amount=amoumt;
        this.status=status;
        this.productno=productno;

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

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
