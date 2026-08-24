package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pv6  reason: default package */
/* loaded from: classes.dex */
public final class pv6 extends ig1 {
    public final gx3 n;
    public final qb0 o;
    public ig1 p;
    public wv6 q;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hl5, java.lang.Object] */
    public pv6(int i, Size size) {
        super(i, size);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            this.o = obj;
            obj.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            tb0Var.b(e);
        }
        this.n = tb0Var;
    }

    @Override // defpackage.ig1
    public final void a() {
        super.a();
        nj2.D(new lv6(this, 2));
    }

    @Override // defpackage.ig1
    public final gx3 f() {
        return this.n;
    }

    public final boolean g(ig1 ig1Var, Runnable runnable) {
        boolean z;
        boolean z2;
        Size size = this.h;
        nj2.h();
        ig1Var.getClass();
        int i = ig1Var.i;
        Size size2 = ig1Var.h;
        ig1 ig1Var2 = this.p;
        boolean z3 = false;
        if (ig1Var2 == ig1Var) {
            return false;
        }
        if (ig1Var2 == null) {
            z = true;
        } else {
            z = false;
        }
        np2.A("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z);
        np2.s("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        if (i2 == i) {
            z3 = true;
        }
        np2.s(xg6.m(i2, i, "The provider's format(", ") must match the parent(", ")"), z3);
        synchronized (this.a) {
            z2 = this.c;
        }
        np2.A("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z2);
        this.p = ig1Var;
        l.J(true, ig1Var.c(), this.o, u24.j());
        ig1Var.d();
        l.F(this.e).a(u24.j(), new mv6(ig1Var, 1));
        l.F(ig1Var.g).a(u24.x(), runnable);
        return true;
    }
}
