package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: d  reason: collision with root package name */
    public static d f1804d;

    /* renamed from: e  reason: collision with root package name */
    public static final w4.j f1805e = w4.j.Rtl;

    /* renamed from: f  reason: collision with root package name */
    public static final w4.j f1806f = w4.j.Ltr;

    /* renamed from: c  reason: collision with root package name */
    public l4.o0 f1807c;

    @Override // b4.b
    public final int[] e(int i2) {
        int i10;
        if (i().length() > 0 && i2 < i().length()) {
            l4.o0 o0Var = this.f1807c;
            w4.j jVar = f1805e;
            if (i2 < 0) {
                if (o0Var != null) {
                    i10 = o0Var.f8866b.d(0);
                } else {
                    nc.k.f("layoutResult");
                    throw null;
                }
            } else if (o0Var != null) {
                int d4 = o0Var.f8866b.d(i2);
                if (r(d4, jVar) == i2) {
                    i10 = d4;
                } else {
                    i10 = d4 + 1;
                }
            } else {
                nc.k.f("layoutResult");
                throw null;
            }
            l4.o0 o0Var2 = this.f1807c;
            if (o0Var2 != null) {
                if (i10 < o0Var2.f8866b.f8880f) {
                    return h(r(i10, jVar), r(i10, f1806f) + 1);
                }
            } else {
                nc.k.f("layoutResult");
                throw null;
            }
        }
        return null;
    }

    @Override // b4.b
    public final int[] p(int i2) {
        int i10;
        if (i().length() > 0 && i2 > 0) {
            int length = i().length();
            l4.o0 o0Var = this.f1807c;
            w4.j jVar = f1806f;
            if (i2 > length) {
                if (o0Var != null) {
                    i10 = o0Var.f8866b.d(i().length());
                } else {
                    nc.k.f("layoutResult");
                    throw null;
                }
            } else if (o0Var != null) {
                int d4 = o0Var.f8866b.d(i2);
                if (r(d4, jVar) + 1 == i2) {
                    i10 = d4;
                } else {
                    i10 = d4 - 1;
                }
            } else {
                nc.k.f("layoutResult");
                throw null;
            }
            if (i10 >= 0) {
                return h(r(i10, f1805e), r(i10, jVar) + 1);
            }
        }
        return null;
    }

    public final int r(int i2, w4.j jVar) {
        l4.o0 o0Var = this.f1807c;
        if (o0Var != null) {
            int f8 = o0Var.f(i2);
            l4.o0 o0Var2 = this.f1807c;
            if (o0Var2 != null) {
                w4.j g10 = o0Var2.g(f8);
                l4.o0 o0Var3 = this.f1807c;
                if (jVar != g10) {
                    if (o0Var3 != null) {
                        return o0Var3.f(i2);
                    }
                    nc.k.f("layoutResult");
                    throw null;
                } else if (o0Var3 != null) {
                    return o0Var3.f8866b.c(i2, false) - 1;
                } else {
                    nc.k.f("layoutResult");
                    throw null;
                }
            }
            nc.k.f("layoutResult");
            throw null;
        }
        nc.k.f("layoutResult");
        throw null;
    }
}
