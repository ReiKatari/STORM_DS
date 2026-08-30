package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ComposeView extends o0 {
    public final tj4 h0;
    public boolean i0;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.h0 = me2.G(null);
    }

    @Override // defpackage.o0
    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(420213850);
        if (sk2Var.h(this)) {
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
        if (sk2Var.O(i3 & 1, z)) {
            aj2 aj2Var = (aj2) this.h0.getValue();
            if (aj2Var == null) {
                sk2Var.X(-1238823553);
            } else {
                sk2Var.X(98585282);
                aj2Var.j(sk2Var, 0);
            }
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new n0(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.o0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.i0;
    }

    public final void setContent(aj2 aj2Var) {
        this.i0 = true;
        this.h0.setValue(aj2Var);
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
