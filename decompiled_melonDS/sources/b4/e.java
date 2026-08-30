package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public static e f1833e;

    /* renamed from: f  reason: collision with root package name */
    public static final w4.j f1834f = w4.j.Rtl;

    /* renamed from: g  reason: collision with root package name */
    public static final w4.j f1835g = w4.j.Ltr;

    /* renamed from: c  reason: collision with root package name */
    public l4.o0 f1836c;

    /* renamed from: d  reason: collision with root package name */
    public i4.p f1837d;

    @Override // b4.b
    public final int[] e(int i2) {
        int i10;
        if (i().length() > 0 && i2 < i().length()) {
            try {
                i4.p pVar = this.f1837d;
                if (pVar != null) {
                    h3.c g10 = pVar.g();
                    int round = Math.round(g10.f6055d - g10.f6053b);
                    if (i2 <= 0) {
                        i2 = 0;
                    }
                    l4.o0 o0Var = this.f1836c;
                    if (o0Var != null) {
                        int d4 = o0Var.f8866b.d(i2);
                        l4.o0 o0Var2 = this.f1836c;
                        if (o0Var2 != null) {
                            float f8 = o0Var2.f8866b.f(d4) + round;
                            l4.o0 o0Var3 = this.f1836c;
                            if (o0Var3 != null) {
                                l4.q qVar = o0Var3.f8866b;
                                int i11 = (f8 > qVar.f(qVar.f8880f - 1) ? 1 : (f8 == qVar.f(qVar.f8880f - 1) ? 0 : -1));
                                l4.o0 o0Var4 = this.f1836c;
                                if (i11 < 0) {
                                    if (o0Var4 != null) {
                                        i10 = o0Var4.f8866b.e(f8);
                                    } else {
                                        nc.k.f("layoutResult");
                                        throw null;
                                    }
                                } else if (o0Var4 != null) {
                                    i10 = o0Var4.f8866b.f8880f;
                                } else {
                                    nc.k.f("layoutResult");
                                    throw null;
                                }
                                return h(i2, r(i10 - 1, f1835g) + 1);
                            }
                            nc.k.f("layoutResult");
                            throw null;
                        }
                        nc.k.f("layoutResult");
                        throw null;
                    }
                    nc.k.f("layoutResult");
                    throw null;
                }
                nc.k.f("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // b4.b
    public final int[] p(int i2) {
        int i10;
        if (i().length() > 0 && i2 > 0) {
            try {
                i4.p pVar = this.f1837d;
                if (pVar != null) {
                    h3.c g10 = pVar.g();
                    int round = Math.round(g10.f6055d - g10.f6053b);
                    int length = i().length();
                    if (length <= i2) {
                        i2 = length;
                    }
                    l4.o0 o0Var = this.f1836c;
                    if (o0Var != null) {
                        int d4 = o0Var.f8866b.d(i2);
                        l4.o0 o0Var2 = this.f1836c;
                        if (o0Var2 != null) {
                            float f8 = o0Var2.f8866b.f(d4) - round;
                            if (f8 > 0.0f) {
                                l4.o0 o0Var3 = this.f1836c;
                                if (o0Var3 != null) {
                                    i10 = o0Var3.f8866b.e(f8);
                                } else {
                                    nc.k.f("layoutResult");
                                    throw null;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i2 == i().length() && i10 < d4) {
                                i10++;
                            }
                            return h(r(i10, f1834f), i2);
                        }
                        nc.k.f("layoutResult");
                        throw null;
                    }
                    nc.k.f("layoutResult");
                    throw null;
                }
                nc.k.f("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int r(int i2, w4.j jVar) {
        l4.o0 o0Var = this.f1836c;
        if (o0Var != null) {
            int f8 = o0Var.f(i2);
            l4.o0 o0Var2 = this.f1836c;
            if (o0Var2 != null) {
                w4.j g10 = o0Var2.g(f8);
                l4.o0 o0Var3 = this.f1836c;
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
