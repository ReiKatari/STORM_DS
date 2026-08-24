package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg6  reason: default package */
/* loaded from: classes.dex */
public final class sg6 implements defpackage.sz3 {
    public final /* synthetic */ defpackage.sz3 A;
    public final defpackage.w61 B;
    public final defpackage.vs4 L;
    public final defpackage.pj R;
    public defpackage.jk3 X;
    public defpackage.jk3 Y;
    public final defpackage.mm6 Z;
    public final defpackage.om6 d0;

    public sg6(defpackage.sz3 r1, defpackage.w61 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r1)
            r0.L = r1
            pj r1 = new pj
            r2 = 17
            r1.<init>(r0, r2)
            r0.R = r1
            mm6 r1 = new mm6
            r1.<init>()
            r0.Z = r1
            om6 r1 = new om6
            r1.<init>()
            r0.d0 = r1
            return
    }

    public static defpackage.rg6 d(java.lang.String r2, defpackage.xq2 r3) {
            r0 = 800730162(0x2fba2c32, float:3.3864606E-10)
            r3.b0(r0)
            r0 = -148945892(0xfffffffff71f441c, float:-3.2302993E33)
            r3.b0(r0)
            boolean r0 = r3.f(r2)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L1a
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L22
        L1a:
            rg6 r1 = new rg6
            r1.<init>(r2)
            r3.l0(r1)
        L22:
            rg6 r1 = (defpackage.rg6) r1
            vs4 r2 = r1.b
            og6 r0 = defpackage.og6.a
            r2.setValue(r0)
            r2 = 0
            r3.p(r2)
            r3.p(r2)
            return r1
    }

    public static defpackage.a74 e(defpackage.sg6 r7, defpackage.a74 r8, defpackage.rg6 r9, defpackage.jo r10) {
            d90 r0 = defpackage.qg6.a
            r0.getClass()
            tg6 r5 = defpackage.vg6.b
            r7.getClass()
            ga7 r3 = r10.a()
            mn r1 = new mn
            r6 = 1
            r4 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            a74 r7 = defpackage.l.p(r8, r1)
            return r7
    }

    public final boolean a() {
            r0 = this;
            vs4 r0 = r0.L
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.sz3
    public final defpackage.jk3 b(defpackage.jk3 r1) {
            r0 = this;
            sz3 r0 = r0.A
            jk3 r0 = r0.b(r1)
            return r0
    }

    @Override // defpackage.sz3
    public final long c(defpackage.jk3 r1, defpackage.jk3 r2) {
            r0 = this;
            sz3 r0 = r0.A
            long r0 = r0.c(r1, r2)
            return r0
    }

    public final void f() {
            r7 = this;
            om6 r0 = r7.d0
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
            r3 = r2
        L12:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L35
            java.lang.Object r4 = r1.next()
            gf6 r4 = (defpackage.gf6) r4
            if (r3 != 0) goto L30
            boolean r3 = r4.a()
            if (r3 == 0) goto L2e
            boolean r3 = r4.d()
            if (r3 == 0) goto L2e
            goto L30
        L2e:
            r3 = r2
            goto L31
        L30:
            r3 = r5
        L31:
            r4.e()
            goto L12
        L35:
            boolean r1 = r7.a()
            if (r3 == r1) goto L9e
            vs4 r7 = r7.L
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r7.setValue(r1)
            if (r3 != 0) goto L9e
            java.util.Iterator r7 = r0.iterator()
        L4a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r7.next()
            gf6 r0 = (defpackage.gf6) r0
            java.util.List r1 = r0.c()
            int r1 = r1.size()
            if (r1 <= r5) goto L81
            java.util.List r1 = r0.c()
            int r3 = defpackage.jf6.a
            int r3 = r1.size()
            r4 = r2
        L6b:
            if (r4 >= r3) goto L81
            java.lang.Object r6 = r1.get(r4)
            if6 r6 = (defpackage.if6) r6
            x60 r6 = r6.d()
            boolean r6 = r6.b()
            if (r6 == 0) goto L7e
            goto L4a
        L7e:
            int r4 = r4 + 1
            goto L6b
        L81:
            mg5 r0 = r0.c
            r0.getClass()
            qp6 r1 = defpackage.qp6.NoRequest
            r0.f = r1
            java.lang.Object r1 = r0.e
            ss4 r1 = (defpackage.ss4) r1
            int r1 = r1.h()
            r0.a = r1
            java.lang.Object r0 = r0.d
            vs4 r0 = (defpackage.vs4) r0
            rf4 r1 = defpackage.rf4.a
            r0.setValue(r1)
            goto L4a
        L9e:
            return
    }
}
