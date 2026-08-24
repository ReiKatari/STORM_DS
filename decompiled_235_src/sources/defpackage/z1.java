package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z1  reason: default package */
/* loaded from: classes.dex */
public final class z1 extends ClickableSpan {
    public final int A;
    public final v2 B;
    public final int L;

    public z1(int i, v2 v2Var, int i2) {
        this.A = i;
        this.B = v2Var;
        this.L = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A);
        this.B.a.performAction(this.L, bundle);
    }
}
