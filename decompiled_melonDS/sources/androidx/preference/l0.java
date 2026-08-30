package androidx.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference A;

    public l0(SeekBarPreference seekBarPreference) {
        this.A = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.A;
            if ((seekBarPreference.f1523b0 || (i2 != 21 && i2 != 22)) && i2 != 23 && i2 != 66) {
                SeekBar seekBar = seekBarPreference.Y;
                if (seekBar == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i2, keyEvent);
            }
        }
        return false;
    }
}
