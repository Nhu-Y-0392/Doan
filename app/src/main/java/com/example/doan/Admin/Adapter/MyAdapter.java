package com.example.doan.Admin.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.doan.Admin.Room.DetailRoomFragment;
import com.example.doan.Admin.Data.Room;
import com.example.doan.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<Room> dataList;

    public MyAdapter(Context context, List<Room> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Glide.with(context).load(dataList.get(position).getRoomImage()).into(holder.recImage);
        holder.recTitle.setText(dataList.get(position).getRoomName());
        holder.recDesc.setText(dataList.get(position).getRoomDesc());
        Double price = dataList.get(position).getRoomPrice();
        String priceString = String.format(Locale.getDefault(),"%.3f",price);
        holder.recPrice.setText(priceString);
        //holder.recPrice.setText(dataList.get(position).getRoomPrice());
        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailRoomFragment detailRoomFragment = new DetailRoomFragment();
                Bundle args = new Bundle();
                args.putString("Image", dataList.get(holder.getAdapterPosition()).getRoomImage());
                args.putString("Description", dataList.get(holder.getAdapterPosition()).getRoomDesc());
                args.putString("Title", dataList.get(holder.getAdapterPosition()).getRoomName());
                args.putString("TypeRoom",dataList.get(holder.getAdapterPosition()).getRoomTyperoom());
                args.putDouble("Price", dataList.get(holder.getAdapterPosition()).getRoomPrice());
                args.putString("Key",dataList.get(holder.getAdapterPosition()).getKey());
                detailRoomFragment.setArguments(args);

                FragmentTransaction transaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_fragment, detailRoomFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void searchDataList(ArrayList<Room> searchList){
        dataList = searchList;
        notifyDataSetChanged();
    }


}

class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recTitle, recDesc, recPrice;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        recImage = itemView.findViewById(R.id.recImage);
        recCard = itemView.findViewById(R.id.recCard);
        recDesc = itemView.findViewById(R.id.recDesc);
        recPrice = itemView.findViewById(R.id.recPrice);

        recTitle = itemView.findViewById(R.id.recTitle);
    }
}