package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y12  reason: default package */
/* loaded from: classes.dex */
public final class y12 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.sz1 Y;
    public final /* synthetic */ me.magnum.melonds.domain.model.ConsoleType Z;

    public y12(defpackage.sz1 r1, me.magnum.melonds.domain.model.ConsoleType r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            y12 r0 = (defpackage.y12) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            y12 r3 = new y12
            sz1 r0 = r1.Y
            me.magnum.melonds.domain.model.ConsoleType r1 = r1.Z
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            sz1 r0 = r10.Y
            tp6 r1 = r0.p0
            o41 r2 = r0.z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r10.X
            r5 = 3
            me.magnum.melonds.domain.model.ConsoleType r6 = r10.Z
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L24
            if (r4 == r8) goto L20
            if (r4 != r7) goto L1a
            defpackage.oi2.Y(r11)
            goto L88
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r9
        L20:
            defpackage.oi2.Y(r11)
            goto L71
        L24:
            defpackage.oi2.Y(r11)
            hz1 r11 = new hz1
            r4 = 22
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            hz1 r11 = new hz1
            r4 = 25
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            hz1 r11 = new hz1
            r4 = 24
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            hz1 r11 = new hz1
            r4 = 23
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            tp6 r11 = r0.r0
            r11.l(r9)
            hz1 r11 = new hz1
            r4 = 20
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            hz1 r11 = new hz1
            r4 = 19
            r11.<init>(r4, r9, r0)
            defpackage.hv.L(r2, r9, r9, r11, r5)
            r10.X = r8
            java.lang.Object r11 = defpackage.sz1.i(r0, r9, r10)
            if (r11 != r3) goto L71
            goto L87
        L71:
            jh r11 = r0.v
            r10.X = r7
            r11.getClass()
            xe1 r4 = defpackage.xk1.a
            de1 r4 = defpackage.de1.L
            bh r7 = new bh
            r7.<init>(r11, r6, r9)
            java.lang.Object r11 = defpackage.hv.d0(r4, r7, r10)
            if (r11 != r3) goto L88
        L87:
            return r3
        L88:
            bd2 r11 = (defpackage.bd2) r11
            boolean r10 = r11 instanceof defpackage.zc2
            if (r10 == 0) goto L9e
            xx1 r10 = new xx1
            zc2 r11 = (defpackage.zc2) r11
            me.magnum.melonds.MelonEmulator$a r11 = r11.a
            r10.<init>(r11)
            r1.getClass()
            r1.m(r9, r10)
            goto Lb9
        L9e:
            ad2 r10 = defpackage.ad2.a
            boolean r10 = defpackage.nb3.k(r11, r10)
            if (r10 == 0) goto Lbc
            cy1 r10 = new cy1
            r10.<init>(r6)
            r1.getClass()
            r1.m(r9, r10)
            p12 r10 = new p12
            r10.<init>(r8, r9, r0)
            defpackage.hv.L(r2, r9, r9, r10, r5)
        Lb9:
            jg7 r10 = defpackage.jg7.a
            return r10
        Lbc:
            defpackage.i.d()
            return r9
    }
}
