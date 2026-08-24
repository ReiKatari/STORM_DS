package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg7  reason: default package */
/* loaded from: classes.dex */
public final class cg7 implements defpackage.nt {
    public final java.lang.Object A;
    public final java.util.ArrayList B;
    public java.lang.Object L;

    public cg7(defpackage.sm3 r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.B = r0
            r1.L = r2
            return
    }

    public final void a() {
            r1 = this;
            java.util.ArrayList r0 = r1.B
            r0.clear()
            java.lang.Object r0 = r1.A
            r1.L = r0
            java.lang.Object r1 = r1.A
            sm3 r1 = (defpackage.sm3) r1
            r1.P()
            return
    }

    @Override // defpackage.nt
    public final void c(int r1, java.lang.Object r2) {
            r0 = this;
            sm3 r2 = (defpackage.sm3) r2
            java.lang.Object r0 = r0.L
            sm3 r0 = (defpackage.sm3) r0
            r0.B(r1, r2)
            return
    }

    @Override // defpackage.nt
    public final void d(java.lang.Object r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.B
            java.lang.Object r1 = r2.L
            r0.add(r1)
            r2.L = r3
            return
    }

    @Override // defpackage.nt
    public final void e() {
            r7 = this;
            java.lang.Object r7 = r7.L
            sm3 r7 = (defpackage.sm3) r7
            if0 r0 = r7.B0
            boolean r1 = r7.H()
            if (r1 != 0) goto L11
            java.lang.String r1 = "onReuse is only expected on attached node"
            defpackage.p53.a(r1)
        L11:
            gn3 r1 = r7.D0
            r2 = 0
            if (r1 == 0) goto L19
            r1.i(r2)
        L19:
            r7.p0 = r2
            boolean r1 = r7.K0
            if (r1 == 0) goto L22
            r7.K0 = r2
            goto L4e
        L22:
            if0 r1 = r7.B0
            java.lang.Object r1 = r1.f
            vy6 r1 = (defpackage.vy6) r1
            r3 = r1
        L29:
            if (r3 == 0) goto L35
            boolean r4 = r3.j0
            if (r4 == 0) goto L32
            r3.M0()
        L32:
            z64 r3 = r3.X
            goto L29
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L42
            boolean r4 = r3.j0
            if (r4 == 0) goto L3f
            r3.O0()
        L3f:
            z64 r3 = r3.X
            goto L36
        L42:
            if (r1 == 0) goto L4e
            boolean r3 = r1.j0
            if (r3 == 0) goto L4b
            r1.I0()
        L4b:
            z64 r1 = r1.X
            goto L42
        L4e:
            int r1 = r7.B
            zp4 r3 = r7.k0
            if (r3 == 0) goto L5f
            te r3 = (defpackage.te) r3
            rf5 r3 = r3.getRectManager()
            if (r3 == 0) goto L5f
            r3.g(r7)
        L5f:
            java.util.concurrent.atomic.AtomicInteger r3 = defpackage.ua6.a
            r4 = 1
            int r3 = r3.addAndGet(r4)
            r7.B = r3
            zp4 r3 = r7.k0
            if (r3 == 0) goto L7e
            te r3 = (defpackage.te) r3
            p94 r5 = r3.m17getLayoutNodes()
            r5.g(r1)
            p94 r3 = r3.m17getLayoutNodes()
            int r5 = r7.B
            r3.i(r5, r7)
        L7e:
            java.lang.Object r3 = r0.g
            z64 r3 = (defpackage.z64) r3
        L82:
            if (r3 == 0) goto L8a
            r3.H0()
            z64 r3 = r3.Y
            goto L82
        L8a:
            r0.i()
            r3 = 8
            boolean r0 = r0.g(r3)
            if (r0 == 0) goto L98
            r7.F()
        L98:
            defpackage.sm3.W(r7)
            zp4 r0 = r7.k0
            if (r0 == 0) goto Ld4
            te r0 = (defpackage.te) r0
            boolean r3 = defpackage.te.d()
            if (r3 == 0) goto Ld4
            nd r0 = r0.L0
            if (r0 == 0) goto Ld4
            te r3 = r0.L
            s63 r5 = r0.A
            q94 r0 = r0.d0
            boolean r6 = r0.f(r1)
            if (r6 == 0) goto Lba
            r5.v(r3, r1, r2)
        Lba:
            ta6 r1 = r7.x()
            if (r1 == 0) goto Ld4
            ja4 r1 = r1.A
            fb6 r2 = defpackage.bb6.r
            boolean r1 = r1.b(r2)
            if (r1 != r4) goto Ld4
            int r1 = r7.B
            r0.a(r1)
            int r0 = r7.B
            r5.v(r3, r0, r4)
        Ld4:
            zp4 r0 = r7.k0
            if (r0 == 0) goto Le3
            te r0 = (defpackage.te) r0
            rf5 r0 = r0.getRectManager()
            if (r0 == 0) goto Le3
            r0.f(r7)
        Le3:
            return
    }

    @Override // defpackage.nt
    public final void f(int r1, int r2, int r3) {
            r0 = this;
            java.lang.Object r0 = r0.L
            sm3 r0 = (defpackage.sm3) r0
            r0.L(r1, r2, r3)
            return
    }

    @Override // defpackage.nt
    public final void g(int r1, int r2) {
            r0 = this;
            java.lang.Object r0 = r0.L
            sm3 r0 = (defpackage.sm3) r0
            r0.Q(r1, r2)
            return
    }

    @Override // defpackage.nt
    public final void j() {
            r2 = this;
            java.util.ArrayList r0 = r2.B
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            r2.L = r0
            return
    }

    @Override // defpackage.nt
    public final /* bridge */ /* synthetic */ void k(int r1, java.lang.Object r2) {
            r0 = this;
            sm3 r2 = (defpackage.sm3) r2
            return
    }

    @Override // defpackage.nt
    public final void l() {
            r0 = this;
            java.lang.Object r0 = r0.A
            sm3 r0 = (defpackage.sm3) r0
            zp4 r0 = r0.k0
            if (r0 == 0) goto Ld
            te r0 = (defpackage.te) r0
            r0.u()
        Ld:
            return
    }

    @Override // defpackage.nt
    public final java.lang.Object m() {
            r0 = this;
            java.lang.Object r0 = r0.L
            return r0
    }
}
