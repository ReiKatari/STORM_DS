package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ao0  reason: default package */
/* loaded from: classes.dex */
public final class ao0 extends yf2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ao0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.yf2
    public final void J(int i) {
        switch (this.e) {
            case 0:
                return;
            default:
                wo6 wo6Var = (wo6) this.f;
                wo6Var.d = true;
                do0 do0Var = (do0) wo6Var.e.get();
                if (do0Var != null) {
                    do0Var.A();
                    do0Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.yf2
    public final void K(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                do0 do0Var = chip.c0;
                if (do0Var.G1) {
                    text = do0Var.I0;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    wo6 wo6Var = (wo6) obj;
                    wo6Var.d = true;
                    do0 do0Var2 = (do0) wo6Var.e.get();
                    if (do0Var2 != null) {
                        do0Var2.A();
                        do0Var2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void X(int i) {
    }
}
