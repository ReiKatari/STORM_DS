package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj6  reason: default package */
/* loaded from: classes.dex */
public final class vj6 extends hc1 {
    public final fq3 n;
    public final i90 o;
    public hc1 p;
    public ck6 q;

    /* JADX WARN: Type inference failed for: r3v1, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [pb5, java.lang.Object] */
    public vj6(int i, Size size) {
        super(i, size);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            this.o = obj;
            obj.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            l90Var.b(e);
        }
        this.n = l90Var;
    }

    @Override // defpackage.hc1
    public final void a() {
        super.a();
        nk2.V(new rj6(this, 2));
    }

    @Override // defpackage.hc1
    public final fq3 f() {
        return this.n;
    }

    public final boolean g(hc1 hc1Var, Runnable runnable) {
        boolean z;
        boolean z2;
        Size size = this.h;
        nk2.s();
        hc1Var.getClass();
        int i = hc1Var.i;
        Size size2 = hc1Var.h;
        hc1 hc1Var2 = this.p;
        boolean z3 = false;
        if (hc1Var2 == hc1Var) {
            return false;
        }
        if (hc1Var2 == null) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z);
        nl2.y("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        if (i2 == i) {
            z3 = true;
        }
        nl2.y("The provider's format(" + i2 + ") must match the parent(" + i + ")", z3);
        synchronized (this.a) {
            z2 = this.c;
        }
        nl2.D("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z2);
        this.p = hc1Var;
        jv3.R(true, hc1Var.c(), this.o, iq2.l());
        hc1Var.d();
        jv3.N(this.e).a(new sj6(hc1Var, 1), iq2.l());
        jv3.N(hc1Var.g).a(runnable, iq2.x());
        return true;
    }
}
