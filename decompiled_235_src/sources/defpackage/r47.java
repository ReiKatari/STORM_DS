package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r47  reason: default package */
/* loaded from: classes.dex */
public final class r47 extends z64 implements jm3, mo1, va6 {
    public String k0;
    public s47 l0;
    public ki2 m0;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public lt0 r0;
    public HashMap s0;
    public bs4 t0;
    public s47 u0;
    public p47 v0;
    public q47 w0;

    /* JADX WARN: Type inference failed for: r0v2, types: [p47] */
    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        p47 p47Var = this.v0;
        p47 p47Var2 = p47Var;
        if (p47Var == null) {
            ?? r0 = new qn2(this) { // from class: p47
                public final /* synthetic */ r47 B;

                {
                    this.B = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
                @Override // defpackage.qn2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object g(Object obj) {
                    long j;
                    qh1 qh1Var;
                    a47 a47Var;
                    int i = r2;
                    boolean z = true;
                    r47 r47Var = this.B;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            bs4 R0 = r47Var.R0();
                            s47 s47Var = r47Var.l0;
                            lt0 lt0Var = r47Var.r0;
                            if (lt0Var != null) {
                                j = lt0Var.a();
                            } else {
                                j = kt0.h;
                            }
                            s47 e = s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214);
                            kk3 kk3Var = R0.o;
                            a47 a47Var2 = null;
                            if (kk3Var != null && (qh1Var = R0.i) != null) {
                                fp fpVar = new fp(R0.a);
                                if (R0.j != null && R0.n != null) {
                                    long j2 = R0.p & (-8589934589L);
                                    int i2 = R0.f;
                                    boolean z2 = R0.e;
                                    int i3 = R0.d;
                                    ki2 ki2Var = R0.c;
                                    yt1 yt1Var = yt1.A;
                                    a47Var = new a47(new z37(fpVar, e, yt1Var, i2, z2, i3, qh1Var, kk3Var, ki2Var, j2), new v84(new s9(fpVar, e, (List) yt1Var, qh1Var, ki2Var), j2, R0.f, R0.d), R0.l);
                                    if (a47Var != null) {
                                        list.add(a47Var);
                                        a47Var2 = a47Var;
                                    }
                                    if (a47Var2 == null) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }
                            a47Var = null;
                            if (a47Var != null) {
                            }
                            if (a47Var2 == null) {
                            }
                            return Boolean.valueOf(z);
                        case 1:
                            String str = ((fp) obj).B;
                            q47 q47Var = r47Var.w0;
                            if (q47Var != null) {
                                if (!nb3.k(str, q47Var.b)) {
                                    q47Var.b = str;
                                    bs4 bs4Var = q47Var.d;
                                    if (bs4Var != null) {
                                        bs4Var.f(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                                    }
                                }
                            } else {
                                q47 q47Var2 = new q47(r47Var.k0, str);
                                bs4 bs4Var2 = new bs4(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                                bs4Var2.d(r47Var.R0().i);
                                q47Var2.d = bs4Var2;
                                r47Var.w0 = q47Var2;
                            }
                            bl2.G(r47Var);
                            xk2.w(r47Var);
                            f04.I(r47Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            q47 q47Var3 = r47Var.w0;
                            if (q47Var3 == null) {
                                z = false;
                            } else {
                                q47Var3.c = booleanValue;
                                bl2.G(r47Var);
                                xk2.w(r47Var);
                                f04.I(r47Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.v0 = r0;
            p47Var2 = r0;
        }
        fp fpVar = new fp(this.k0);
        fg3[] fg3VarArr = eb6.a;
        gb6Var.a(bb6.C, hf.b0(fpVar));
        q47 q47Var = this.w0;
        if (q47Var != null) {
            boolean z = q47Var.c;
            fb6 fb6Var = bb6.E;
            fg3[] fg3VarArr2 = eb6.a;
            fg3 fg3Var = fg3VarArr2[17];
            gb6Var.a(fb6Var, Boolean.valueOf(z));
            fp fpVar2 = new fp(q47Var.b);
            fb6 fb6Var2 = bb6.D;
            fg3 fg3Var2 = fg3VarArr2[16];
            gb6Var.a(fb6Var2, fpVar2);
        }
        gb6Var.a(sa6.l, new y1(null, new qn2(this) { // from class: p47
            public final /* synthetic */ r47 B;

            {
                this.B = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
            @Override // defpackage.qn2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object g(Object obj) {
                long j;
                qh1 qh1Var;
                a47 a47Var;
                int i = r2;
                boolean z2 = true;
                r47 r47Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        bs4 R0 = r47Var.R0();
                        s47 s47Var = r47Var.l0;
                        lt0 lt0Var = r47Var.r0;
                        if (lt0Var != null) {
                            j = lt0Var.a();
                        } else {
                            j = kt0.h;
                        }
                        s47 e = s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214);
                        kk3 kk3Var = R0.o;
                        a47 a47Var2 = null;
                        if (kk3Var != null && (qh1Var = R0.i) != null) {
                            fp fpVar3 = new fp(R0.a);
                            if (R0.j != null && R0.n != null) {
                                long j2 = R0.p & (-8589934589L);
                                int i2 = R0.f;
                                boolean z22 = R0.e;
                                int i3 = R0.d;
                                ki2 ki2Var = R0.c;
                                yt1 yt1Var = yt1.A;
                                a47Var = new a47(new z37(fpVar3, e, yt1Var, i2, z22, i3, qh1Var, kk3Var, ki2Var, j2), new v84(new s9(fpVar3, e, (List) yt1Var, qh1Var, ki2Var), j2, R0.f, R0.d), R0.l);
                                if (a47Var != null) {
                                    list.add(a47Var);
                                    a47Var2 = a47Var;
                                }
                                if (a47Var2 == null) {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                            }
                        }
                        a47Var = null;
                        if (a47Var != null) {
                        }
                        if (a47Var2 == null) {
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        String str = ((fp) obj).B;
                        q47 q47Var2 = r47Var.w0;
                        if (q47Var2 != null) {
                            if (!nb3.k(str, q47Var2.b)) {
                                q47Var2.b = str;
                                bs4 bs4Var = q47Var2.d;
                                if (bs4Var != null) {
                                    bs4Var.f(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                                }
                            }
                        } else {
                            q47 q47Var22 = new q47(r47Var.k0, str);
                            bs4 bs4Var2 = new bs4(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                            bs4Var2.d(r47Var.R0().i);
                            q47Var22.d = bs4Var2;
                            r47Var.w0 = q47Var22;
                        }
                        bl2.G(r47Var);
                        xk2.w(r47Var);
                        f04.I(r47Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q47 q47Var3 = r47Var.w0;
                        if (q47Var3 == null) {
                            z2 = false;
                        } else {
                            q47Var3.c = booleanValue;
                            bl2.G(r47Var);
                            xk2.w(r47Var);
                            f04.I(r47Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        gb6Var.a(sa6.m, new y1(null, new qn2(this) { // from class: p47
            public final /* synthetic */ r47 B;

            {
                this.B = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
            @Override // defpackage.qn2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object g(Object obj) {
                long j;
                qh1 qh1Var;
                a47 a47Var;
                int i = r2;
                boolean z2 = true;
                r47 r47Var = this.B;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        bs4 R0 = r47Var.R0();
                        s47 s47Var = r47Var.l0;
                        lt0 lt0Var = r47Var.r0;
                        if (lt0Var != null) {
                            j = lt0Var.a();
                        } else {
                            j = kt0.h;
                        }
                        s47 e = s47.e(s47Var, j, 0L, null, null, 0L, 0, 0L, 16777214);
                        kk3 kk3Var = R0.o;
                        a47 a47Var2 = null;
                        if (kk3Var != null && (qh1Var = R0.i) != null) {
                            fp fpVar3 = new fp(R0.a);
                            if (R0.j != null && R0.n != null) {
                                long j2 = R0.p & (-8589934589L);
                                int i2 = R0.f;
                                boolean z22 = R0.e;
                                int i3 = R0.d;
                                ki2 ki2Var = R0.c;
                                yt1 yt1Var = yt1.A;
                                a47Var = new a47(new z37(fpVar3, e, yt1Var, i2, z22, i3, qh1Var, kk3Var, ki2Var, j2), new v84(new s9(fpVar3, e, (List) yt1Var, qh1Var, ki2Var), j2, R0.f, R0.d), R0.l);
                                if (a47Var != null) {
                                    list.add(a47Var);
                                    a47Var2 = a47Var;
                                }
                                if (a47Var2 == null) {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                            }
                        }
                        a47Var = null;
                        if (a47Var != null) {
                        }
                        if (a47Var2 == null) {
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        String str = ((fp) obj).B;
                        q47 q47Var2 = r47Var.w0;
                        if (q47Var2 != null) {
                            if (!nb3.k(str, q47Var2.b)) {
                                q47Var2.b = str;
                                bs4 bs4Var = q47Var2.d;
                                if (bs4Var != null) {
                                    bs4Var.f(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                                }
                            }
                        } else {
                            q47 q47Var22 = new q47(r47Var.k0, str);
                            bs4 bs4Var2 = new bs4(str, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
                            bs4Var2.d(r47Var.R0().i);
                            q47Var22.d = bs4Var2;
                            r47Var.w0 = q47Var22;
                        }
                        bl2.G(r47Var);
                        xk2.w(r47Var);
                        f04.I(r47Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q47 q47Var3 = r47Var.w0;
                        if (q47Var3 == null) {
                            z2 = false;
                        } else {
                            q47Var3.c = booleanValue;
                            bl2.G(r47Var);
                            xk2.w(r47Var);
                            f04.I(r47Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        gb6Var.a(sa6.n, new y1(null, new t46(this, 16)));
        eb6.a(gb6Var, p47Var2);
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final bs4 R0() {
        s47 s47Var = this.u0;
        if (s47Var == null) {
            s47Var = this.l0;
        }
        s47 s47Var2 = s47Var;
        if (this.t0 == null) {
            this.t0 = new bs4(this.k0, s47Var2, this.m0, this.n0, this.o0, this.p0, this.q0);
        }
        bs4 bs4Var = this.t0;
        bs4Var.getClass();
        return bs4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bs4 S0(g34 g34Var) {
        bs4 R0;
        if (T0(1)) {
            s47 s47Var = this.u0;
            if (s47Var == null) {
                s47Var = this.l0;
            }
            R0().f(this.k0, s47Var, this.m0, this.n0, this.o0, this.p0, this.q0);
        }
        q47 q47Var = this.w0;
        if (q47Var != null) {
            if (!q47Var.c) {
                q47Var = null;
            }
            if (q47Var != null) {
                R0 = q47Var.d;
            }
        }
        R0 = R0();
        R0.d(g34Var);
        return R0;
    }

    public final boolean T0(int i) {
        s47 s47Var = this.u0;
        s47 s47Var2 = this.l0;
        ii2.V(this, "StyleOuterNode", new h37(4));
        this.u0 = s47Var2;
        if (s47Var == null) {
            return false;
        }
        return !s47Var.equals(s47Var2);
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        return S0(kz3Var).a(i, kz3Var.getLayoutDirection());
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            bs4 S0 = S0(g34Var);
            boolean b = S0.b(j, g34Var.getLayoutDirection());
            as4 as4Var = S0.n;
            if (as4Var != null) {
                as4Var.a();
            }
            cj cjVar = S0.j;
            cjVar.getClass();
            y37 y37Var = cjVar.d;
            long j2 = S0.l;
            if (b) {
                nc1.d0(this, 2).f1();
                HashMap hashMap = this.s0;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.s0 = hashMap;
                }
                hashMap.put(lc.a, Integer.valueOf(Math.round(y37Var.d(0))));
                hashMap.put(lc.b, Integer.valueOf(Math.round(y37Var.d(y37Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            dx4 y = x24Var.y(nb3.t(i, i, i2, i2));
            HashMap hashMap2 = this.s0;
            hashMap2.getClass();
            return g34Var.K(i, i2, hashMap2, new jv(y, 10));
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    @Override // defpackage.mo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(um3 um3Var) {
        bs4 R0;
        long j;
        if (this.j0) {
            q47 q47Var = this.w0;
            if (q47Var != null) {
                if (!q47Var.c) {
                    q47Var = null;
                }
                if (q47Var != null) {
                    R0 = q47Var.d;
                }
            }
            R0 = R0();
            cj cjVar = R0.j;
            if (cjVar != null) {
                xj0 G = um3Var.A.B.G();
                boolean z = R0.k;
                if (z) {
                    long j2 = R0.l;
                    G.h();
                    G.n(RecyclerView.B1, RecyclerView.B1, (int) (j2 >> 32), (int) (j2 & 4294967295L), 1);
                }
                try {
                    T0(2);
                    s47 s47Var = this.u0;
                    if (s47Var == null) {
                        s47Var = this.l0;
                    }
                    nn6 nn6Var = s47Var.a;
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
                        cjVar.g(G, c, s47Var.a.a.a(), ge6Var2, b17Var2, oo1Var2);
                    } else {
                        lt0 lt0Var = this.r0;
                        if (lt0Var != null) {
                            j = lt0Var.a();
                        } else {
                            j = kt0.h;
                        }
                        if (j == 16) {
                            if (s47Var.b() != 16) {
                                j = s47Var.b();
                            } else {
                                j = kt0.b;
                            }
                        }
                        cjVar.f(G, j, ge6Var2, b17Var2, oo1Var2);
                    }
                    if (z) {
                        G.p();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        G.p();
                    }
                    throw th;
                }
            }
            s53.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.t0 + ", textSubstitution=" + this.w0 + ')');
            e41.c();
        }
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        return ii2.q(S0(kz3Var).e(kz3Var.getLayoutDirection()).b());
    }
}
