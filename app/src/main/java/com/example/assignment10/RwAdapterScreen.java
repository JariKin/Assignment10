package com.example.assignment10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RwAdapterScreen extends RecyclerView.Adapter<RwAdapterScreen.HolderScreen> {

    public RwAdapterScreen(Context context) {
        inflater = LayoutInflater.from(context);
    }

    private final LayoutInflater inflater;
    private List<EntityScreen> screenDate;

    @Override
    public void onBindViewHolder(@NonNull HolderScreen holder, int position) {
        if(screenDate != null) {
            EntityScreen current = screenDate.get(position);
            holder.dateItemView.setText(current.timestamp.toString());
        } else {
            holder.dateItemView.setText("No Data");
        }
    }

    @NonNull
    @Override
    public HolderScreen onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.screen_list_item, parent, false);
        return new HolderScreen(itemView);
    }

    class HolderScreen extends RecyclerView.ViewHolder {
        private final TextView dateItemView;

        private HolderScreen(View itemView) {
            super(itemView);
            dateItemView = itemView.findViewById(R.id.timestamp);
        }
    }

    void setNameDates(List<EntityScreen> nameDates) {
        screenDate = nameDates;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(screenDate != null)
            return screenDate.size();
            else return 0;
        }
}

