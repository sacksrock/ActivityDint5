package com.utad.danieliglesia.actividad5interfaces;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by daniel.iglesia on 23/01/2018.
 */

public class ScrollingActivityEvents implements View.OnClickListener {
    ScrollingActivity scrollingActivity;

    public ScrollingActivityEvents(ScrollingActivity scrollingActivity ){
     this.scrollingActivity=scrollingActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            scrollingActivity.showFabs();
        }
    }
}
