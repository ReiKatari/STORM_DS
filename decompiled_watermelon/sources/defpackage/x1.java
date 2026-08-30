package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x1  reason: default package */
/* loaded from: classes.dex */
public final class x1 extends ClickableSpan {
    public final int A;
    public final t2 B;
    public final int L;

    public x1(int i, t2 t2Var, int i2) {
        this.A = i;
        this.B = t2Var;
        this.L = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A);
        this.B.a.performAction(this.L, bundle);
    }
}
