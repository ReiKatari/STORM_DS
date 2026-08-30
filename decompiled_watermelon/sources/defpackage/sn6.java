package defpackage;

import android.graphics.Typeface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn6  reason: default package */
/* loaded from: classes.dex */
public final class sn6 extends io2 {
    public final /* synthetic */ yf2 j;
    public final /* synthetic */ un6 k;

    public sn6(un6 un6Var, yf2 yf2Var) {
        this.k = un6Var;
        this.j = yf2Var;
    }

    @Override // defpackage.io2
    public final void c0(int i) {
        this.k.n = true;
        this.j.J(i);
    }

    @Override // defpackage.io2
    public final void d0(Typeface typeface) {
        un6 un6Var = this.k;
        Typeface create = Typeface.create(typeface, un6Var.d);
        un6Var.p = create;
        un6Var.n = true;
        this.j.K(create, false);
    }
}
