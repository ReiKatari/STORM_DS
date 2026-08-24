package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xb4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ xb4(defpackage.jt3 r2, defpackage.nh2 r3, boolean r4, defpackage.p27 r5, defpackage.mk4 r6) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            r1.X = r5
            r1.Y = r6
            return
    }

    public /* synthetic */ xb4(defpackage.zg5 r2, defpackage.zg5 r3, defpackage.zb4 r4, boolean r5, defpackage.pu r6) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r1.B = r5
            r1.Y = r6
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            java.lang.Object r3 = r7.Y
            java.lang.Object r4 = r7.X
            boolean r5 = r7.B
            java.lang.Object r6 = r7.R
            java.lang.Object r7 = r7.L
            switch(r0) {
                case 0: goto L7c;
                default: goto L12;
            }
        L12:
            jt3 r7 = (defpackage.jt3) r7
            nh2 r6 = (defpackage.nh2) r6
            p27 r4 = (defpackage.p27) r4
            mk4 r3 = (defpackage.mk4) r3
            jk4 r8 = (defpackage.jk4) r8
            boolean r0 = r7.b()
            if (r0 != 0) goto L26
            defpackage.nh2.a(r6)
            goto L2f
        L26:
            xm6 r0 = r7.c
            if (r0 == 0) goto L2f
            bh1 r0 = (defpackage.bh1) r0
            r0.b()
        L2f:
            boolean r0 = r7.b()
            if (r0 == 0) goto L7b
            if (r5 == 0) goto L7b
            hv2 r0 = r7.a()
            hv2 r5 = defpackage.hv2.Selection
            if (r0 == r5) goto L78
            b47 r0 = r7.d()
            if (r0 == 0) goto L7b
            long r4 = r8.a
            yc1 r8 = r7.d
            w51 r6 = r7.v
            int r0 = r0.b(r4, r2)
            int r0 = r3.i(r0)
            java.lang.Object r8 = r8.A
            c37 r8 = (defpackage.c37) r8
            long r2 = defpackage.jx2.f(r0, r0)
            r0 = 5
            r4 = 0
            c37 r8 = defpackage.c37.a(r8, r4, r2, r0)
            r6.g(r8)
            d17 r8 = r7.a
            fp r8 = r8.a
            java.lang.String r8 = r8.B
            int r8 = r8.length()
            if (r8 <= 0) goto L7b
            hv2 r8 = defpackage.hv2.Cursor
            vs4 r7 = r7.k
            r7.setValue(r8)
            goto L7b
        L78:
            r4.g(r8)
        L7b:
            return r1
        L7c:
            zg5 r7 = (defpackage.zg5) r7
            zg5 r6 = (defpackage.zg5) r6
            zb4 r4 = (defpackage.zb4) r4
            pu r3 = (defpackage.pu) r3
            sb4 r8 = (defpackage.sb4) r8
            r8.getClass()
            r7.A = r2
            r6.A = r2
            r4.m(r8, r5, r3)
            return r1
    }
}
