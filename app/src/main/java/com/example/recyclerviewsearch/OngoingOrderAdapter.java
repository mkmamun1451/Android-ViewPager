package com.example.recyclerviewsearch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OngoingOrderAdapter extends RecyclerView.Adapter<OngoingOrderAdapter.Viewholder>{
    private Context context;
    private List<OngoingOrderData> ongoingOrderData;
    private Boolean aBoolean = true;
    private int counter = 0;

    public OngoingOrderAdapter(Context context, List<OngoingOrderData> ongoingOrderData) {
        this.context = context;
        this.ongoingOrderData = ongoingOrderData;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singletablepage, parent, false);
        return new Viewholder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        OngoingOrderData data = ongoingOrderData.get(position);

        holder.ongoingOrderCustomerName.setText(data.getCustomerName());
        holder.ongoingOrderOderId.setText(data.getOrderid());
        holder.ongoingOrderWaiterName.setText(data.getWaiter());
        holder.RunningTime.setText("Running Time: "+data.getBeforeTime());
    }

    @Override
    public int getItemCount() {
        return ongoingOrderData.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView ongoingOrderTableNo, ongoingOrderCustomerName, ongoingOrderOderId, ongoingOrderWaiterName;
        private CardView tabledetailslayout;
        private TextView cusnamelayout, cusorderlayout, cuswaiterlayout,RunningTime;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tabledetailslayout = itemView.findViewById(R.id.tabledetailslayout);
            ongoingOrderCustomerName = itemView.findViewById(R.id.ongoingOrderCustomerName);
            ongoingOrderOderId = itemView.findViewById(R.id.ongoingOrderOderId);
            ongoingOrderWaiterName = itemView.findViewById(R.id.ongoingOrderWaiterName);
            cusnamelayout = itemView.findViewById(R.id.cusnamelayout);
            cusorderlayout = itemView.findViewById(R.id.cusorderlayout);
            cuswaiterlayout = itemView.findViewById(R.id.cuswaiterlayout);
            RunningTime = itemView.findViewById(R.id.RunningTime);
        }
    }
}
