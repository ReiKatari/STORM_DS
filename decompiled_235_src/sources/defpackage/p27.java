package defpackage;

import android.content.ClipDescription;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p27  reason: default package */
/* loaded from: classes.dex */
public final class p27 {
    public final ci A;
    public boolean B;
    public final fg7 a;
    public jt3 d;
    public on2 g;
    public tr0 h;
    public w61 i;
    public zx4 j;
    public tv2 k;
    public nh2 l;
    public final vs4 m;
    public final vs4 n;
    public long o;
    public k47 p;
    public long q;
    public final vs4 r;
    public final vs4 s;
    public int t;
    public c37 u;
    public ci v;
    public k47 w;
    public final vs4 x;
    public final rr6 y;
    public final n27 z;
    public mk4 b = jk7.a;
    public qn2 c = new v83(17);
    public final vs4 e = np2.Y(new c37((String) null, 7, 0));
    public wq7 f = xd5.v0;

    public p27(fg7 fg7Var) {
        this.a = fg7Var;
        Boolean bool = Boolean.TRUE;
        this.m = np2.Y(bool);
        this.n = np2.Y(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = np2.Y(null);
        this.s = np2.Y(null);
        this.t = -1;
        this.u = new c37((String) null, 7, 0L);
        this.x = np2.Y(Boolean.FALSE);
        rr6 rr6Var = new rr6(6);
        rr6Var.L = j87.Uninitialized;
        this.y = rr6Var;
        this.z = new n27(this);
        this.A = new ci(this);
    }

    public static final vr4 a(p27 p27Var) {
        String str;
        k47 k47Var;
        fp m = p27Var.m();
        if (m != null && (str = m.B) != null && (k47Var = p27Var.w) != null) {
            long j = k47Var.a;
            return new vr4(str, new k47(jx2.f(p27Var.b.s((int) (j >> 32)), p27Var.b.s((int) (j & 4294967295L)))));
        }
        return null;
    }

    public static final void b(p27 p27Var, k47 k47Var) {
        fp m;
        String str;
        w61 w61Var;
        if (k47Var != null) {
            long j = k47Var.a;
            zx4 zx4Var = p27Var.j;
            if (zx4Var != null && (m = p27Var.m()) != null && (str = m.B) != null) {
                mk4 mk4Var = p27Var.b;
                long f = jx2.f(mk4Var.s((int) (j >> 32)), mk4Var.s((int) (j & 4294967295L)));
                if (str.length() > 0 && !k47.c(f) && (w61Var = p27Var.i) != null) {
                    hv.L(w61Var, null, null, new n31(zx4Var, str, f, k47Var, p27Var, mk4Var, (r41) null), 3);
                }
            }
        }
    }

    public static final long c(p27 p27Var, c37 c37Var, long j, boolean z, boolean z2, ga6 ga6Var, boolean z3, uv2 uv2Var) {
        b47 d;
        int i;
        long j2;
        int i2;
        long j3;
        long j4;
        fp fpVar;
        ea6 ea6Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        tv2 tv2Var;
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null && (d = jt3Var.d()) != null) {
            mk4 mk4Var = p27Var.b;
            long j5 = c37Var.b;
            fp fpVar2 = c37Var.a;
            int i3 = k47.c;
            long f = jx2.f(mk4Var.s((int) (j5 >> 32)), p27Var.b.s((int) (j5 & 4294967295L)));
            int b = d.b(j, false);
            if (!z2 && !z) {
                i = (int) (f >> 32);
            } else {
                i = b;
            }
            if (!z2 || z) {
                j2 = 4294967295L;
                i2 = b;
            } else {
                j2 = 4294967295L;
                i2 = (int) (f & 4294967295L);
            }
            ci ciVar = p27Var.v;
            int i4 = -1;
            if (!z && ciVar != null) {
                j3 = j2;
                int i5 = p27Var.t;
                if (i5 != -1) {
                    i4 = i5;
                }
            } else {
                j3 = j2;
            }
            a47 a47Var = d.a;
            if (z) {
                ea6Var = null;
                fpVar = fpVar2;
                j4 = j5;
            } else {
                j4 = j5;
                int i6 = (int) (f >> 32);
                fpVar = fpVar2;
                int i7 = (int) (f & j3);
                ea6Var = new ea6(new da6(nj2.u(a47Var, i6), i6, 1L), new da6(nj2.u(a47Var, i7), i7, 1L), k47.g(f));
            }
            ci ciVar2 = new ci(z2, ea6Var, new ls0(i, i2, i4, a47Var));
            if (ea6Var != null && ciVar != null && z2 == ciVar.B) {
                ls0 ls0Var = (ls0) ciVar.R;
                if (i == ls0Var.b && i2 == ls0Var.c) {
                    return j4;
                }
            }
            p27Var.v = ciVar2;
            p27Var.t = b;
            ea6 b2 = ga6Var.b(ciVar2);
            long f2 = jx2.f(p27Var.b.i(b2.a.b), p27Var.b.i(b2.b.b));
            long j6 = j4;
            if (k47.b(f2, j6)) {
                return j6;
            }
            if (k47.g(f2) != k47.g(j6) && k47.b(jx2.f((int) (f2 & j3), (int) (f2 >> 32)), j6)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (k47.c(f2) && k47.c(j6)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z3 && fpVar.B.length() > 0 && !z4 && !z5 && uv2Var != null && (tv2Var = p27Var.k) != null) {
                ((lx4) tv2Var).a(uv2Var.a);
            }
            p27Var.c.g(e(fpVar, f2));
            p27Var.w = new k47(f2);
            if (!z3) {
                p27Var.t(!k47.c(f2));
            }
            jt3 jt3Var2 = p27Var.d;
            if (jt3Var2 != null) {
                jt3Var2.q.setValue(Boolean.valueOf(z3));
            }
            jt3 jt3Var3 = p27Var.d;
            if (jt3Var3 != null) {
                if (!k47.c(f2) && kn2.O(p27Var, true)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                jt3Var3.m.setValue(Boolean.valueOf(z9));
            }
            jt3 jt3Var4 = p27Var.d;
            if (jt3Var4 != null) {
                if (!k47.c(f2)) {
                    z6 = false;
                    if (kn2.O(p27Var, false)) {
                        z8 = true;
                        jt3Var4.n.setValue(Boolean.valueOf(z8));
                    }
                } else {
                    z6 = false;
                }
                z8 = z6;
                jt3Var4.n.setValue(Boolean.valueOf(z8));
            } else {
                z6 = false;
            }
            jt3 jt3Var5 = p27Var.d;
            if (jt3Var5 != null) {
                if (k47.c(f2) && kn2.O(p27Var, true)) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                jt3Var5.o.setValue(Boolean.valueOf(z7));
            }
            return f2;
        }
        return k47.b;
    }

    public static c37 e(fp fpVar, long j) {
        return new c37(fpVar, j, (k47) null);
    }

    public final ap6 d(boolean z) {
        w61 w61Var = this.i;
        if (w61Var == null) {
            return null;
        }
        return hv.L(w61Var, null, a71.UNDISPATCHED, new ax6(this, z, (r41) null), 1);
    }

    public final void f() {
        w61 w61Var = this.i;
        if (w61Var != null) {
            hv.L(w61Var, null, a71.UNDISPATCHED, new j27(this, null, 1), 1);
        }
    }

    public final void g(jk4 jk4Var) {
        hv2 hv2Var;
        b47 b47Var;
        int e;
        if (!k47.c(n().b)) {
            jt3 jt3Var = this.d;
            if (jt3Var != null) {
                b47Var = jt3Var.d();
            } else {
                b47Var = null;
            }
            if (jk4Var != null && b47Var != null) {
                e = this.b.i(b47Var.b(jk4Var.a, true));
            } else {
                e = k47.e(n().b);
            }
            c37 a = c37.a(n(), null, jx2.f(e, e), 5);
            this.c.g(a);
            this.w = new k47(a.b);
        }
        if (jk4Var != null && n().a.B.length() > 0) {
            hv2Var = hv2.Cursor;
        } else {
            hv2Var = hv2.None;
        }
        q(hv2Var);
        t(false);
    }

    public final void h(boolean z) {
        nh2 nh2Var;
        jt3 jt3Var = this.d;
        if (jt3Var != null && !jt3Var.b() && (nh2Var = this.l) != null) {
            nh2.a(nh2Var);
        }
        this.u = n();
        t(z);
        q(hv2.Selection);
    }

    public final jk4 i() {
        return (jk4) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        b47 d;
        long j;
        int d2;
        int max;
        boolean z2;
        int z3;
        float i;
        jt3 jt3Var = this.d;
        if (jt3Var != null && (d = jt3Var.d()) != null) {
            a47 a47Var = d.a;
            v84 v84Var = a47Var.b;
            fp m = m();
            if (m != null) {
                if (nb3.k(m.B, a47Var.a.a.B)) {
                    c37 n = n();
                    if (z) {
                        long j2 = n.b;
                        int i2 = k47.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = n.b;
                        int i3 = k47.c;
                        j = j3 & 4294967295L;
                    }
                    int s = this.b.s((int) j);
                    boolean g = k47.g(n().b);
                    long j4 = a47Var.c;
                    if (v84Var.d(s) < v84Var.f) {
                        if ((z && !g) || (!z && g)) {
                            max = s;
                        } else {
                            max = Math.max(s - 1, 0);
                        }
                        if (a47Var.a(max) == a47Var.h(s)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        v84Var.l(s);
                        int length = ((fp) v84Var.a.a).B.length();
                        ArrayList arrayList = v84Var.h;
                        if (s == length) {
                            z3 = hf.U(arrayList);
                        } else {
                            z3 = uj2.z(s, arrayList);
                        }
                        yr4 yr4Var = (yr4) arrayList.get(z3);
                        cj cjVar = yr4Var.a;
                        int d3 = yr4Var.d(s);
                        y37 y37Var = cjVar.d;
                        if (z2) {
                            i = y37Var.h(d3, false);
                        } else {
                            i = y37Var.i(d3, false);
                        }
                        float p = gi2.p(i, RecyclerView.B1, (int) (j4 >> 32));
                        return (Float.floatToRawIntBits(gi2.p(v84Var.b(d2), RecyclerView.B1, (int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(p) << 32);
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final fp m() {
        jt3 jt3Var = this.d;
        if (jt3Var != null) {
            return jt3Var.a.a;
        }
        return null;
    }

    public final c37 n() {
        return (c37) this.e.getValue();
    }

    public final void o() {
        ap6 ap6Var;
        a17 a17Var = (a17) this.y.B;
        if (a17Var != null && (ap6Var = a17Var.q0) != null) {
            ap6Var.h(null);
            a17Var.q0 = null;
        }
    }

    public final void p() {
        w61 w61Var = this.i;
        if (w61Var != null) {
            hv.L(w61Var, null, a71.UNDISPATCHED, new j27(this, null, 2), 1);
        }
    }

    public final void q(hv2 hv2Var) {
        jt3 jt3Var = this.d;
        if (jt3Var != null) {
            if (jt3Var.a() == hv2Var) {
                jt3Var = null;
            }
            if (jt3Var != null) {
                jt3Var.k.setValue(hv2Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        qn2 qn2Var;
        u07 u07Var;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            if (k()) {
                jt3 jt3Var = this.d;
                if (jt3Var != null) {
                }
                ln2.V(t, N, qn2Var);
                rr6 rr6Var = this.y;
                if (((j87) rr6Var.L) == j87.Uninitialized) {
                    s53.c("ToolbarRequester is not initialized.");
                }
                a17 a17Var = (a17) rr6Var.B;
                if (a17Var != null && a17Var.j0) {
                    ap6 ap6Var = a17Var.q0;
                    if ((ap6Var == null || !ap6Var.e()) && (u07Var = (u07) hf.K(a17Var, v07.b)) != null) {
                        a17Var.q0 = hv.L(a17Var.F0(), null, a71.UNDISPATCHED, new vy5(a17Var, u07Var, (r41) null, 13), 1);
                    }
                }
            }
        } finally {
            ln2.V(t, N, qn2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(s41 s41Var) {
        o27 o27Var;
        int i;
        if (s41Var instanceof o27) {
            o27Var = (o27) s41Var;
            int i2 = o27Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o27Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = o27Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = o27Var.Z;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        this = o27Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tr0 tr0Var = this.h;
                    if (tr0Var != null) {
                        o27Var.R = this;
                        o27Var.Z = 1;
                        ClipDescription primaryClipDescription = ((ce) tr0Var).a.a().getPrimaryClipDescription();
                        if (primaryClipDescription == null || !primaryClipDescription.hasMimeType("text/*")) {
                            z = false;
                        }
                        obj = Boolean.valueOf(z);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return jg7.a;
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.x.setValue(bool);
                return jg7.a;
            }
        }
        o27Var = new o27(this, s41Var);
        Object obj3 = o27Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = o27Var.Z;
        boolean z2 = true;
        if (i == 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        this.x.setValue(bool2);
        return jg7.a;
    }

    public final void t(boolean z) {
        jt3 jt3Var = this.d;
        if (jt3Var != null) {
            jt3Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
