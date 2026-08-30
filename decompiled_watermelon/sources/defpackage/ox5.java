package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ox5  reason: default package */
/* loaded from: classes.dex */
public final class ox5 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference A;

    public ox5(SeekBarPreference seekBarPreference) {
        this.A = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.A;
            if ((seekBarPreference.c0 || (i != 21 && i != 22)) && i != 23 && i != 66) {
                SeekBar seekBar = seekBarPreference.Y;
                if (seekBar == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i, keyEvent);
            }
        }
        return false;
    }
}
