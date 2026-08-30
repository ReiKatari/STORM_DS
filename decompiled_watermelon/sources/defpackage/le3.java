package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: le3  reason: default package */
/* loaded from: classes.dex */
public final class le3 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                b bVar = (b) obj;
                qa7 qa7Var = bVar.L;
                seekBar.getClass();
                int max = seekBar.getMax();
                if (max < 1) {
                    max = 1;
                }
                float f = max;
                float f2 = i / f;
                qa7Var.t.setText(String.valueOf((int) ((f * f2) + bVar.f0)));
                if (!bVar.p0) {
                    qa7Var.v.s(f2);
                    return;
                }
                return;
            case 1:
                seekBar.getClass();
                b bVar2 = (b) obj;
                qa7 qa7Var2 = bVar2.L;
                if (bVar2.i0 && z && bVar2.l0.getRatio() != null) {
                    bVar2.q(bVar2.l0, ne3.WIDTH);
                } else {
                    bVar2.g0 = i / qa7Var2.q.getMax();
                    qa7Var2.u.setText(String.valueOf((int) ((qa7Var2.q.getMax() * bVar2.g0) + bVar2.f0)));
                }
                if (!bVar2.p0) {
                    qa7Var2.v.t(bVar2.g0, bVar2.h0);
                    return;
                }
                return;
            case 2:
                seekBar.getClass();
                b bVar3 = (b) obj;
                qa7 qa7Var3 = bVar3.L;
                if (bVar3.i0 && z && bVar3.l0.getRatio() != null) {
                    bVar3.q(bVar3.l0, ne3.HEIGHT);
                } else {
                    bVar3.h0 = i / qa7Var3.o.getMax();
                    qa7Var3.s.setText(String.valueOf((int) ((qa7Var3.o.getMax() * bVar3.h0) + bVar3.f0)));
                }
                if (!bVar3.p0) {
                    qa7Var3.v.t(bVar3.g0, bVar3.h0);
                    return;
                }
                return;
            case 3:
                seekBar.getClass();
                float f3 = i / 100.0f;
                b bVar4 = (b) obj;
                if (!bVar4.p0) {
                    bVar4.L.v.setSelectedViewAlpha(f3);
                    return;
                }
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                if (z && (seekBarPreference.e0 || !seekBarPreference.X)) {
                    seekBarPreference.f(seekBar);
                    return;
                }
                int i3 = i + seekBarPreference.B;
                TextView textView = seekBarPreference.Z;
                if (textView != null) {
                    textView.setText(String.valueOf(i3));
                    return;
                }
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                seekBar.getClass();
                return;
            case 1:
                seekBar.getClass();
                return;
            case 2:
                seekBar.getClass();
                return;
            case 3:
                seekBar.getClass();
                return;
            default:
                ((SeekBarPreference) this.b).X = true;
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                seekBar.getClass();
                return;
            case 1:
                seekBar.getClass();
                return;
            case 2:
                seekBar.getClass();
                return;
            case 3:
                seekBar.getClass();
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.b;
                seekBarPreference.X = false;
                if (seekBar.getProgress() + seekBarPreference.B != seekBarPreference.A) {
                    seekBarPreference.f(seekBar);
                    return;
                }
                return;
        }
    }
}
