package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l27  reason: default package */
/* loaded from: classes.dex */
public final class l27 implements defpackage.g17 {
    public final /* synthetic */ defpackage.p27 a;

    public l27(defpackage.p27 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.g17
    public final void a(long r1, defpackage.ga6 r3) {
            r0 = this;
            r1 = 1
            p27 r0 = r0.a
            long r1 = r0.l(r1)
            long r1 = defpackage.pa6.a(r1)
            jt3 r3 = r0.d
            if (r3 == 0) goto L35
            b47 r3 = r3.d()
            if (r3 != 0) goto L16
            goto L35
        L16:
            long r1 = r3.e(r1)
            r0.o = r1
            jk4 r3 = new jk4
            r3.<init>(r1)
            vs4 r1 = r0.s
            r1.setValue(r3)
            r1 = 0
            r0.q = r1
            fv2 r1 = defpackage.fv2.Cursor
            vs4 r2 = r0.r
            r2.setValue(r1)
            r1 = 0
            r0.t(r1)
        L35:
            return
    }

    @Override // defpackage.g17
    public final void b() {
            r2 = this;
            p27 r2 = r2.a
            vs4 r0 = r2.r
            r1 = 0
            r0.setValue(r1)
            vs4 r2 = r2.s
            r2.setValue(r1)
            return
    }

    @Override // defpackage.g17
    public final void c() {
            r2 = this;
            p27 r2 = r2.a
            vs4 r0 = r2.r
            r1 = 0
            r0.setValue(r1)
            vs4 r2 = r2.s
            r2.setValue(r1)
            return
    }

    @Override // defpackage.g17
    public final void d() {
            r0 = this;
            return
    }

    @Override // defpackage.g17
    public final void e(long r5) {
            r4 = this;
            p27 r4 = r4.a
            long r0 = r4.q
            long r5 = defpackage.jk4.f(r0, r5)
            r4.q = r5
            jt3 r5 = r4.d
            if (r5 == 0) goto L7f
            b47 r5 = r5.d()
            if (r5 == 0) goto L7f
            long r0 = r4.o
            long r2 = r4.q
            long r0 = defpackage.jk4.f(r0, r2)
            jk4 r6 = new jk4
            r6.<init>(r0)
            vs4 r0 = r4.s
            r0.setValue(r6)
            mk4 r6 = r4.b
            jk4 r0 = r4.i()
            r0.getClass()
            long r0 = r0.a
            r2 = 1
            int r5 = r5.b(r0, r2)
            int r5 = r6.i(r5)
            long r5 = defpackage.jx2.f(r5, r5)
            c37 r0 = r4.n()
            long r0 = r0.b
            boolean r0 = defpackage.k47.b(r5, r0)
            if (r0 == 0) goto L4b
            goto L7f
        L4b:
            jt3 r0 = r4.d
            if (r0 == 0) goto L5e
            vs4 r0 = r0.q
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5e
            goto L69
        L5e:
            tv2 r0 = r4.k
            if (r0 == 0) goto L69
            r1 = 9
            lx4 r0 = (defpackage.lx4) r0
            r0.a(r1)
        L69:
            qn2 r0 = r4.c
            c37 r1 = r4.n()
            fp r1 = r1.a
            c37 r1 = defpackage.p27.e(r1, r5)
            r0.g(r1)
            k47 r0 = new k47
            r0.<init>(r5)
            r4.w = r0
        L7f:
            return
    }

    @Override // defpackage.g17
    public final void onCancel() {
            r0 = this;
            return
    }
}
