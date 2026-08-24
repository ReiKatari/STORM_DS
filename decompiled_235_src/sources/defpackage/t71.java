package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t71  reason: default package */
/* loaded from: classes.dex */
public final class t71 implements fa7 {
    public final mw a;
    public final a33 b;
    public final int c;

    public t71(mw mwVar, a33 a33Var, int i) {
        this.a = mwVar;
        this.b = a33Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        i.h("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.fa7
    public final void a() {
        boolean z;
        this.a.getClass();
        a33 a33Var = this.b;
        Drawable a = a33Var.a();
        y56 y56Var = a33Var.b().y;
        boolean z2 = a33Var instanceof bu6;
        if (z2 && ((bu6) a33Var).g) {
            z = false;
        } else {
            z = true;
        }
        new n71(a, y56Var, this.c, z);
        if (z2 || (a33Var instanceof b62)) {
            return;
        }
        i.d();
    }
}
