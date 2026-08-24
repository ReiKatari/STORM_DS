package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs6  reason: default package */
/* loaded from: classes.dex */
public final class hs6 extends vy7 {
    public final g60 h0;
    public final id3 i0;
    public final by7 j0;
    public final hs6[] k0;
    public final jd1 l0;
    public final td3 m0;
    public boolean n0;
    public String o0;
    public String p0;

    public hs6(g60 g60Var, id3 id3Var, by7 by7Var, hs6[] hs6VarArr) {
        g60Var.getClass();
        this.h0 = g60Var;
        this.i0 = id3Var;
        this.j0 = by7Var;
        this.k0 = hs6VarArr;
        this.l0 = id3Var.b;
        this.m0 = id3Var.a;
        int ordinal = by7Var.ordinal();
        if (hs6VarArr != null) {
            hs6 hs6Var = hs6VarArr[ordinal];
            if (hs6Var != null || hs6Var != this) {
                hs6VarArr[ordinal] = this;
            }
        }
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void E(char c) {
        d0(String.valueOf(c));
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void K(wb6 wb6Var, int i) {
        wb6Var.getClass();
        d0(wb6Var.g(i));
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void T(int i) {
        if (this.n0) {
            d0(String.valueOf(i));
        } else {
            this.h0.i(i);
        }
    }

    @Override // defpackage.vy7, defpackage.vx0
    public final void V(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        if (obj == null && !this.m0.b) {
            return;
        }
        super.V(wb6Var, i, gg3Var, obj);
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void X(long j) {
        if (this.n0) {
            d0(String.valueOf(j));
        } else {
            this.h0.j(j);
        }
    }

    @Override // defpackage.vy7
    public final void Z(wb6 wb6Var, int i) {
        wb6Var.getClass();
        int i2 = gs6.a[this.j0.ordinal()];
        g60 g60Var = this.h0;
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!g60Var.A) {
                        g60Var.h(',');
                    }
                    g60Var.f();
                    te3.d(this.i0, wb6Var);
                    d0(wb6Var.g(i));
                    g60Var.h(':');
                    g60Var.m();
                    return;
                }
                if (i == 0) {
                    this.n0 = true;
                }
                if (i == 1) {
                    g60Var.h(',');
                    g60Var.m();
                    this.n0 = false;
                    return;
                }
                return;
            } else if (!g60Var.A) {
                if (i % 2 == 0) {
                    g60Var.h(',');
                    g60Var.f();
                } else {
                    g60Var.h(':');
                    g60Var.m();
                    z = false;
                }
                this.n0 = z;
                return;
            } else {
                this.n0 = true;
                g60Var.f();
                return;
            }
        }
        if (!g60Var.A) {
            g60Var.h(',');
        }
        g60Var.f();
    }

    @Override // defpackage.vy7, defpackage.vx0
    public final void a(wb6 wb6Var) {
        wb6Var.getClass();
        by7 by7Var = this.j0;
        if (by7Var.end != 0) {
            g60 g60Var = this.h0;
            g60Var.getClass();
            g60Var.A = false;
            g60Var.h(by7Var.end);
        }
    }

    @Override // defpackage.x32
    public final jd1 b() {
        return this.l0;
    }

    @Override // defpackage.vy7, defpackage.x32
    public final vx0 c(wb6 wb6Var) {
        hs6 hs6Var;
        wb6Var.getClass();
        id3 id3Var = this.i0;
        by7 c = js7.c(id3Var, wb6Var);
        char c2 = c.begin;
        g60 g60Var = this.h0;
        if (c2 != 0) {
            g60Var.h(c2);
            g60Var.A = true;
        }
        String str = this.o0;
        if (str != null) {
            String str2 = this.p0;
            if (str2 == null) {
                str2 = wb6Var.a();
            }
            g60Var.f();
            g60Var.l(str);
            g60Var.h(':');
            d0(str2);
            this.o0 = null;
            this.p0 = null;
        }
        if (this.j0 == c) {
            return this;
        }
        hs6[] hs6VarArr = this.k0;
        if (hs6VarArr != null && (hs6Var = hs6VarArr[c.ordinal()]) != null) {
            return hs6Var;
        }
        return new hs6(g60Var, id3Var, c, hs6VarArr);
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void d0(String str) {
        str.getClass();
        this.h0.l(str);
    }

    @Override // defpackage.x32
    public final void f() {
        g60 g60Var = this.h0;
        g60Var.getClass();
        ((ja3) g60Var.B).f("null");
    }

    @Override // defpackage.vx0
    public final boolean i(wb6 wb6Var) {
        wb6Var.getClass();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (defpackage.nb3.k(r3, defpackage.bt6.h) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != defpackage.zq0.NONE) goto L40;
     */
    @Override // defpackage.x32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(gg3 gg3Var, Object obj) {
        String r;
        String k;
        gg3Var.getClass();
        id3 id3Var = this.i0;
        td3 td3Var = id3Var.a;
        boolean z = gg3Var instanceof fz4;
        zq0 zq0Var = td3Var.f;
        if (!z) {
            int i = ez4.a[zq0Var.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    np2 e = gg3Var.e().e();
                    if (!nb3.k(e, bt6.e)) {
                    }
                    r = uj2.r(id3Var, gg3Var.e());
                } else {
                    i.d();
                    return;
                }
            }
            r = null;
        }
        if (z) {
            fz4 fz4Var = (fz4) gg3Var;
            if (obj == null) {
                u34.A(fz4Var.e(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                xk2.h(fz4Var, this, obj);
                throw null;
            }
        }
        if (r != null) {
            wb6 e2 = gg3Var.e();
            e2.getClass();
            te3.d(id3Var, e2);
            if (q60.k(e2).contains(r)) {
                String a = gg3Var.e().a();
                String a2 = gg3Var.e().a();
                if (td3Var.f == zq0.ALL_JSON_OBJECTS && nb3.k(a, a2)) {
                    k = "in ALL_JSON_OBJECTS class discriminator mode";
                } else {
                    k = i61.k('\'', "as base class '", a);
                }
                throw new le3(i61.n(i61.u("Class '", a2, "' cannot be serialized ", k, " because it has property name that conflicts with JSON class discriminator '"), r, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            np2 e3 = gg3Var.e().e();
            e3.getClass();
            if (!(e3 instanceof bc6)) {
                if (!(e3 instanceof v25)) {
                    if (!(e3 instanceof dz4)) {
                        String a3 = gg3Var.e().a();
                        this.o0 = r;
                        this.p0 = a3;
                    } else {
                        i.m("Actual serializer for polymorphic cannot be polymorphic itself");
                        return;
                    }
                } else {
                    i.m("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    return;
                }
            } else {
                i.m("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
        }
        gg3Var.d(this, obj);
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void l(double d) {
        if (this.n0) {
            d0(String.valueOf(d));
        } else {
            ((ja3) this.h0.B).f(String.valueOf(d));
        }
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new le3(hi2.I(Double.valueOf(d), null), 2, null);
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void m(short s) {
        if (this.n0) {
            d0(String.valueOf((int) s));
        } else {
            this.h0.k(s);
        }
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void o(byte b) {
        if (this.n0) {
            d0(String.valueOf((int) b));
        } else {
            this.h0.g(b);
        }
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void r(boolean z) {
        if (this.n0) {
            d0(String.valueOf(z));
        } else {
            ((ja3) this.h0.B).f(String.valueOf(z));
        }
    }

    @Override // defpackage.vy7, defpackage.x32
    public final x32 s(wb6 wb6Var) {
        wb6Var.getClass();
        boolean a = is6.a(wb6Var);
        by7 by7Var = this.j0;
        id3 id3Var = this.i0;
        g60 g60Var = this.h0;
        if (a) {
            if (!(g60Var instanceof sx0)) {
                g60Var = new sx0((ja3) g60Var.B, this.n0);
            }
            return new hs6(g60Var, id3Var, by7Var, null);
        } else if (wb6Var.h() && wb6Var.equals(fe3.a)) {
            if (!(g60Var instanceof rx0)) {
                g60Var = new rx0((ja3) g60Var.B, this.n0);
            }
            return new hs6(g60Var, id3Var, by7Var, null);
        } else {
            if (this.o0 != null) {
                this.p0 = wb6Var.a();
            }
            return this;
        }
    }

    @Override // defpackage.vy7, defpackage.x32
    public final void x(float f) {
        if (this.n0) {
            d0(String.valueOf(f));
        } else {
            ((ja3) this.h0.B).f(String.valueOf(f));
        }
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new le3(hi2.I(Float.valueOf(f), null), 2, null);
    }
}
