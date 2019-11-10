package com.zardecs.showcarros.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zardecs.showcarros.R;

public class CustomGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private final int[] gridViewImageId;
    private final String[] trademarkCars;

    public CustomGridViewAdapter(Context context, int[] gridViewImageId, String[] trademarkCars) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.trademarkCars = trademarkCars;
    }

    @Override
    public int getCount() {
        return gridViewImageId.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vehiculos, parent, false);
        }

        final TextView mTvTrademarkCar = convertView.findViewById(R.id.tvTrademarkCar);

        final ImageView imageMarca = convertView.findViewById(R.id.imgMarca);

        mTvTrademarkCar.setText(trademarkCars[position]);
        imageMarca.setImageResource(gridViewImageId[position]);

        return convertView;
    }
}