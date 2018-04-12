package com.time.cat.util.quicksetting;

import android.content.Intent;
import android.service.quicksettings.TileService;

import com.time.cat.ui.modules.screen.ScreenCaptureActivity;


public class ScreenCaptureTile extends TileService {
    private final int STATE_OFF = 0;
    private final int STATE_ON = 1;
    private int toggleState = STATE_ON;

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onClick() {
        Intent intent = new Intent();
        intent.setClass(this, ScreenCaptureActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityAndCollapse(intent);
    }
}
