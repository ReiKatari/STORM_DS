package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd  reason: default package */
/* loaded from: classes.dex */
public final class dd {
    public final qn2 a;
    public final on2 b;
    public final to c;
    public final qn2 d;
    public final vs4 g;
    public final rs4 k;
    public final vs4 l;
    public final vs4 m;
    public final bd n;
    public final ya3 e = new ya3();
    public final u63 f = new u63(this);
    public final ii1 h = np2.I(new wc(this, 0));
    public final ii1 i = np2.I(new wc(this, 1));
    public final rs4 j = new rs4(Float.NaN);

    public dd(Object obj, qn2 qn2Var, on2 on2Var, to toVar, qn2 qn2Var2) {
        this.a = qn2Var;
        this.b = on2Var;
        this.c = toVar;
        this.d = qn2Var2;
        this.g = np2.Y(obj);
        np2.J(new wc(this, 2), xd5.s0);
        this.k = new rs4(RecyclerView.B1);
        this.l = np2.Y(null);
        this.m = np2.Y(new s04(zt1.A));
        this.n = new bd(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xa4 xa4Var, c12 c12Var, s41 s41Var) {
        xc xcVar;
        int i;
        qn2 qn2Var;
        rs4 rs4Var;
        Object a;
        try {
            if (s41Var instanceof xc) {
                xcVar = (xc) s41Var;
                int i2 = xcVar.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xcVar.Y = i2 - Integer.MIN_VALUE;
                    Object obj = xcVar.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = xcVar.Y;
                    qn2Var = this.d;
                    rs4Var = this.j;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ya3 ya3Var = this.e;
                        yc ycVar = new yc(this, c12Var, null, 0);
                        xcVar.Y = 1;
                        ya3Var.getClass();
                        if (g04.C(new ja1(xa4Var, ya3Var, ycVar, (r41) null, 6), xcVar) == x61Var) {
                            return x61Var;
                        }
                    }
                    a = d().a(rs4Var.h());
                    if (a != null && Math.abs(rs4Var.h() - d().c(a)) <= 0.5f && ((Boolean) qn2Var.g(a)).booleanValue()) {
                        f(a);
                    }
                    return jg7.a;
                }
            }
            if (i == 0) {
            }
            a = d().a(rs4Var.h());
            if (a != null) {
                f(a);
            }
            return jg7.a;
        } catch (Throwable th) {
            Object a2 = d().a(rs4Var.h());
            if (a2 != null && Math.abs(rs4Var.h() - d().c(a2)) <= 0.5f && ((Boolean) qn2Var.g(a2)).booleanValue()) {
                f(a2);
            }
            throw th;
        }
        xcVar = new xc(this, s41Var);
        Object obj2 = xcVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = xcVar.Y;
        qn2Var = this.d;
        rs4Var = this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Type inference failed for: r12v2, types: [eo2, ja1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, xa4 xa4Var, sc scVar, s41 s41Var) {
        zc zcVar;
        int i;
        rs4 rs4Var;
        rs4 rs4Var2;
        Object obj2;
        Object a;
        Object a2;
        try {
            if (s41Var instanceof zc) {
                zcVar = (zc) s41Var;
                int i2 = zcVar.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zcVar.Y = i2 - Integer.MIN_VALUE;
                    zc zcVar2 = zcVar;
                    Object obj3 = zcVar2.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = zcVar2.Y;
                    vs4 vs4Var = this.l;
                    qn2 qn2Var = this.d;
                    rs4Var = this.j;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj3);
                            rs4Var2 = rs4Var;
                            obj2 = null;
                            rs4Var = rs4Var;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj3);
                        if (d().a.containsKey(obj)) {
                            ya3 ya3Var = this.e;
                            obj2 = null;
                            try {
                                ad adVar = new ad(this, obj, scVar, null, 0);
                                zcVar2.Y = 1;
                                ya3Var.getClass();
                                rs4Var2 = rs4Var;
                                try {
                                    ?? ja1Var = new ja1(xa4Var, ya3Var, adVar, (r41) null, 6);
                                    obj2 = null;
                                    try {
                                        Object C = g04.C(ja1Var, zcVar2);
                                        rs4Var = ja1Var;
                                        if (C == x61Var) {
                                            return x61Var;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        vs4Var.setValue(obj2);
                                        a = d().a(rs4Var2.h());
                                        if (a != null && Math.abs(rs4Var2.h() - d().c(a)) <= 0.5f && ((Boolean) qn2Var.g(a)).booleanValue()) {
                                            f(a);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    vs4Var.setValue(obj2);
                                    a = d().a(rs4Var2.h());
                                    if (a != null) {
                                        f(a);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                rs4Var2 = rs4Var;
                            }
                        } else {
                            f(obj);
                            return jg7.a;
                        }
                    }
                    vs4Var.setValue(obj2);
                    a2 = d().a(rs4Var2.h());
                    if (a2 != null && Math.abs(rs4Var2.h() - d().c(a2)) <= 0.5f && ((Boolean) qn2Var.g(a2)).booleanValue()) {
                        f(a2);
                    }
                    return jg7.a;
                }
            }
            if (i == 0) {
            }
            vs4Var.setValue(obj2);
            a2 = d().a(rs4Var2.h());
            if (a2 != null) {
                f(a2);
            }
            return jg7.a;
        } catch (Throwable th4) {
            th = th4;
            rs4Var2 = rs4Var;
        }
        zcVar = new zc(this, s41Var);
        zc zcVar22 = zcVar;
        Object obj32 = zcVar22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = zcVar22.Y;
        vs4 vs4Var2 = this.l;
        qn2 qn2Var2 = this.d;
        rs4Var = this.j;
    }

    public final Object c(float f, float f2, Object obj) {
        s04 d = d();
        float c = d.c(obj);
        float floatValue = ((Number) this.b.c()).floatValue();
        int i = (c > f ? 1 : (c == f ? 0 : -1));
        if (i != 0 && !Float.isNaN(c)) {
            qn2 qn2Var = this.a;
            if (i < 0) {
                if (f2 >= floatValue) {
                    Object b = d.b(f, true);
                    b.getClass();
                    return b;
                }
                Object b2 = d.b(f, true);
                b2.getClass();
                if (f >= Math.abs(Math.abs(((Number) qn2Var.g(Float.valueOf(Math.abs(d.c(b2) - c)))).floatValue()) + c)) {
                    return b2;
                }
            } else if (f2 <= (-floatValue)) {
                Object b3 = d.b(f, false);
                b3.getClass();
                return b3;
            } else {
                Object b4 = d.b(f, false);
                b4.getClass();
                float abs = Math.abs(c - Math.abs(((Number) qn2Var.g(Float.valueOf(Math.abs(c - d.c(b4))))).floatValue()));
                if (f >= RecyclerView.B1 ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public final s04 d() {
        return (s04) this.m.getValue();
    }

    public final float e() {
        rs4 rs4Var = this.j;
        if (!Float.isNaN(rs4Var.h())) {
            return rs4Var.h();
        }
        i.m("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return RecyclerView.B1;
    }

    public final void f(Object obj) {
        this.g.setValue(obj);
    }
}
