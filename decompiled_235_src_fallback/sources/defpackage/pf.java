package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf  reason: default package */
/* loaded from: classes.dex */
public final class pf extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ pf(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public pf(defpackage.a74 r1, defpackage.zv0 r2, int r3) {
            r0 = this;
            r3 = 3
            r0.B = r3
            r0.L = r1
            r0.R = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.B
            r1 = 1
            r2 = 0
            jg7 r3 = defpackage.jg7.a
            java.lang.Object r4 = r6.R
            java.lang.Object r6 = r6.L
            switch(r0) {
                case 0: goto Ld7;
                case 1: goto L4f;
                case 2: goto L22;
                default: goto Ld;
            }
        Ld:
            px0 r7 = (defpackage.px0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            a74 r6 = (defpackage.a74) r6
            zv0 r4 = (defpackage.zv0) r4
            r8 = 49
            int r8 = defpackage.ii2.a0(r8)
            defpackage.vg6.a(r6, r4, r7, r8)
            return r3
        L22:
            xj0 r7 = (defpackage.xj0) r7
            ut2 r8 = (defpackage.ut2) r8
            eg4 r6 = (defpackage.eg4) r6
            sm3 r0 = r6.k0
            boolean r5 = r0.I()
            if (r5 == 0) goto L4c
            r6.F0 = r7
            r6.E0 = r8
            zp4 r7 = defpackage.vm3.a(r0)
            te r7 = (defpackage.te) r7
            bq4 r7 = r7.getSnapshotObserver()
            op5 r8 = defpackage.eg4.K0
            hh2 r8 = defpackage.hh2.d0
            dg4 r4 = (defpackage.dg4) r4
            qm6 r7 = r7.a
            r7.d(r6, r8, r4)
            r6.I0 = r2
            goto L4e
        L4c:
            r6.I0 = r1
        L4e:
            return r3
        L4f:
            px0 r7 = (defpackage.px0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r5 = 2
            if (r0 == r5) goto L5e
            r0 = r1
            goto L5f
        L5e:
            r0 = r2
        L5f:
            r8 = r8 & r1
            xq2 r7 = (defpackage.xq2) r7
            boolean r8 = r7.S(r8, r0)
            if (r8 == 0) goto Ld3
            ym3 r6 = (defpackage.ym3) r6
            vs4 r6 = r6.g
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r8 = r6.booleanValue()
            eo2 r4 = (defpackage.eo2) r4
            r7.e0(r6)
            boolean r6 = r7.g(r8)
            if (r8 == 0) goto L89
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.o(r7, r6)
            goto Lbe
        L89:
            int r8 = r7.l
            if (r8 != 0) goto L8e
            goto L93
        L8e:
            java.lang.String r8 = "No nodes can be emitted before calling deactivateToEndGroup"
            defpackage.tx0.a(r8)
        L93:
            boolean r8 = r7.S
            if (r8 != 0) goto Lbe
            if (r6 != 0) goto L9d
            r7.U()
            goto Lbe
        L9d:
            lk6 r6 = r7.G
            int r8 = r6.g
            int r6 = r6.h
            qx0 r0 = r7.M
            r0.getClass()
            r0.d(r2)
            rl0 r0 = r0.b
            co4 r0 = r0.m
            xm4 r1 = defpackage.xm4.d
            r0.h0(r1)
            java.util.ArrayList r0 = r7.s
            defpackage.hf.v(r8, r0, r6)
            lk6 r6 = r7.G
            r6.t()
        Lbe:
            boolean r6 = r7.y
            if (r6 == 0) goto Lcf
            lk6 r6 = r7.G
            int r6 = r6.i
            int r8 = r7.z
            if (r6 != r8) goto Lcf
            r6 = -1
            r7.z = r6
            r7.y = r2
        Lcf:
            r7.p(r2)
            goto Ld6
        Ld3:
            r7.V()
        Ld6:
            return r3
        Ld7:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            xa6 r8 = (defpackage.xa6) r8
            qf r4 = (defpackage.qf) r4
            ya6 r6 = (defpackage.ya6) r6
            q94 r6 = r6.b
            int r0 = r8.f
            boolean r6 = r6.c(r0)
            if (r6 != 0) goto Lf5
            r4.i(r7, r8)
            v80 r6 = r4.d0
            r6.c(r3)
        Lf5:
            return r3
    }
}
