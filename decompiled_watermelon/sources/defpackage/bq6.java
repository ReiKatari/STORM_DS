package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bq6  reason: default package */
/* loaded from: classes.dex */
public final class bq6 {
    public final qh A;
    public boolean B;
    public final k27 a;
    public hm3 d;
    public ki2 g;
    public hp0 h;
    public o31 i;
    public vo4 j;
    public sp2 k;
    public wc2 l;
    public final tj4 m;
    public final tj4 n;
    public long o;
    public vr6 p;
    public long q;
    public final tj4 r;
    public final tj4 s;
    public int t;
    public oq6 u;
    public qh v;
    public vr6 w;
    public final tj4 x;
    public final wv6 y;
    public final zp6 z;
    public pb4 b = m67.a;
    public mi2 c = new gi3(5);
    public final tj4 e = me2.G(new oq6((String) null, 7, 0));
    public uc7 f = iq0.t0;

    public bq6(k27 k27Var) {
        this.a = k27Var;
        Boolean bool = Boolean.TRUE;
        this.m = me2.G(bool);
        this.n = me2.G(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = me2.G(null);
        this.s = me2.G(null);
        this.t = -1;
        this.u = new oq6((String) null, 7, 0L);
        this.x = me2.G(Boolean.FALSE);
        wv6 wv6Var = new wv6(0);
        wv6Var.L = vv6.Uninitialized;
        this.y = wv6Var;
        this.z = new zp6(this);
        this.A = new qh(this);
    }

    public static final ti4 a(bq6 bq6Var) {
        String str;
        vr6 vr6Var;
        to m = bq6Var.m();
        if (m != null && (str = m.B) != null && (vr6Var = bq6Var.w) != null) {
            long j = vr6Var.a;
            return new ti4(str, new vr6(ve2.g(bq6Var.b.r((int) (j >> 32)), bq6Var.b.r((int) (j & 4294967295L)))));
        }
        return null;
    }

    public static final void b(bq6 bq6Var, vr6 vr6Var) {
        to m;
        String str;
        o31 o31Var;
        if (vr6Var != null) {
            long j = vr6Var.a;
            vo4 vo4Var = bq6Var.j;
            if (vo4Var != null && (m = bq6Var.m()) != null && (str = m.B) != null) {
                pb4 pb4Var = bq6Var.b;
                long g = ve2.g(pb4Var.r((int) (j >> 32)), pb4Var.r((int) (j & 4294967295L)));
                if (str.length() > 0 && !vr6.c(g) && (o31Var = bq6Var.i) != null) {
                    tq5.w(o31Var, null, null, new i01(vo4Var, str, g, vr6Var, bq6Var, pb4Var, (j11) null), 3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c3, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c6, code lost:
        if ((r6 ^ r12) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c8, code lost:
        r5 = defpackage.oo2.G(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cd, code lost:
        r5 = defpackage.oo2.F(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d1, code lost:
        if (r6 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d3, code lost:
        r1 = defpackage.ry5.a(r4, defpackage.mj2.o(r1, r3, r5), null, r12, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dd, code lost:
        r1 = defpackage.ry5.a(r4, null, defpackage.mj2.o(r7, r3, r5), r12, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
        if (r1.b == r7.b) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (((defpackage.lr6) r3.e).a.a.B.length() != r5.b) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
        r5 = (defpackage.ry5) r15.L;
        r6 = ((defpackage.lr6) r3.e).a.a.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
        if (r6.length() != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016e, code lost:
        r6 = r15.B;
        r8 = ((defpackage.lr6) r3.e).a.a.B;
        r9 = r3.b;
        r10 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0181, code lost:
        if (r9 != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0183, code lost:
        r5 = defpackage.oo2.F(0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
        if (r6 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018a, code lost:
        r1 = defpackage.ry5.a(r4, defpackage.mj2.o(r1, r3, r5), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0195, code lost:
        r1 = defpackage.ry5.a(r4, null, defpackage.mj2.o(r7, r3, r5), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a2, code lost:
        if (r9 != r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a4, code lost:
        r5 = defpackage.oo2.G(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a8, code lost:
        if (r6 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01aa, code lost:
        r1 = defpackage.ry5.a(r4, defpackage.mj2.o(r1, r3, r5), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b4, code lost:
        r1 = defpackage.ry5.a(r4, null, defpackage.mj2.o(r7, r3, r5), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
        if (r5.c != true) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(defpackage.bq6 r21, defpackage.oq6 r22, long r23, boolean r25, boolean r26, defpackage.c44 r27, boolean r28, defpackage.tp2 r29) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq6.c(bq6, oq6, long, boolean, boolean, c44, boolean, tp2):long");
    }

    public static oq6 e(to toVar, long j) {
        return new oq6(toVar, j, (vr6) null);
    }

    public final kd6 d(boolean z) {
        o31 o31Var = this.i;
        if (o31Var == null) {
            return null;
        }
        return tq5.w(o31Var, null, s31.UNDISPATCHED, new gl6(this, z, (j11) null), 1);
    }

    public final void f() {
        o31 o31Var = this.i;
        if (o31Var != null) {
            tq5.w(o31Var, null, s31.UNDISPATCHED, new vp6(this, null, 1), 1);
        }
    }

    public final void g(mb4 mb4Var) {
        gp2 gp2Var;
        mr6 mr6Var;
        int e;
        if (!vr6.c(n().b)) {
            hm3 hm3Var = this.d;
            if (hm3Var != null) {
                mr6Var = hm3Var.d();
            } else {
                mr6Var = null;
            }
            if (mb4Var != null && mr6Var != null) {
                e = this.b.n(mr6Var.b(mb4Var.a, true));
            } else {
                e = vr6.e(n().b);
            }
            oq6 a = oq6.a(n(), null, ve2.g(e, e), 5);
            this.c.n(a);
            this.w = new vr6(a.b);
        }
        if (mb4Var != null && n().a.B.length() > 0) {
            gp2Var = gp2.Cursor;
        } else {
            gp2Var = gp2.None;
        }
        q(gp2Var);
        t(false);
    }

    public final void h(boolean z) {
        wc2 wc2Var;
        hm3 hm3Var = this.d;
        if (hm3Var != null && !hm3Var.b() && (wc2Var = this.l) != null) {
            wc2.a(wc2Var);
        }
        this.u = n();
        t(z);
        q(gp2.Selection);
    }

    public final mb4 i() {
        return (mb4) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        mr6 d;
        long j;
        int d2;
        int max;
        boolean z2;
        int q;
        float i;
        hm3 hm3Var = this.d;
        if (hm3Var != null && (d = hm3Var.d()) != null) {
            lr6 lr6Var = d.a;
            q04 q04Var = lr6Var.b;
            to m = m();
            if (m != null) {
                if (b53.x(m.B, lr6Var.a.a.B)) {
                    oq6 n = n();
                    if (z) {
                        long j2 = n.b;
                        int i2 = vr6.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = n.b;
                        int i3 = vr6.c;
                        j = j3 & 4294967295L;
                    }
                    int r = this.b.r((int) j);
                    boolean g = vr6.g(n().b);
                    long j4 = lr6Var.c;
                    if (q04Var.d(r) < q04Var.f) {
                        if ((z && !g) || (!z && g)) {
                            max = r;
                        } else {
                            max = Math.max(r - 1, 0);
                        }
                        if (lr6Var.a(max) == lr6Var.h(r)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        q04Var.l(r);
                        int length = ((to) q04Var.a.a).B.length();
                        ArrayList arrayList = q04Var.h;
                        if (r == length) {
                            q = l07.P(arrayList);
                        } else {
                            q = yf2.q(r, arrayList);
                        }
                        wi4 wi4Var = (wi4) arrayList.get(q);
                        qi qiVar = wi4Var.a;
                        int d3 = wi4Var.d(r);
                        jr6 jr6Var = qiVar.d;
                        if (z2) {
                            i = jr6Var.h(d3, false);
                        } else {
                            i = jr6Var.i(d3, false);
                        }
                        float l = io2.l(i, RecyclerView.A1, (int) (j4 >> 32));
                        return (Float.floatToRawIntBits(io2.l(q04Var.b(d2), RecyclerView.A1, (int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(l) << 32);
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final to m() {
        hm3 hm3Var = this.d;
        if (hm3Var != null) {
            return hm3Var.a.a;
        }
        return null;
    }

    public final oq6 n() {
        return (oq6) this.e.getValue();
    }

    public final void o() {
        kd6 kd6Var;
        po6 po6Var = (po6) this.y.B;
        if (po6Var != null && (kd6Var = po6Var.p0) != null) {
            kd6Var.i(null);
            po6Var.p0 = null;
        }
    }

    public final void p() {
        o31 o31Var = this.i;
        if (o31Var != null) {
            tq5.w(o31Var, null, s31.UNDISPATCHED, new vp6(this, null, 2), 1);
        }
    }

    public final void q(gp2 gp2Var) {
        hm3 hm3Var = this.d;
        if (hm3Var != null) {
            if (hm3Var.a() == gp2Var) {
                hm3Var = null;
            }
            if (hm3Var != null) {
                hm3Var.k.setValue(gp2Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r7 = this;
            ga6 r0 = defpackage.io2.z()
            r1 = 0
            if (r0 == 0) goto Lc
            mi2 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            ga6 r3 = defpackage.io2.Y(r0)
            boolean r4 = r7.k()     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L74
            hm3 r4 = r7.d     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L2a
            tj4 r4 = r4.q     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L72
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L2a
            goto L74
        L2a:
            defpackage.io2.l0(r0, r3, r2)
            wv6 r7 = r7.y
            java.lang.Object r0 = r7.L
            vv6 r0 = (defpackage.vv6) r0
            vv6 r2 = defpackage.vv6.Uninitialized
            if (r0 == r2) goto L38
            goto L3d
        L38:
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.pz2.c(r0)
        L3d:
            java.lang.Object r7 = r7.B
            po6 r7 = (defpackage.po6) r7
            if (r7 == 0) goto L71
            boolean r0 = r7.i0
            if (r0 == 0) goto L71
            kd6 r0 = r7.p0
            r2 = 1
            if (r0 == 0) goto L53
            boolean r0 = r0.d()
            if (r0 != r2) goto L53
            goto L71
        L53:
            tv0 r0 = defpackage.ko6.b
            java.lang.Object r0 = defpackage.mh7.t(r7, r0)
            jo6 r0 = (defpackage.jo6) r0
            if (r0 != 0) goto L5e
            goto L71
        L5e:
            o31 r3 = r7.F0()
            s31 r4 = defpackage.s31.UNDISPATCHED
            zw5 r5 = new zw5
            r6 = 9
            r5.<init>(r7, r0, r1, r6)
            kd6 r0 = defpackage.tq5.w(r3, r1, r4, r5, r2)
            r7.p0 = r0
        L71:
            return
        L72:
            r7 = move-exception
            goto L78
        L74:
            defpackage.io2.l0(r0, r3, r2)
            return
        L78:
            defpackage.io2.l0(r0, r3, r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq6.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.k11 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aq6
            if (r0 == 0) goto L13
            r0 = r5
            aq6 r0 = (defpackage.aq6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            aq6 r0 = new aq6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            bq6 r4 = r0.R
            defpackage.me2.a0(r5)
            goto L5b
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r5)
            hp0 r5 = r4.h
            if (r5 == 0) goto L65
            r0.R = r4
            r0.Z = r3
            nd r5 = (defpackage.nd) r5
            od r5 = r5.a
            android.content.ClipboardManager r5 = r5.a()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L53
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L53
            goto L54
        L53:
            r3 = r0
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            tj4 r4 = r4.x
            r4.setValue(r5)
        L65:
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq6.s(k11):java.lang.Object");
    }

    public final void t(boolean z) {
        hm3 hm3Var = this.d;
        if (hm3Var != null) {
            hm3Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
