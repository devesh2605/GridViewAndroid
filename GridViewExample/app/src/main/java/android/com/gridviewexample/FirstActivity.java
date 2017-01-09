package android.com.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

    private ListView product;
    private ProductListAdapter productListAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        product = (ListView) findViewById(R.id.listview_product);

        productList = new ArrayList<>();

        productList.add(new Product(1, "iPhone 6", 1000, "Apple iPhone 6S with 16 GB"));
        productList.add(new Product(2, "iPhone 6S Plus", 1500, "Apple iPhone 6S Plus with 16 GB"));
        productList.add(new Product(3, "iPhone 7", 1600, "Apple iPhone 7 with 16 GB"));
        productList.add(new Product(4, "iPhone 7 Plus", 2000, "Apple iPhone 7 Plus with 16 GB"));
        productList.add(new Product(1, "Samsung Galaxy S6", 1000, "Samsung Galaxy S6 with 16 GB"));
        productList.add(new Product(2, "Samsung Galaxy S6 Edge", 1500, "Samsung Galaxy S6 Edge with 16 GB"));
        productList.add(new Product(3, "Samsung Galaxy S7", 1500, "Samsung Galaxy S7 with 16 GB"));
        productList.add(new Product(4, "Samsung Galaxy S7 Edge", 2000, "Samsung Galaxy S7 Edge with 16 GB"));

        productListAdapter = new ProductListAdapter(getApplicationContext(), productList);
        product.setAdapter(productListAdapter);

        product.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Item ID: " + productListAdapter.getItemId(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
