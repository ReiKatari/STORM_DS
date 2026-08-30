package r0;

import android.util.Size;
import j0.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends u0 {

    /* renamed from: o  reason: collision with root package name */
    public final b5.l f12578o;

    /* renamed from: p  reason: collision with root package name */
    public final b5.i f12579p;

    /* renamed from: q  reason: collision with root package name */
    public u0 f12580q;

    /* renamed from: r  reason: collision with root package name */
    public m f12581r;

    /* JADX WARN: Type inference failed for: r3v1, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, b5.n] */
    public k(Size size, int i2) {
        super(size, i2);
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = w.d.class;
        try {
            this.f12579p = obj;
            obj.f2051a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e6) {
            lVar.b(e6);
        }
        this.f12578o = lVar;
    }

    @Override // j0.u0
    public final void a() {
        super.a();
        l0.f.B(new g(this, 2));
    }

    @Override // j0.u0
    public final ta.a f() {
        return this.f12578o;
    }

    public final boolean g(u0 u0Var, Runnable runnable) {
        boolean z10;
        boolean z11;
        Size size = this.f7302h;
        l0.f.e();
        u0Var.getClass();
        int i2 = u0Var.f7303i;
        Size size2 = u0Var.f7302h;
        u0 u0Var2 = this.f12580q;
        boolean z12 = false;
        if (u0Var2 == u0Var) {
            return false;
        }
        if (u0Var2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z10);
        p7.m.g("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i10 = this.f7303i;
        if (i10 == i2) {
            z12 = true;
        }
        p7.m.g("The provider's format(" + i10 + ") must match the parent(" + i2 + ")", z12);
        synchronized (this.f7295a) {
            z11 = this.f7297c;
        }
        p7.m.o("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z11);
        this.f12580q = u0Var;
        m0.i.e(u0Var.c(), this.f12579p);
        u0Var.d();
        m0.i.d(this.f7299e).a(new h(u0Var, 1), ij.a.D());
        m0.i.d(u0Var.f7301g).a(runnable, ij.a.p0());
        return true;
    }
}
