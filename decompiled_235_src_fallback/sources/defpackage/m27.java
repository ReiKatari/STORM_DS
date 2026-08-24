package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m27  reason: default package */
/* loaded from: classes.dex */
public final class m27 implements defpackage.g17 {
    public final /* synthetic */ defpackage.p27 a;
    public final /* synthetic */ boolean b;

    public m27(defpackage.p27 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.g17
    public final void a(long r1, defpackage.ga6 r3) {
            r0 = this;
            return
    }

    @Override // defpackage.g17
    public final void b() {
            r2 = this;
            p27 r2 = r2.a
            vs4 r0 = r2.r
            r1 = 0
            r0.setValue(r1)
            vs4 r0 = r2.s
            r0.setValue(r1)
            r0 = 1
            r2.t(r0)
            return
    }

    @Override // defpackage.g17
    public final void c() {
            r2 = this;
            p27 r2 = r2.a
            vs4 r0 = r2.r
            r1 = 0
            r0.setValue(r1)
            vs4 r0 = r2.s
            r0.setValue(r1)
            r0 = 1
            r2.t(r0)
            return
    }

    @Override // defpackage.g17
    public final void d() {
            r3 = this;
            boolean r0 = r3.b
            if (r0 == 0) goto L7
            fv2 r1 = defpackage.fv2.SelectionStart
            goto L9
        L7:
            fv2 r1 = defpackage.fv2.SelectionEnd
        L9:
            p27 r3 = r3.a
            vs4 r2 = r3.r
            r2.setValue(r1)
            long r0 = r3.l(r0)
            long r0 = defpackage.pa6.a(r0)
            jt3 r2 = r3.d
            if (r2 == 0) goto L49
            b47 r2 = r2.d()
            if (r2 != 0) goto L23
            goto L49
        L23:
            long r0 = r2.e(r0)
            r3.o = r0
            jk4 r2 = new jk4
            r2.<init>(r0)
            vs4 r0 = r3.s
            r0.setValue(r2)
            r0 = 0
            r3.q = r0
            r0 = -1
            r3.t = r0
            jt3 r0 = r3.d
            if (r0 == 0) goto L45
            vs4 r0 = r0.q
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L45:
            r0 = 0
            r3.t(r0)
        L49:
            return
    }

    @Override // defpackage.g17
    public final void e(long r10) {
            r9 = this;
            p27 r0 = r9.a
            long r1 = r0.q
            long r10 = defpackage.jk4.f(r1, r10)
            r0.q = r10
            long r1 = r0.o
            long r10 = defpackage.jk4.f(r1, r10)
            jk4 r1 = new jk4
            r1.<init>(r10)
            vs4 r10 = r0.s
            r10.setValue(r1)
            c37 r1 = r0.n()
            jk4 r10 = r0.i()
            r10.getClass()
            long r2 = r10.a
            fa6 r6 = defpackage.xd5.r0
            uv2 r8 = new uv2
            r10 = 9
            r8.<init>(r10)
            r4 = 0
            boolean r5 = r9.b
            r7 = 1
            defpackage.p27.c(r0, r1, r2, r4, r5, r6, r7, r8)
            r9 = 0
            r0.t(r9)
            return
    }

    @Override // defpackage.g17
    public final void onCancel() {
            r0 = this;
            return
    }
}
