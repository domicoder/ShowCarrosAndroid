package com.zardecs.showcarros.data.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zardecs.showcarros.R;
import com.zardecs.showcarros.model.detailmodelcar.DetailModelCar;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewCarsAdapter extends ArrayAdapter<DetailModelCar> {

    private Context context;
    private int resourceLayoutItem;
//    private LayoutInflater inflater;
//    private DetailModelCar[] detailModelCar;
    private List<DetailModelCar> detailModelCarList = new ArrayList<>();
//    private final int[] listViewImagesCarsId;
//    private final String[] trademarkCars;
    private int positionTrademarkName;

    public CustomListViewCarsAdapter(Context context, int resourceLayoutItem, List<DetailModelCar> detailModelCarList) {
        super(context, resourceLayoutItem, detailModelCarList);
        this.context = context;
//        this.inflater = (LayoutInflater.from(context));
//        this.listViewImagesCarsId = listViewImagesCarsId;
//        this.trademarkCars = trademarkCars;
        this.detailModelCarList = detailModelCarList;
        this.resourceLayoutItem = resourceLayoutItem;

    }

    @Override
    public int getCount() {
        return detailModelCarList.get(0).getListViewImagesCarsId().length;
    }

    @Override
    public DetailModelCar getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cars_details_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imgCar = convertView.findViewById(R.id.imgCar);
            viewHolder.tvTrademarkCar = convertView.findViewById(R.id.tvTrademarkCar);
            viewHolder.btnShowInfoModelCar = convertView.findViewById(R.id.btnShowInfoCarModel);

            /* IF this tag not added, must be produced
            * null viewHolder properties
            * like <<viewHolder.imgCar is null>>
            */
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        if (detailModelCarList.size() > 1){
            // TODO: Future when size be greater than 1
        } else {
            viewHolder.imgCar.setImageResource(detailModelCarList.get(0).getListViewImagesCarsId()[position]);
            viewHolder.tvTrademarkCar.setText(detailModelCarList.get(0).getTrademarkCars()[detailModelCarList.get(0).getPositionDetails()]);
            viewHolder.btnShowInfoModelCar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Let the event be handled in onItemClick()
                    ((ListView)parent).performItemClick(v, position, 0);
                }
            });
        }
        return convertView;
    }

    static class ViewHolder{
        ImageView imgCar;
        TextView tvTrademarkCar;
        Button btnShowInfoModelCar;
    }


}
