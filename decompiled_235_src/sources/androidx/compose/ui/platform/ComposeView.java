package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ComposeView extends p0 {
    public final vs4 i0;
    public boolean j0;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.i0 = np2.Y(null);
    }

    @Override // defpackage.p0
    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(420213850);
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            eo2 eo2Var = (eo2) this.i0.getValue();
            if (eo2Var == null) {
                xq2Var.b0(-1238823553);
            } else {
                xq2Var.b0(98585282);
                eo2Var.o(xq2Var, 0);
            }
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new o0(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.p0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j0;
    }

    public final void setContent(eo2 eo2Var) {
        this.j0 = true;
        this.i0.setValue(eo2Var);
        if (!isAttachedToWindow() && getComposeViewContext$ui() == null) {
            return;
        }
        d();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
