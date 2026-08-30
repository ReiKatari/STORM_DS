package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db7  reason: default package */
/* loaded from: classes.dex */
public final class db7 extends gb7 {
    public float[] g;
    public ey0 h;

    @Override // defpackage.gb7
    public final void c(ey0 ey0Var) {
        this.h = ey0Var;
    }

    @Override // defpackage.gb7
    public final void d(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        l07.r0(this.h, view, fArr);
    }
}
