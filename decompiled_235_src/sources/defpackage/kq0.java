package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq0  reason: default package */
/* loaded from: classes.dex */
public final class kq0 extends gi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kq0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.gi2
    public final void K(int i) {
        switch (this.e) {
            case 0:
                return;
            default:
                h17 h17Var = (h17) this.f;
                h17Var.d = true;
                nq0 nq0Var = (nq0) h17Var.e.get();
                if (nq0Var != null) {
                    nq0Var.A();
                    nq0Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.gi2
    public final void M(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                nq0 nq0Var = chip.d0;
                if (nq0Var.H1) {
                    text = nq0Var.J0;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    h17 h17Var = (h17) obj;
                    h17Var.d = true;
                    nq0 nq0Var2 = (nq0) h17Var.e.get();
                    if (nq0Var2 != null) {
                        nq0Var2.A();
                        nq0Var2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void S(int i) {
    }
}
