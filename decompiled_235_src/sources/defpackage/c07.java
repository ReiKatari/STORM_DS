package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c07  reason: default package */
/* loaded from: classes.dex */
public final class c07 extends z64 implements jm3, mo1, va6 {
    public fp k0;
    public s47 l0;
    public ki2 m0;
    public qn2 n0;
    public int o0;
    public boolean p0;
    public int q0;
    public int r0;
    public List s0;
    public qn2 t0;
    public lt0 u0;
    public qn2 v0;
    public Map w0;
    public y84 x0;
    public a07 y0;
    public b07 z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [a07] */
    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        a07 a07Var = this.y0;
        a07 a07Var2 = a07Var;
        if (a07Var == null) {
            ?? r0 = new qn2(this) { // from class: a07
                public final /* synthetic */ c07 B;

                {
                    this.B = this;
                }

                @Override // defpackage.qn2
                public final Object g(Object obj) {
                    boolean z;
                    long j;
                    boolean z2;
                    int i = r2;
                    a47 a47Var = null;
                    c07 c07Var = this.B;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            a47 a47Var2 = c07Var.R0().n;
                            if (a47Var2 != null) {
                                z37 z37Var = a47Var2.a;
                                fp fpVar = z37Var.a;
                                s47 s47Var = c07Var.l0;
                                lt0 lt0Var = c07Var.u0;
                                if (lt0Var != null) {
                                    j = lt0Var.a();
                                } else {
                                    j = kt0.h;
                                }
                                a47 a47Var3 = new a47(new z37(fpVar, s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214), z37Var.c, z37Var.d, z37Var.e, z37Var.f, z37Var.g, z37Var.h, z37Var.i, z37Var.j), a47Var2.b, a47Var2.c);
                                list.add(a47Var3);
                                a47Var = a47Var3;
                            }
                            if (a47Var != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            fp fpVar2 = (fp) obj;
                            b07 b07Var = c07Var.z0;
                            yt1 yt1Var = yt1.A;
                            if (b07Var != null) {
                                if (!nb3.k(fpVar2, b07Var.b)) {
                                    b07Var.b = fpVar2;
                                    y84 y84Var = b07Var.d;
                                    if (y84Var != null) {
                                        s47 s47Var2 = c07Var.l0;
                                        ki2 ki2Var = c07Var.m0;
                                        int i2 = c07Var.o0;
                                        boolean z3 = c07Var.p0;
                                        int i3 = c07Var.q0;
                                        int i4 = c07Var.r0;
                                        y84Var.a = fpVar2;
                                        boolean c = s47Var2.c(y84Var.k);
                                        y84Var.k = s47Var2;
                                        if (!c) {
                                            y84Var.q <<= 2;
                                            y84Var.l = null;
                                            y84Var.n = null;
                                            y84Var.p = -1;
                                            y84Var.o = -1;
                                        }
                                        y84Var.b = ki2Var;
                                        y84Var.c = i2;
                                        y84Var.d = z3;
                                        y84Var.e = i3;
                                        y84Var.f = i4;
                                        y84Var.g = yt1Var;
                                        y84Var.q = (y84Var.q << 2) | 2;
                                        y84Var.l = null;
                                        y84Var.n = null;
                                        y84Var.p = -1;
                                        y84Var.o = -1;
                                    }
                                }
                            } else {
                                b07 b07Var2 = new b07(c07Var.k0, fpVar2);
                                y84 y84Var2 = new y84(fpVar2, c07Var.l0, c07Var.m0, c07Var.o0, c07Var.p0, c07Var.q0, c07Var.r0, yt1Var);
                                y84Var2.d(c07Var.R0().j);
                                b07Var2.d = y84Var2;
                                c07Var.z0 = b07Var2;
                            }
                            bl2.G(c07Var);
                            xk2.w(c07Var);
                            f04.I(c07Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            b07 b07Var3 = c07Var.z0;
                            if (b07Var3 == null) {
                                z2 = false;
                            } else {
                                qn2 qn2Var = c07Var.v0;
                                if (qn2Var != null) {
                                    qn2Var.g(b07Var3);
                                }
                                b07 b07Var4 = c07Var.z0;
                                if (b07Var4 != null) {
                                    b07Var4.c = booleanValue;
                                }
                                bl2.G(c07Var);
                                xk2.w(c07Var);
                                f04.I(c07Var);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
            this.y0 = r0;
            a07Var2 = r0;
        }
        fp fpVar = this.k0;
        fg3[] fg3VarArr = eb6.a;
        gb6Var.a(bb6.C, hf.b0(fpVar));
        b07 b07Var = this.z0;
        if (b07Var != null) {
            fp fpVar2 = b07Var.b;
            fb6 fb6Var = bb6.D;
            fg3[] fg3VarArr2 = eb6.a;
            fg3 fg3Var = fg3VarArr2[16];
            gb6Var.a(fb6Var, fpVar2);
            boolean z = b07Var.c;
            fb6 fb6Var2 = bb6.E;
            fg3 fg3Var2 = fg3VarArr2[17];
            gb6Var.a(fb6Var2, Boolean.valueOf(z));
        }
        gb6Var.a(sa6.l, new y1(null, new qn2(this) { // from class: a07
            public final /* synthetic */ c07 B;

            {
                this.B = this;
            }

            @Override // defpackage.qn2
            public final Object g(Object obj) {
                boolean z2;
                long j;
                boolean z22;
                int i = r2;
                a47 a47Var = null;
                c07 c07Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        a47 a47Var2 = c07Var.R0().n;
                        if (a47Var2 != null) {
                            z37 z37Var = a47Var2.a;
                            fp fpVar3 = z37Var.a;
                            s47 s47Var = c07Var.l0;
                            lt0 lt0Var = c07Var.u0;
                            if (lt0Var != null) {
                                j = lt0Var.a();
                            } else {
                                j = kt0.h;
                            }
                            a47 a47Var3 = new a47(new z37(fpVar3, s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214), z37Var.c, z37Var.d, z37Var.e, z37Var.f, z37Var.g, z37Var.h, z37Var.i, z37Var.j), a47Var2.b, a47Var2.c);
                            list.add(a47Var3);
                            a47Var = a47Var3;
                        }
                        if (a47Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        fp fpVar22 = (fp) obj;
                        b07 b07Var2 = c07Var.z0;
                        yt1 yt1Var = yt1.A;
                        if (b07Var2 != null) {
                            if (!nb3.k(fpVar22, b07Var2.b)) {
                                b07Var2.b = fpVar22;
                                y84 y84Var = b07Var2.d;
                                if (y84Var != null) {
                                    s47 s47Var2 = c07Var.l0;
                                    ki2 ki2Var = c07Var.m0;
                                    int i2 = c07Var.o0;
                                    boolean z3 = c07Var.p0;
                                    int i3 = c07Var.q0;
                                    int i4 = c07Var.r0;
                                    y84Var.a = fpVar22;
                                    boolean c = s47Var2.c(y84Var.k);
                                    y84Var.k = s47Var2;
                                    if (!c) {
                                        y84Var.q <<= 2;
                                        y84Var.l = null;
                                        y84Var.n = null;
                                        y84Var.p = -1;
                                        y84Var.o = -1;
                                    }
                                    y84Var.b = ki2Var;
                                    y84Var.c = i2;
                                    y84Var.d = z3;
                                    y84Var.e = i3;
                                    y84Var.f = i4;
                                    y84Var.g = yt1Var;
                                    y84Var.q = (y84Var.q << 2) | 2;
                                    y84Var.l = null;
                                    y84Var.n = null;
                                    y84Var.p = -1;
                                    y84Var.o = -1;
                                }
                            }
                        } else {
                            b07 b07Var22 = new b07(c07Var.k0, fpVar22);
                            y84 y84Var2 = new y84(fpVar22, c07Var.l0, c07Var.m0, c07Var.o0, c07Var.p0, c07Var.q0, c07Var.r0, yt1Var);
                            y84Var2.d(c07Var.R0().j);
                            b07Var22.d = y84Var2;
                            c07Var.z0 = b07Var22;
                        }
                        bl2.G(c07Var);
                        xk2.w(c07Var);
                        f04.I(c07Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        b07 b07Var3 = c07Var.z0;
                        if (b07Var3 == null) {
                            z22 = false;
                        } else {
                            qn2 qn2Var = c07Var.v0;
                            if (qn2Var != null) {
                                qn2Var.g(b07Var3);
                            }
                            b07 b07Var4 = c07Var.z0;
                            if (b07Var4 != null) {
                                b07Var4.c = booleanValue;
                            }
                            bl2.G(c07Var);
                            xk2.w(c07Var);
                            f04.I(c07Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        gb6Var.a(sa6.m, new y1(null, new qn2(this) { // from class: a07
            public final /* synthetic */ c07 B;

            {
                this.B = this;
            }

            @Override // defpackage.qn2
            public final Object g(Object obj) {
                boolean z2;
                long j;
                boolean z22;
                int i = r2;
                a47 a47Var = null;
                c07 c07Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        a47 a47Var2 = c07Var.R0().n;
                        if (a47Var2 != null) {
                            z37 z37Var = a47Var2.a;
                            fp fpVar3 = z37Var.a;
                            s47 s47Var = c07Var.l0;
                            lt0 lt0Var = c07Var.u0;
                            if (lt0Var != null) {
                                j = lt0Var.a();
                            } else {
                                j = kt0.h;
                            }
                            a47 a47Var3 = new a47(new z37(fpVar3, s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214), z37Var.c, z37Var.d, z37Var.e, z37Var.f, z37Var.g, z37Var.h, z37Var.i, z37Var.j), a47Var2.b, a47Var2.c);
                            list.add(a47Var3);
                            a47Var = a47Var3;
                        }
                        if (a47Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        fp fpVar22 = (fp) obj;
                        b07 b07Var2 = c07Var.z0;
                        yt1 yt1Var = yt1.A;
                        if (b07Var2 != null) {
                            if (!nb3.k(fpVar22, b07Var2.b)) {
                                b07Var2.b = fpVar22;
                                y84 y84Var = b07Var2.d;
                                if (y84Var != null) {
                                    s47 s47Var2 = c07Var.l0;
                                    ki2 ki2Var = c07Var.m0;
                                    int i2 = c07Var.o0;
                                    boolean z3 = c07Var.p0;
                                    int i3 = c07Var.q0;
                                    int i4 = c07Var.r0;
                                    y84Var.a = fpVar22;
                                    boolean c = s47Var2.c(y84Var.k);
                                    y84Var.k = s47Var2;
                                    if (!c) {
                                        y84Var.q <<= 2;
                                        y84Var.l = null;
                                        y84Var.n = null;
                                        y84Var.p = -1;
                                        y84Var.o = -1;
                                    }
                                    y84Var.b = ki2Var;
                                    y84Var.c = i2;
                                    y84Var.d = z3;
                                    y84Var.e = i3;
                                    y84Var.f = i4;
                                    y84Var.g = yt1Var;
                                    y84Var.q = (y84Var.q << 2) | 2;
                                    y84Var.l = null;
                                    y84Var.n = null;
                                    y84Var.p = -1;
                                    y84Var.o = -1;
                                }
                            }
                        } else {
                            b07 b07Var22 = new b07(c07Var.k0, fpVar22);
                            y84 y84Var2 = new y84(fpVar22, c07Var.l0, c07Var.m0, c07Var.o0, c07Var.p0, c07Var.q0, c07Var.r0, yt1Var);
                            y84Var2.d(c07Var.R0().j);
                            b07Var22.d = y84Var2;
                            c07Var.z0 = b07Var22;
                        }
                        bl2.G(c07Var);
                        xk2.w(c07Var);
                        f04.I(c07Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        b07 b07Var3 = c07Var.z0;
                        if (b07Var3 == null) {
                            z22 = false;
                        } else {
                            qn2 qn2Var = c07Var.v0;
                            if (qn2Var != null) {
                                qn2Var.g(b07Var3);
                            }
                            b07 b07Var4 = c07Var.z0;
                            if (b07Var4 != null) {
                                b07Var4.c = booleanValue;
                            }
                            bl2.G(c07Var);
                            xk2.w(c07Var);
                            f04.I(c07Var);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        gb6Var.a(sa6.n, new y1(null, new t46(this, 12)));
        eb6.a(gb6Var, a07Var2);
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final y84 R0() {
        if (this.x0 == null) {
            this.x0 = new y84(this.k0, this.l0, this.m0, this.o0, this.p0, this.q0, this.r0, this.s0);
        }
        y84 y84Var = this.x0;
        y84Var.getClass();
        return y84Var;
    }

    public final y84 S0(qh1 qh1Var) {
        y84 y84Var;
        b07 b07Var = this.z0;
        if (b07Var != null && b07Var.c && (y84Var = b07Var.d) != null) {
            y84Var.d(qh1Var);
            return y84Var;
        }
        y84 R0 = R0();
        R0.d(qh1Var);
        return R0;
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        return S0(kz3Var).a(i, kz3Var.getLayoutDirection());
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            y84 S0 = S0(g34Var);
            boolean c = S0.c(j, g34Var.getLayoutDirection());
            a47 a47Var = S0.n;
            if (a47Var != null) {
                long j2 = a47Var.c;
                a47Var.b.a.a();
                if (c) {
                    nc1.d0(this, 2).f1();
                    qn2 qn2Var = this.n0;
                    if (qn2Var != null) {
                        qn2Var.g(a47Var);
                    }
                    Map map = this.w0;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(lc.a, Integer.valueOf(Math.round(a47Var.d)));
                    map.put(lc.b, Integer.valueOf(Math.round(a47Var.e)));
                    this.w0 = map;
                }
                qn2 qn2Var2 = this.t0;
                if (qn2Var2 != null) {
                    qn2Var2.g(a47Var.f);
                }
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                dx4 y = x24Var.y(nb3.t(i, i, i2, i2));
                Map map2 = this.w0;
                map2.getClass();
                return g34Var.K(i, i2, map2, new jv(y, 8));
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + S0);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        return ii2.q(S0(kz3Var).e(kz3Var.getLayoutDirection()).c());
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        return S0(kz3Var).a(i, kz3Var.getLayoutDirection());
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        boolean z;
        long j;
        List list;
        if (this.j0) {
            xj0 G = um3Var.A.B.G();
            y84 S0 = S0(um3Var);
            a47 a47Var = S0.n;
            if (a47Var != null) {
                v84 v84Var = a47Var.b;
                boolean z2 = false;
                if (a47Var.d() && this.o0 != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    long j2 = a47Var.c;
                    of5 b = kj2.b(0L, (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L));
                    G.h();
                    xj0.q(G, b);
                }
                try {
                    nn6 nn6Var = this.l0.a;
                    b17 b17Var = nn6Var.m;
                    if (b17Var == null) {
                        b17Var = b17.b;
                    }
                    b17 b17Var2 = b17Var;
                    ge6 ge6Var = nn6Var.n;
                    if (ge6Var == null) {
                        ge6Var = ge6.d;
                    }
                    ge6 ge6Var2 = ge6Var;
                    oo1 oo1Var = nn6Var.p;
                    if (oo1Var == null) {
                        oo1Var = kc2.a;
                    }
                    oo1 oo1Var2 = oo1Var;
                    f80 c = nn6Var.a.c();
                    if (c != null) {
                        v84Var.j(G, c, this.l0.a.a.a(), ge6Var2, b17Var2, oo1Var2);
                    } else {
                        lt0 lt0Var = this.u0;
                        if (lt0Var != null) {
                            j = lt0Var.a();
                        } else {
                            j = kt0.h;
                        }
                        if (j == 16) {
                            if (this.l0.b() != 16) {
                                j = this.l0.b();
                            } else {
                                j = kt0.b;
                            }
                        }
                        v84Var.i(G, j, ge6Var2, b17Var2, oo1Var2);
                    }
                    if (z) {
                        G.p();
                    }
                    b07 b07Var = this.z0;
                    if (b07Var == null || !b07Var.c) {
                        z2 = yh2.w(this.k0);
                    }
                    if (!z2 && ((list = this.s0) == null || list.isEmpty())) {
                        return;
                    }
                    um3Var.b();
                    return;
                } catch (Throwable th) {
                    if (z) {
                        G.p();
                    }
                    throw th;
                }
            }
            e41.y(S0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
        }
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        return ii2.q(S0(kz3Var).e(kz3Var.getLayoutDirection()).b());
    }
}
