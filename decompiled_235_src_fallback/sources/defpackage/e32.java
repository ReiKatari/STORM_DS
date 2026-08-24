package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e32  reason: default package */
/* loaded from: classes.dex */
public final class e32 implements defpackage.ne2 {
    public final /* synthetic */ defpackage.sz1 A;

    public e32(defpackage.sz1 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r5, defpackage.r41 r6) {
            r4 = this;
            lw1 r5 = (defpackage.lw1) r5
            sz1 r4 = r4.A
            tp6 r6 = r4.p0
            of6 r0 = r4.D0
            of6 r1 = r4.J0
            boolean r2 = r5 instanceof defpackage.gw1
            if (r2 == 0) goto L1c
            p26 r4 = new p26
            gw1 r5 = (defpackage.gw1) r5
            int r5 = r5.a
            r4.<init>(r5)
            r0.k(r4)
            goto L10f
        L1c:
            hw1 r2 = defpackage.hw1.a
            boolean r2 = defpackage.nb3.k(r5, r2)
            if (r2 == 0) goto L2b
            q26 r4 = defpackage.q26.a
            r0.k(r4)
            goto L10f
        L2b:
            boolean r0 = r5 instanceof defpackage.fw1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L74
            r4.U = r2
            kd6 r6 = r4.c
            fw1 r5 = (defpackage.fw1) r5
            me.magnum.melonds.domain.model.VideoRenderer r5 = r5.a
            ng6 r6 = (defpackage.ng6) r6
            me.magnum.melonds.domain.model.VideoRenderer r0 = r6.e()
            if (r0 != r5) goto L42
            r3 = r0
        L42:
            if (r3 == 0) goto L6a
            me.magnum.melonds.domain.model.VideoRenderer r4 = defpackage.sz1.x(r4)
            if (r4 == 0) goto L6a
            if (r4 == r5) goto L6a
            r6.getClass()
            android.content.SharedPreferences r6 = r6.b
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r4 = r4.name()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            java.lang.String r0 = "video_renderer"
            r6.putString(r0, r4)
            r6.apply()
        L6a:
            m77 r4 = new m77
            r4.<init>(r5)
            r1.k(r4)
            goto L10f
        L74:
            boolean r0 = r5 instanceof defpackage.kw1
            if (r0 == 0) goto Laa
            kw1 r5 = (defpackage.kw1) r5
            xq7 r4 = new xq7
            int r0 = r5.a
            int r1 = r5.b
            int r5 = r5.c
            r4.<init>(r0, r1, r5)
            java.lang.Object r5 = r6.getValue()
            hy1 r5 = (defpackage.hy1) r5
            boolean r0 = r5 instanceof defpackage.zx1
            if (r0 == 0) goto L9d
            zx1 r5 = (defpackage.zx1) r5
            in5 r5 = r5.b
            zx1 r0 = new zx1
            r0.<init>(r4, r5)
            r6.m(r3, r0)
            goto L10f
        L9d:
            boolean r5 = r5 instanceof defpackage.yx1
            if (r5 == 0) goto L10f
            yx1 r5 = new yx1
            r5.<init>(r4)
            r6.m(r3, r5)
            goto L10f
        Laa:
            boolean r0 = r5 instanceof defpackage.jw1
            if (r0 == 0) goto L112
            jw1 r5 = (defpackage.jw1) r5
            iw1 r5 = r5.a
            int[] r0 = defpackage.d32.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r2) goto Ld1
            r0 = 2
            if (r5 == r0) goto Lc7
            r0 = 3
            if (r5 != r0) goto Lc3
            goto Ld6
        Lc3:
            defpackage.i.d()
            return r3
        Lc7:
            boolean r5 = r4.U
            if (r5 != 0) goto Ld6
            y67 r5 = defpackage.y67.a
            r1.k(r5)
            goto Ld6
        Ld1:
            v67 r5 = defpackage.v67.a
            r1.k(r5)
        Ld6:
            java.lang.Object r5 = r6.getValue()
            hy1 r5 = (defpackage.hy1) r5
            boolean r0 = r5 instanceof defpackage.zx1
            if (r0 == 0) goto Lec
            r4.a1()
            r6.getClass()
            ay1 r4 = defpackage.ay1.a
            r6.m(r3, r4)
            goto L10f
        Lec:
            boolean r5 = r5 instanceof defpackage.yx1
            if (r5 == 0) goto L101
            r4.a1()
            xx1 r4 = new xx1
            me.magnum.melonds.MelonEmulator$a r5 = me.magnum.melonds.MelonEmulator.a.FIRMWARE_BAD
            r4.<init>(r5)
            r6.getClass()
            r6.m(r3, r4)
            goto L10f
        L101:
            s35 r5 = r4.V
            java.lang.Object r5 = r5.A
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            r5.set(r2)
            mc5 r5 = defpackage.mc5.TERMINAL_STOP
            r4.Q0(r5)
        L10f:
            jg7 r4 = defpackage.jg7.a
            return r4
        L112:
            defpackage.i.d()
            return r3
    }
}
