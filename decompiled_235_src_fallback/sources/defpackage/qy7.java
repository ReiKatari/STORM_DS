package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy7  reason: default package */
/* loaded from: classes.dex */
public final class qy7 implements defpackage.gi7 {
    public final defpackage.oy7 a;
    public final float b;
    public final float c;
    public final defpackage.ex6 d;
    public final defpackage.ex6 e;
    public boolean f;
    public defpackage.li7 g;
    public defpackage.tu0 h;

    public qy7(defpackage.oy7 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            float r0 = r2.c()
            r1.b = r0
            float r2 = r2.a()
            r1.c = r2
            py7 r2 = new py7
            r0 = 0
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.d = r0
            py7 r2 = new py7
            r0 = 1
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.e = r0
            return
    }

    public final defpackage.gx3 a(defpackage.ry7 r4, boolean r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "Job.asListenableFuture"
            r4.getClass()
            tu0 r1 = new tu0
            r1.<init>()
            tu0 r2 = r3.h
            if (r2 == 0) goto L19
            if (r5 == 0) goto L16
            java.lang.String r5 = "Cancelled due to another zoom value being set."
            defpackage.i61.A(r5, r2)
            goto L19
        L16:
            defpackage.nc1.a0(r1, r2)
        L19:
            r3.h = r1
            boolean r5 = defpackage.nj2.x()
            ex6 r2 = r3.e
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r2.getValue()
            s94 r5 = (defpackage.s94) r5
            r5.f(r4)
            goto L36
        L2d:
            java.lang.Object r5 = r2.getValue()
            s94 r5 = (defpackage.s94) r5
            r5.g(r4)
        L36:
            li7 r4 = r3.g
            if (r4 == 0) goto L4b
            oy7 r3 = r3.a
            if (r6 == 0) goto L43
            jg1 r3 = r3.e(r4)
            goto L47
        L43:
            jg1 r3 = r3.d(r4)
        L47:
            defpackage.nc1.a0(r3, r1)
            goto L50
        L4b:
            java.lang.String r3 = "Camera is not active."
            defpackage.i61.A(r3, r1)
        L50:
            qb0 r3 = new qb0
            r3.<init>()
            hl5 r4 = new hl5
            r4.<init>()
            r3.c = r4
            tb0 r4 = new tb0
            r4.<init>(r3)
            r3.b = r4
            java.lang.Class<h61> r5 = defpackage.h61.class
            r3.a = r5
            k0 r5 = new k0     // Catch: java.lang.Exception -> L74
            r6 = 17
            r5.<init>(r3, r6)     // Catch: java.lang.Exception -> L74
            r1.a0(r5)     // Catch: java.lang.Exception -> L74
            r3.a = r0     // Catch: java.lang.Exception -> L74
            goto L78
        L74:
            r3 = move-exception
            r4.b(r3)
        L78:
            gx3 r3 = defpackage.l.F(r4)
            return r3
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r4) {
            r3 = this;
            r3.g = r4
            ex6 r4 = r3.e
            java.lang.Object r4 = r4.getValue()
            s94 r4 = (defpackage.s94) r4
            java.lang.Object r4 = r4.c()
            ry7 r4 = (defpackage.ry7) r4
            if (r4 != 0) goto L1a
            ex6 r4 = r3.d
            java.lang.Object r4 = r4.getValue()
            ry7 r4 = (defpackage.ry7) r4
        L1a:
            boolean r0 = r3.f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L25
            r4.getClass()
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            r3.a(r4, r2, r0)
            r3.f = r1
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r2 = this;
            ex6 r0 = r2.d
            java.lang.Object r0 = r0.getValue()
            ry7 r0 = (defpackage.ry7) r0
            r1 = 1
            r2.a(r0, r1, r1)
            return
    }
}
