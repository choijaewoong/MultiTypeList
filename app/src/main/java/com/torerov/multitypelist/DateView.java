package com.torerov.multitypelist;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2015-10-06.
 */
public class DateView extends FrameLayout{
    public DateView(Context context) {
        super(context);
        init();
    }

    TextView dateView;

    private void init() {
        inflate(getContext(), R.layout.view_date, this);
        dateView = (TextView)findViewById(R.id.text_date);
    }

    public void setData(DateData data){ dateView.setText(data.date);}
}
