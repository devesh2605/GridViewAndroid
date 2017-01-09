package android.com.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductListAdapter extends BaseAdapter {

    private Context context;
    private List<Product> productList;

    public ProductListAdapter(Context mcontext, List<Product> mProductList) {
        this.context = mcontext;
        this.productList = mProductList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context, R.layout.item_product_list, null);

        TextView tvName = (TextView) v.findViewById(R.id.tv_name);
        TextView tvPrice = (TextView) v.findViewById(R.id.tv_price);
        TextView tvDescription = (TextView) v.findViewById(R.id.tv_description);

        tvName.setText(productList.get(position).getName());
        tvPrice.setText(String.valueOf(productList.get(position).getPrice()) + " $");
        tvDescription.setText(productList.get(position).getDescription());

        v.setTag(productList.get(position).getId());
        return v;
    }
}
