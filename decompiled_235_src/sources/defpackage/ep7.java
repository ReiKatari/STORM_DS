package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep7  reason: default package */
/* loaded from: classes.dex */
public final class ep7 extends hp7 {
    public float[] g;
    public j11 h;

    @Override // defpackage.hp7
    public final void c(j11 j11Var) {
        this.h = j11Var;
    }

    @Override // defpackage.hp7
    public final void d(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        l.M(this.h, view, fArr);
    }
}
