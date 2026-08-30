package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j41  reason: default package */
/* loaded from: classes.dex */
public final class j41 implements jx6 {
    public final uv a;
    public final ww2 b;
    public final int c;

    public j41(uv uvVar, ww2 ww2Var, int i) {
        this.a = uvVar;
        this.b = ww2Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        i.i("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.jx6
    public final void a() {
        boolean z;
        this.a.getClass();
        ww2 ww2Var = this.b;
        Drawable a = ww2Var.a();
        uu5 uu5Var = ww2Var.b().y;
        boolean z2 = ww2Var instanceof hi6;
        if (z2 && ((hi6) ww2Var).g) {
            z = false;
        } else {
            z = true;
        }
        new d41(a, uu5Var, this.c, z);
        if (z2 || (ww2Var instanceof m12)) {
            return;
        }
        i.c();
    }
}
