package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zp6  reason: default package */
/* loaded from: classes.dex */
public final class zp6 implements vo6 {
    public vr6 b;
    public final /* synthetic */ bq6 d;
    public boolean a = true;
    public c44 c = k45.j0;

    public zp6(bq6 bq6Var) {
        this.d = bq6Var;
    }

    @Override // defpackage.vo6
    public final void a() {
        f();
    }

    @Override // defpackage.vo6
    public final void b(long j, c44 c44Var) {
        long j2;
        mr6 d;
        mr6 d2;
        bq6 bq6Var = this.d;
        tj4 tj4Var = bq6Var.r;
        if (bq6Var.k() && ((dp2) tj4Var.getValue()) == null) {
            tj4Var.setValue(dp2.SelectionEnd);
            bq6Var.t = -1;
            this.a = true;
            this.c = c44Var;
            bq6Var.o();
            hm3 hm3Var = bq6Var.d;
            if (hm3Var != null && (d2 = hm3Var.d()) != null && d2.c(j)) {
                if (bq6Var.n().a.B.length() != 0) {
                    bq6Var.h(false);
                    long c = bq6.c(bq6Var, oq6.a(bq6Var.n(), null, vr6.b, 5), j, true, false, this.c, true, new tp2(0));
                    j2 = j;
                    bq6Var.p = new vr6(c);
                    this.b = new vr6(c);
                } else {
                    return;
                }
            } else {
                j2 = j;
                hm3 hm3Var2 = bq6Var.d;
                if (hm3Var2 != null && (d = hm3Var2.d()) != null) {
                    int n = bq6Var.b.n(d.b(j2, true));
                    oq6 e = bq6.e(bq6Var.n().a, ve2.g(n, n));
                    bq6Var.h(false);
                    sp2 sp2Var = bq6Var.k;
                    if (sp2Var != null) {
                        ((ho4) sp2Var).a(0);
                    }
                    bq6Var.c.n(e);
                    bq6Var.w = new vr6(e.b);
                }
                this.a = false;
            }
            bq6Var.q(gp2.None);
            bq6Var.o = j2;
            bq6Var.s.setValue(new mb4(j2));
            bq6Var.q = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    @Override // defpackage.vo6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            r9 = this;
            bq6 r0 = r9.d
            boolean r1 = r0.k()
            if (r1 == 0) goto Leb
            oq6 r1 = r0.n()
            to r1 = r1.a
            java.lang.String r1 = r1.B
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Leb
        L18:
            long r1 = r0.q
            long r10 = defpackage.mb4.e(r1, r10)
            r0.q = r10
            hm3 r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le8
            mr6 r10 = r10.d()
            if (r10 == 0) goto Le8
            long r1 = r0.o
            long r3 = r0.q
            long r1 = defpackage.mb4.e(r1, r3)
            mb4 r3 = new mb4
            r3.<init>(r1)
            tj4 r1 = r0.s
            r1.setValue(r3)
            vr6 r1 = r0.p
            r2 = 9
            if (r1 != 0) goto L96
            mb4 r1 = r0.i()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L96
            pb4 r1 = r0.b
            long r3 = r0.o
            r5 = 1
            int r3 = r10.b(r3, r5)
            int r1 = r1.n(r3)
            pb4 r3 = r0.b
            mb4 r4 = r0.i()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.b(r6, r5)
            int r10 = r3.n(r10)
            if (r1 != r10) goto L78
            c44 r10 = defpackage.k45.j0
        L76:
            r6 = r10
            goto L7b
        L78:
            c44 r10 = defpackage.k45.k0
            goto L76
        L7b:
            oq6 r1 = r0.n()
            mb4 r10 = r0.i()
            r10.getClass()
            long r3 = r10.a
            tp2 r8 = new tp2
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = defpackage.bq6.c(r0, r1, r2, r4, r5, r6, r7, r8)
            goto Ld7
        L96:
            vr6 r1 = r0.p
            if (r1 == 0) goto La1
            long r3 = r1.a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La7
        La1:
            long r3 = r0.o
            int r1 = r10.b(r3, r11)
        La7:
            mb4 r3 = r0.i()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.b(r3, r11)
            vr6 r3 = r0.p
            if (r3 != 0) goto Lbb
            if (r1 != r10) goto Lbb
            goto Leb
        Lbb:
            oq6 r1 = r0.n()
            mb4 r10 = r0.i()
            r10.getClass()
            long r3 = r10.a
            c44 r6 = r9.c
            tp2 r8 = new tp2
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = defpackage.bq6.c(r0, r1, r2, r4, r5, r6, r7, r8)
        Ld7:
            vr6 r10 = new vr6
            r10.<init>(r1)
            r9.b = r10
            vr6 r10 = r0.p
            boolean r10 = defpackage.vr6.a(r1, r10)
            if (r10 != 0) goto Le8
            r9.a = r11
        Le8:
            r0.t(r11)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp6.e(long):void");
    }

    public final void f() {
        long j;
        gp2 gp2Var;
        boolean z;
        boolean z2;
        bq6 bq6Var = this.d;
        bq6Var.r.setValue(null);
        bq6Var.s.setValue(null);
        this.c = k45.j0;
        boolean z3 = true;
        bq6Var.t(true);
        vr6 vr6Var = this.b;
        if (vr6Var != null) {
            j = vr6Var.a;
        } else {
            j = bq6Var.n().b;
        }
        boolean c = vr6.c(j);
        if (c) {
            gp2Var = gp2.Cursor;
        } else {
            gp2Var = gp2.Selection;
        }
        bq6Var.q(gp2Var);
        hm3 hm3Var = bq6Var.d;
        if (hm3Var != null) {
            if (!c && sn2.F(bq6Var, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            hm3Var.m.setValue(Boolean.valueOf(z2));
        }
        hm3 hm3Var2 = bq6Var.d;
        if (hm3Var2 != null) {
            if (!c && sn2.F(bq6Var, false)) {
                z = true;
            } else {
                z = false;
            }
            hm3Var2.n.setValue(Boolean.valueOf(z));
        }
        hm3 hm3Var3 = bq6Var.d;
        if (hm3Var3 != null) {
            if (!c || !sn2.F(bq6Var, true)) {
                z3 = false;
            }
            hm3Var3.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            bq6.b(bq6Var, bq6Var.p);
        }
        bq6Var.p = null;
    }

    @Override // defpackage.vo6
    public final void onCancel() {
        f();
    }

    @Override // defpackage.vo6
    public final void c() {
    }

    @Override // defpackage.vo6
    public final void d() {
    }
}
