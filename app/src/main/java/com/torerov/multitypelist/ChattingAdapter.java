package com.torerov.multitypelist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2015-10-06.
 */
public class ChattingAdapter extends BaseAdapter {

    List<ChattingData> items = new ArrayList<ChattingData>();
    private static final int VIEW_TYPE_COUNT = 3;
    private static final int TYPEINDEX_SEND = 0;
    private static final int TYPEINDEX_RECEIVE = 1;
    private static final int TYPE_INDEX_DATE = 2;

    public void add(ChattingData data){
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        ChattingData d = items.get(position);
        if(d instanceof SendData){
            return TYPEINDEX_SEND;
        } else if( d instanceof  ReceiveData){

        }else {
            return super.getItemViewType(position);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch(getItemViewType(position)){
            case
        }
    }
}
