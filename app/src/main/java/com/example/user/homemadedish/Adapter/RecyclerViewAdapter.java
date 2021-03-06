package com.example.user.homemadedish.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.homemadedish.Module.Event;
import com.example.user.homemadedish.R;

import java.util.List;

/**
 * Created by User on 30/3/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Holder>{

    private List<Event> eventList;
    private LayoutInflater layoutInflater;

    public ItemClickCallBack itemClickCallBack;

    public void setItemClickCallBack(final ItemClickCallBack itemClickCallBack) {
        this.itemClickCallBack = itemClickCallBack;
    }

    public interface ItemClickCallBack {
        void onItemClick(int position);
    }

    public RecyclerViewAdapter(List<Event> eventList, Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.eventList = eventList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_home_page, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Event listItem = eventList.get(position);
        holder.textView_title.setText(listItem.getTitle());
        holder.textView_time.setText(listItem.getTime());
        holder.textView_venue.setText(listItem.getVenue());
        return ;
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView textView_title, textView_venue, textView_time;
        private View container;


        public Holder(View itemView) {
            super(itemView);
            textView_title = (TextView) itemView.findViewById(R.id.text_recycler_title);
            textView_venue = (TextView) itemView.findViewById(R.id.text_recycler_venue);
            textView_time = (TextView) itemView.findViewById(R.id.text_recycler_time);
            container = itemView.findViewById(R.id.container);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickCallBack.onItemClick(getAdapterPosition());
        }
    }

}
