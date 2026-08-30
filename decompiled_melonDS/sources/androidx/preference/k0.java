package androidx.preference;

import android.widget.SeekBar;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f1587a;

    public k0(SeekBarPreference seekBarPreference) {
        this.f1587a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z10) {
        SeekBarPreference seekBarPreference = this.f1587a;
        if (z10 && (seekBarPreference.f1525d0 || !seekBarPreference.X)) {
            seekBarPreference.f(seekBar);
            return;
        }
        int i10 = i2 + seekBarPreference.B;
        TextView textView = seekBarPreference.Z;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f1587a.X = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.f1587a;
        seekBarPreference.X = false;
        if (seekBar.getProgress() + seekBarPreference.B != seekBarPreference.A) {
            seekBarPreference.f(seekBar);
        }
    }
}
