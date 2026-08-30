package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn6  reason: default package */
/* loaded from: classes.dex */
public final class qn6 extends yy3 implements mf3, gk1, gz5 {
    public to j0;
    public ds6 k0;
    public od2 l0;
    public mi2 m0;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public List r0;
    public mi2 s0;
    public yq0 t0;
    public mi2 u0;
    public Map v0;
    public s04 w0;
    public on6 x0;
    public pn6 y0;

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        return S0(fs3Var).a(i, fs3Var.getLayoutDirection());
    }

    public final s04 R0() {
        if (this.w0 == null) {
            this.w0 = new s04(this.j0, this.k0, this.l0, this.n0, this.o0, this.p0, this.q0, this.r0);
        }
        s04 s04Var = this.w0;
        s04Var.getClass();
        return s04Var;
    }

    public final s04 S0(od1 od1Var) {
        s04 s04Var;
        pn6 pn6Var = this.y0;
        if (pn6Var != null && pn6Var.c && (s04Var = pn6Var.d) != null) {
            s04Var.d(od1Var);
            return s04Var;
        }
        s04 R0 = R0();
        R0.d(od1Var);
        return R0;
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        boolean z;
        long j;
        List list;
        if (this.i0) {
            oh0 s = xf3Var.A.B.s();
            s04 S0 = S0(xf3Var);
            lr6 lr6Var = S0.n;
            if (lr6Var != null) {
                q04 q04Var = lr6Var.b;
                boolean z2 = false;
                if (lr6Var.d() && this.n0 != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    long j2 = lr6Var.c;
                    y55 b = yf2.b(0L, (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L));
                    s.m();
                    oh0.l(s, b);
                }
                try {
                    xb6 xb6Var = this.k0.a;
                    qo6 qo6Var = xb6Var.m;
                    if (qo6Var == null) {
                        qo6Var = qo6.b;
                    }
                    qo6 qo6Var2 = qo6Var;
                    u26 u26Var = xb6Var.n;
                    if (u26Var == null) {
                        u26Var = u26.d;
                    }
                    u26 u26Var2 = u26Var;
                    ik1 ik1Var = xb6Var.p;
                    if (ik1Var == null) {
                        ik1Var = r72.a;
                    }
                    ik1 ik1Var2 = ik1Var;
                    b60 c = xb6Var.a.c();
                    if (c != null) {
                        q04Var.j(s, c, this.k0.a.a.a(), u26Var2, qo6Var2, ik1Var2);
                    } else {
                        yq0 yq0Var = this.t0;
                        if (yq0Var != null) {
                            j = yq0Var.a();
                        } else {
                            j = xq0.h;
                        }
                        if (j == 16) {
                            if (this.k0.b() != 16) {
                                j = this.k0.b();
                            } else {
                                j = xq0.b;
                            }
                        }
                        q04Var.i(s, j, u26Var2, qo6Var2, ik1Var2);
                    }
                    if (z) {
                        s.j();
                    }
                    pn6 pn6Var = this.y0;
                    if (pn6Var == null || !pn6Var.c) {
                        z2 = ve2.B(this.j0);
                    }
                    if (!z2 && ((list = this.r0) == null || list.isEmpty())) {
                        return;
                    }
                    xf3Var.a();
                    return;
                } catch (Throwable th) {
                    if (z) {
                        s.j();
                    }
                    throw th;
                }
            }
            f81.z(S0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
        }
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        return hi2.f(S0(fs3Var).e(fs3Var.getLayoutDirection()).a());
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            s04 S0 = S0(vv3Var);
            boolean c = S0.c(j, vv3Var.getLayoutDirection());
            lr6 lr6Var = S0.n;
            if (lr6Var != null) {
                long j2 = lr6Var.c;
                lr6Var.b.a.b();
                if (c) {
                    l.N(this, 2).f1();
                    mi2 mi2Var = this.m0;
                    if (mi2Var != null) {
                        mi2Var.n(lr6Var);
                    }
                    Map map = this.v0;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(xb.a, Integer.valueOf(Math.round(lr6Var.d)));
                    map.put(xb.b, Integer.valueOf(Math.round(lr6Var.e)));
                    this.v0 = map;
                }
                mi2 mi2Var2 = this.s0;
                if (mi2Var2 != null) {
                    mi2Var2.n(lr6Var.f);
                }
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                yn4 c2 = mv3Var.c(w81.m(i, i, i2, i2));
                Map map2 = this.v0;
                map2.getClass();
                return vv3Var.s0(i, i2, map2, new ru(c2, 8));
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + S0);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        return hi2.f(S0(fs3Var).e(fs3Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [on6] */
    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        on6 on6Var = this.x0;
        on6 on6Var2 = on6Var;
        if (on6Var == null) {
            ?? r0 = new mi2(this) { // from class: on6
                public final /* synthetic */ qn6 B;

                {
                    this.B = this;
                }

                @Override // defpackage.mi2
                public final Object n(Object obj) {
                    boolean z;
                    long j;
                    boolean z2;
                    int i = r2;
                    lr6 lr6Var = null;
                    qn6 qn6Var = this.B;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            lr6 lr6Var2 = qn6Var.R0().n;
                            if (lr6Var2 != null) {
                                kr6 kr6Var = lr6Var2.a;
                                to toVar = kr6Var.a;
                                ds6 ds6Var = qn6Var.k0;
                                yq0 yq0Var = qn6Var.t0;
                                if (yq0Var != null) {
                                    j = yq0Var.a();
                                } else {
                                    j = xq0.h;
                                }
                                lr6 lr6Var3 = new lr6(new kr6(toVar, ds6.e(ds6Var, j, 0L, null, null, 0L, 0, 0L, 16777214), kr6Var.c, kr6Var.d, kr6Var.e, kr6Var.f, kr6Var.g, kr6Var.h, kr6Var.i, kr6Var.j), lr6Var2.b, lr6Var2.c);
                                list.add(lr6Var3);
                                lr6Var = lr6Var3;
                            }
                            if (lr6Var != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            to toVar2 = (to) obj;
                            pn6 pn6Var = qn6Var.y0;
                            pp1 pp1Var = pp1.A;
                            if (pn6Var != null) {
                                if (!b53.x(toVar2, pn6Var.b)) {
                                    pn6Var.b = toVar2;
                                    s04 s04Var = pn6Var.d;
                                    if (s04Var != null) {
                                        ds6 ds6Var2 = qn6Var.k0;
                                        od2 od2Var = qn6Var.l0;
                                        int i2 = qn6Var.n0;
                                        boolean z3 = qn6Var.o0;
                                        int i3 = qn6Var.p0;
                                        int i4 = qn6Var.q0;
                                        s04Var.a = toVar2;
                                        boolean c = ds6Var2.c(s04Var.k);
                                        s04Var.k = ds6Var2;
                                        if (!c) {
                                            s04Var.q <<= 2;
                                            s04Var.l = null;
                                            s04Var.n = null;
                                            s04Var.p = -1;
                                            s04Var.o = -1;
                                        }
                                        s04Var.b = od2Var;
                                        s04Var.c = i2;
                                        s04Var.d = z3;
                                        s04Var.e = i3;
                                        s04Var.f = i4;
                                        s04Var.g = pp1Var;
                                        s04Var.q = (s04Var.q << 2) | 2;
                                        s04Var.l = null;
                                        s04Var.n = null;
                                        s04Var.p = -1;
                                        s04Var.o = -1;
                                    }
                                }
                            } else {
                                pn6 pn6Var2 = new pn6(qn6Var.j0, toVar2);
                                s04 s04Var2 = new s04(toVar2, qn6Var.k0, qn6Var.l0, qn6Var.n0, qn6Var.o0, qn6Var.p0, qn6Var.q0, pp1Var);
                                s04Var2.d(qn6Var.R0().j);
                                pn6Var2.d = s04Var2;
                                qn6Var.y0 = pn6Var2;
                            }
                            nl2.M(qn6Var);
                            hi2.D(qn6Var);
                            n40.M(qn6Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            pn6 pn6Var3 = qn6Var.y0;
                            if (pn6Var3 == null) {
                                z2 = false;
                            } else {
                                mi2 mi2Var = qn6Var.u0;
                                if (mi2Var != null) {
                                    mi2Var.n(pn6Var3);
                                }
                                pn6 pn6Var4 = qn6Var.y0;
                                if (pn6Var4 != null) {
                                    pn6Var4.c = booleanValue;
                                }
                                nl2.M(qn6Var);
                                hi2.D(qn6Var);
                                n40.M(qn6Var);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
            this.x0 = r0;
            on6Var2 = r0;
        }
        to toVar = this.j0;
        l93[] l93VarArr = pz5.a;
        rz5Var.b(mz5.C, l07.b0(toVar));
        pn6 pn6Var = this.y0;
        if (pn6Var != null) {
            to toVar2 = pn6Var.b;
            qz5 qz5Var = mz5.D;
            l93[] l93VarArr2 = pz5.a;
            l93 l93Var = l93VarArr2[16];
            rz5Var.b(qz5Var, toVar2);
            boolean z = pn6Var.c;
            qz5 qz5Var2 = mz5.E;
            l93 l93Var2 = l93VarArr2[17];
            rz5Var.b(qz5Var2, Boolean.valueOf(z));
        }
        rz5Var.b(dz5.l, new w1(null, new mi2(this) { // from class: on6
            public final /* synthetic */ qn6 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            public final Object n(Object obj) {
                boolean z2;
                long j;
                boolean z22;
                int i = r2;
                lr6 lr6Var = null;
                qn6 qn6Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        lr6 lr6Var2 = qn6Var.R0().n;
                        if (lr6Var2 != null) {
                            kr6 kr6Var = lr6Var2.a;
                            to toVar3 = kr6Var.a;
                            ds6 ds6Var = qn6Var.k0;
                            yq0 yq0Var = qn6Var.t0;
                            if (yq0Var != null) {
                                j = yq0Var.a();
                            } else {
                                j = xq0.h;
                            }
                            lr6 lr6Var3 = new lr6(new kr6(toVar3, ds6.e(ds6Var, j, 0L, null, null, 0L, 0, 0L, 16777214), kr6Var.c, kr6Var.d, kr6Var.e, kr6Var.f, kr6Var.g, kr6Var.h, kr6Var.i, kr6Var.j), lr6Var2.b, lr6Var2.c);
                            list.add(lr6Var3);
                            lr6Var = lr6Var3;
                        }
                        if (lr6Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        to toVar22 = (to) obj;
                        pn6 pn6Var2 = qn6Var.y0;
                        pp1 pp1Var = pp1.A;
                        if (pn6Var2 != null) {
                            if (!b53.x(toVar22, pn6Var2.b)) {
                                pn6Var2.b = toVar22;
                                s04 s04Var = pn6Var2.d;
                                if (s04Var != null) {
                                    ds6 ds6Var2 = qn6Var.k0;
                                    od2 od2Var = qn6Var.l0;
                                    int i2 = qn6Var.n0;
                                    boolean z3 = qn6Var.o0;
                                    int i3 = qn6Var.p0;
                                    int i4 = qn6Var.q0;
                                    s04Var.a = toVar22;
                                    boolean c = ds6Var2.c(s04Var.k);
                                    s04Var.k = ds6Var2;
                                    if (!c) {
                                        s04Var.q <<= 2;
                                        s04Var.l = null;
                                        s04Var.n = null;
                                        s04Var.p = -1;
                                        s04Var.o = -1;
                                    }
                                    s04Var.b = od2Var;
                                    s04Var.c = i2;
                                    s04Var.d = z3;
                                    s04Var.e = i3;
                                    s04Var.f = i4;
                                    s04Var.g = pp1Var;
                                    s04Var.q = (s04Var.q << 2) | 2;
                                    s04Var.l = null;
                                    s04Var.n = null;
                                    s04Var.p = -1;
                                    s04Var.o = -1;
                                }
                            }
                        } else {
                            pn6 pn6Var22 = new pn6(qn6Var.j0, toVar22);
                            s04 s04Var2 = new s04(toVar22, qn6Var.k0, qn6Var.l0, qn6Var.n0, qn6Var.o0, qn6Var.p0, qn6Var.q0, pp1Var);
                            s04Var2.d(qn6Var.R0().j);
                            pn6Var22.d = s04Var2;
                            qn6Var.y0 = pn6Var22;
                        }
                        nl2.M(qn6Var);
                        hi2.D(qn6Var);
                        n40.M(qn6Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        pn6 pn6Var3 = qn6Var.y0;
                        if (pn6Var3 == null) {
                            z22 = false;
                        } else {
                            mi2 mi2Var = qn6Var.u0;
                            if (mi2Var != null) {
                                mi2Var.n(pn6Var3);
                            }
                            pn6 pn6Var4 = qn6Var.y0;
                            if (pn6Var4 != null) {
                                pn6Var4.c = booleanValue;
                            }
                            nl2.M(qn6Var);
                            hi2.D(qn6Var);
                            n40.M(qn6Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        rz5Var.b(dz5.m, new w1(null, new mi2(this) { // from class: on6
            public final /* synthetic */ qn6 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            public final Object n(Object obj) {
                boolean z2;
                long j;
                boolean z22;
                int i = r2;
                lr6 lr6Var = null;
                qn6 qn6Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        lr6 lr6Var2 = qn6Var.R0().n;
                        if (lr6Var2 != null) {
                            kr6 kr6Var = lr6Var2.a;
                            to toVar3 = kr6Var.a;
                            ds6 ds6Var = qn6Var.k0;
                            yq0 yq0Var = qn6Var.t0;
                            if (yq0Var != null) {
                                j = yq0Var.a();
                            } else {
                                j = xq0.h;
                            }
                            lr6 lr6Var3 = new lr6(new kr6(toVar3, ds6.e(ds6Var, j, 0L, null, null, 0L, 0, 0L, 16777214), kr6Var.c, kr6Var.d, kr6Var.e, kr6Var.f, kr6Var.g, kr6Var.h, kr6Var.i, kr6Var.j), lr6Var2.b, lr6Var2.c);
                            list.add(lr6Var3);
                            lr6Var = lr6Var3;
                        }
                        if (lr6Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        to toVar22 = (to) obj;
                        pn6 pn6Var2 = qn6Var.y0;
                        pp1 pp1Var = pp1.A;
                        if (pn6Var2 != null) {
                            if (!b53.x(toVar22, pn6Var2.b)) {
                                pn6Var2.b = toVar22;
                                s04 s04Var = pn6Var2.d;
                                if (s04Var != null) {
                                    ds6 ds6Var2 = qn6Var.k0;
                                    od2 od2Var = qn6Var.l0;
                                    int i2 = qn6Var.n0;
                                    boolean z3 = qn6Var.o0;
                                    int i3 = qn6Var.p0;
                                    int i4 = qn6Var.q0;
                                    s04Var.a = toVar22;
                                    boolean c = ds6Var2.c(s04Var.k);
                                    s04Var.k = ds6Var2;
                                    if (!c) {
                                        s04Var.q <<= 2;
                                        s04Var.l = null;
                                        s04Var.n = null;
                                        s04Var.p = -1;
                                        s04Var.o = -1;
                                    }
                                    s04Var.b = od2Var;
                                    s04Var.c = i2;
                                    s04Var.d = z3;
                                    s04Var.e = i3;
                                    s04Var.f = i4;
                                    s04Var.g = pp1Var;
                                    s04Var.q = (s04Var.q << 2) | 2;
                                    s04Var.l = null;
                                    s04Var.n = null;
                                    s04Var.p = -1;
                                    s04Var.o = -1;
                                }
                            }
                        } else {
                            pn6 pn6Var22 = new pn6(qn6Var.j0, toVar22);
                            s04 s04Var2 = new s04(toVar22, qn6Var.k0, qn6Var.l0, qn6Var.n0, qn6Var.o0, qn6Var.p0, qn6Var.q0, pp1Var);
                            s04Var2.d(qn6Var.R0().j);
                            pn6Var22.d = s04Var2;
                            qn6Var.y0 = pn6Var22;
                        }
                        nl2.M(qn6Var);
                        hi2.D(qn6Var);
                        n40.M(qn6Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        pn6 pn6Var3 = qn6Var.y0;
                        if (pn6Var3 == null) {
                            z22 = false;
                        } else {
                            mi2 mi2Var = qn6Var.u0;
                            if (mi2Var != null) {
                                mi2Var.n(pn6Var3);
                            }
                            pn6 pn6Var4 = qn6Var.y0;
                            if (pn6Var4 != null) {
                                pn6Var4.c = booleanValue;
                            }
                            nl2.M(qn6Var);
                            hi2.D(qn6Var);
                            n40.M(qn6Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        rz5Var.b(dz5.n, new w1(null, new t06(5, this)));
        pz5.a(rz5Var, on6Var2);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        return S0(fs3Var).a(i, fs3Var.getLayoutDirection());
    }
}
