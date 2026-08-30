package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv  reason: default package */
/* loaded from: classes.dex */
public final class tv extends qi4 implements l95 {
    public static final k4 o0 = new k4(13);
    public g11 X;
    public final ee6 Y = fe6.a(new i76(0));
    public final tj4 Z = me2.G(null);
    public final pj4 c0 = new pj4(1.0f);
    public final tj4 d0 = me2.G(null);
    public pv e0;
    public qi4 f0;
    public mi2 g0;
    public mi2 h0;
    public s01 i0;
    public int j0;
    public boolean k0;
    public final tj4 l0;
    public final tj4 m0;
    public final tj4 n0;

    public tv(vw2 vw2Var, c55 c55Var) {
        lv lvVar = lv.a;
        this.e0 = lvVar;
        this.g0 = o0;
        this.i0 = r01.b;
        this.j0 = 1;
        this.l0 = me2.G(lvVar);
        this.m0 = me2.G(vw2Var);
        this.n0 = me2.G(c55Var);
    }

    @Override // defpackage.l95
    public final void a() {
        l95 l95Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.X == null) {
                mi6 c = hi2.c();
                bb1 bb1Var = tg1.a;
                g11 c2 = iq2.c(se.O(c, bt3.a.Y));
                this.X = c2;
                qi4 qi4Var = this.f0;
                qi4 qi4Var2 = null;
                if (qi4Var instanceof l95) {
                    l95Var = (l95) qi4Var;
                } else {
                    l95Var = null;
                }
                if (l95Var != null) {
                    l95Var.a();
                }
                if (this.k0) {
                    tw2 a = vw2.a((vw2) this.m0.getValue());
                    a.b = ((c55) this.n0.getValue()).b;
                    a.u = null;
                    Drawable drawable = a.a().B.j;
                    ab1 ab1Var = h.a;
                    if (drawable != null) {
                        qi4Var2 = j(drawable);
                    }
                    k(new nv(qi4Var2));
                } else {
                    tq5.w(c2, null, null, new a6(this, null, 3), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.l95
    public final void b() {
        g11 g11Var = this.X;
        l95 l95Var = null;
        if (g11Var != null) {
            iq2.f(g11Var, null);
        }
        this.X = null;
        qi4 qi4Var = this.f0;
        if (qi4Var instanceof l95) {
            l95Var = (l95) qi4Var;
        }
        if (l95Var != null) {
            l95Var.b();
        }
    }

    @Override // defpackage.l95
    public final void c() {
        g11 g11Var = this.X;
        l95 l95Var = null;
        if (g11Var != null) {
            iq2.f(g11Var, null);
        }
        this.X = null;
        qi4 qi4Var = this.f0;
        if (qi4Var instanceof l95) {
            l95Var = (l95) qi4Var;
        }
        if (l95Var != null) {
            l95Var.c();
        }
    }

    @Override // defpackage.qi4
    public final void d(float f) {
        this.c0.i(f);
    }

    @Override // defpackage.qi4
    public final void e(b30 b30Var) {
        this.d0.setValue(b30Var);
    }

    @Override // defpackage.qi4
    public final long h() {
        qi4 qi4Var = (qi4) this.Z.getValue();
        if (qi4Var != null) {
            return qi4Var.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.qi4
    public final void i(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        i76 i76Var = new i76(rh0Var.d());
        ee6 ee6Var = this.Y;
        ee6Var.getClass();
        ee6Var.l(null, i76Var);
        qi4 qi4Var = (qi4) this.Z.getValue();
        if (qi4Var != null) {
            qi4Var.g(xf3Var, rh0Var.d(), this.c0.h(), (b30) this.d0.getValue());
        }
    }

    public final qi4 j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return w81.b(new nh(((BitmapDrawable) drawable).getBitmap()), this.j0);
        }
        return new ok1(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.pv r13) {
        /*
            r12 = this;
            pv r0 = r12.e0
            mi2 r1 = r12.g0
            java.lang.Object r13 = r1.n(r13)
            pv r13 = (defpackage.pv) r13
            r12.e0 = r13
            tj4 r1 = r12.l0
            r1.setValue(r13)
            boolean r1 = r13 instanceof defpackage.ov
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            ov r1 = (defpackage.ov) r1
            hi6 r1 = r1.b
            goto L25
        L1c:
            boolean r1 = r13 instanceof defpackage.mv
            if (r1 == 0) goto L60
            r1 = r13
            mv r1 = (defpackage.mv) r1
            m12 r1 = r1.b
        L25:
            vw2 r3 = r1.b()
            bx6 r3 = r3.i
            uv r4 = defpackage.mh7.a
            jx6 r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof defpackage.j41
            if (r4 == 0) goto L60
            qi4 r4 = r0.a()
            boolean r5 = r0 instanceof defpackage.nv
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            qi4 r8 = r13.a()
            s01 r9 = r12.i0
            j41 r3 = (defpackage.j41) r3
            int r10 = r3.c
            boolean r3 = r1 instanceof defpackage.hi6
            if (r3 == 0) goto L58
            hi6 r1 = (defpackage.hi6) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            h41 r6 = new h41
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            qi4 r6 = r13.a()
        L68:
            r12.f0 = r6
            tj4 r1 = r12.Z
            r1.setValue(r6)
            g11 r1 = r12.X
            if (r1 == 0) goto L9e
            qi4 r1 = r0.a()
            qi4 r3 = r13.a()
            if (r1 == r3) goto L9e
            qi4 r0 = r0.a()
            boolean r1 = r0 instanceof defpackage.l95
            if (r1 == 0) goto L88
            l95 r0 = (defpackage.l95) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.c()
        L8e:
            qi4 r0 = r13.a()
            boolean r1 = r0 instanceof defpackage.l95
            if (r1 == 0) goto L99
            r2 = r0
            l95 r2 = (defpackage.l95) r2
        L99:
            if (r2 == 0) goto L9e
            r2.a()
        L9e:
            mi2 r12 = r12.h0
            if (r12 == 0) goto La5
            r12.n(r13)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv.k(pv):void");
    }
}
