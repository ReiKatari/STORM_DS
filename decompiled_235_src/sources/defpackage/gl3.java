package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl3  reason: default package */
/* loaded from: classes.dex */
public final class gl3 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl3(Object obj, int i) {
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
                nb1 nb1Var = bVar.L;
                seekBar.getClass();
                int max = seekBar.getMax();
                if (max < 1) {
                    max = 1;
                }
                float f = max;
                float f2 = i / f;
                ((TextView) nb1Var.x).setText(String.valueOf((int) ((f * f2) + bVar.g0)));
                if (!bVar.q0) {
                    ((LayoutEditorView) nb1Var.A).t(f2);
                    return;
                }
                return;
            case 1:
                seekBar.getClass();
                b bVar2 = (b) obj;
                nb1 nb1Var2 = bVar2.L;
                if (bVar2.j0 && z && bVar2.m0.getRatio() != null) {
                    bVar2.q(bVar2.m0, il3.WIDTH);
                } else {
                    bVar2.h0 = i / ((SeekBar) nb1Var2.t).getMax();
                    ((TextView) nb1Var2.z).setText(String.valueOf((int) ((((SeekBar) nb1Var2.t).getMax() * bVar2.h0) + bVar2.g0)));
                }
                if (!bVar2.q0) {
                    ((LayoutEditorView) nb1Var2.A).u(bVar2.h0, bVar2.i0);
                    return;
                }
                return;
            case 2:
                seekBar.getClass();
                b bVar3 = (b) obj;
                nb1 nb1Var3 = bVar3.L;
                if (bVar3.j0 && z && bVar3.m0.getRatio() != null) {
                    bVar3.q(bVar3.m0, il3.HEIGHT);
                } else {
                    bVar3.i0 = i / ((SeekBar) nb1Var3.q).getMax();
                    ((TextView) nb1Var3.w).setText(String.valueOf((int) ((((SeekBar) nb1Var3.q).getMax() * bVar3.i0) + bVar3.g0)));
                }
                if (!bVar3.q0) {
                    ((LayoutEditorView) nb1Var3.A).u(bVar3.h0, bVar3.i0);
                    return;
                }
                return;
            case 3:
                seekBar.getClass();
                float f3 = i / 100.0f;
                b bVar4 = (b) obj;
                if (!bVar4.q0) {
                    ((LayoutEditorView) bVar4.L.A).setSelectedViewAlpha(f3);
                    return;
                }
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                if (z && (seekBarPreference.f0 || !seekBarPreference.X)) {
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
